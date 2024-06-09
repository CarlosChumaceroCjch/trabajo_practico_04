package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.ListadoCarreras;
import ar.edu.unju.fi.collections.ListadoDocentes;
import ar.edu.unju.fi.collections.ListadoMaterias;
import ar.edu.unju.fi.model.Materia;

@Controller
public class MateriaController {
	@Autowired
	Materia nuevaMateria = new Materia();
	
	@GetMapping("/formularioMateria")
	public ModelAndView getformMateria() {
		ModelAndView modelView = new ModelAndView("formMateria");
		
		modelView.addObject("nuevaMateria",nuevaMateria);
		modelView.addObject("listadoDocentes",ListadoDocentes.listarDocentes());
		modelView.addObject("listadoCarreras", ListadoCarreras.listarCarreras());
		return modelView;
	}
	
	@PostMapping("/guardarMateria")
	public ModelAndView saveMateria(@ModelAttribute("nuevaMateria") Materia m) {

		//Guardado
		m.setDocente(ListadoDocentes.buscarDocenteLeg(m.getDocente().getLegajo()));
		m.setCarrera(ListadoCarreras.buscaCarreraCod(m.getCarrera().getCodigo()));
		ListadoMaterias.agMateria(m);;
		//mostrar la vista (el Html)
		ModelAndView modelView= new ModelAndView("listaDematerias");
		modelView.addObject("listadoMaterias",ListadoMaterias.listadoMaterias());
		
		return modelView;
		
	}
	
	@GetMapping("/eliminarMateria/{cod}")
	public ModelAndView eliminarMateriaDeLista(@PathVariable(name="cod") String cod) {
		//Borrar
		ListadoMaterias.eliminarMateria(cod);
		
		//Mostrar Nuevo Listadp
		ModelAndView modelView = new ModelAndView("listaDeMaterias");
		modelView.addObject("listadoMaterias",ListadoMaterias.listadoMaterias());
		
		return modelView;
	}
}
