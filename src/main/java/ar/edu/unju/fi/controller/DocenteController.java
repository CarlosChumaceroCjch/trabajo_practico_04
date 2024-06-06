package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.ListadoDocentes;
import ar.edu.unju.fi.model.Docente;

@Controller
public class DocenteController {
	@Autowired
	Docente nuevoDocente = new Docente();
	
	@GetMapping("/formularioDocente")
	public ModelAndView getformDocente() {
		ModelAndView modelView = new ModelAndView("formDocente");
		
		modelView.addObject("nuevoDocente",nuevoDocente);
		
		return modelView;
	}
	
	@PostMapping("/guardarDocente")
	public ModelAndView saveADocente(@ModelAttribute("nuevoDocente") Docente d) {

		//Guardado de carrera
		ListadoDocentes.agDocente(d);
		
		//mostrar la vista (el Html)
		ModelAndView modelView= new ModelAndView("listaDeDocentes");
		modelView.addObject("listadoDocentes",ListadoDocentes.listarDocentes());
		
		return modelView;
		
	}
	
	@GetMapping("/eliminarDocente/{legajo}")
	public ModelAndView eliminarDocenteDeLista(@PathVariable(name="legajo") Integer legajo) {
		//Borrar
		ListadoDocentes.eliminarDocente(legajo);
		
		//Mostrar Nuevo Listadp
		ModelAndView modelView = new ModelAndView("listaDeDocentes");
		modelView.addObject("listadoDocentes",ListadoDocentes.listarDocentes());
		
		return modelView;
	}
}
