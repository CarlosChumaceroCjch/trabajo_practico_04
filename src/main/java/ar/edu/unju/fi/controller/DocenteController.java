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
		modelView.addObject("flag", false);
		return modelView;
	}
	
	@GetMapping("/listaDeDocentes")
	public ModelAndView Lista() {
		ModelAndView modelView= new ModelAndView("listaDeDocentes");
		modelView.addObject("listadoDocentes",ListadoDocentes.listarDocentes());
		return modelView;
	}
	
	@PostMapping("/guardarDocente")
	public ModelAndView saveADocente(@ModelAttribute("nuevoDocente") Docente d) {

		ListadoDocentes.agDocente(d);
		
		ModelAndView modelView= new ModelAndView("listaDeDocentes");
		modelView.addObject("listadoDocentes",ListadoDocentes.listarDocentes());
		
		return modelView;
		
	}
	
	@GetMapping("/eliminarDocente/{legajo}")
	public ModelAndView eliminarDocenteDeLista(@PathVariable(name="legajo") String legajo) {
		//Borrar
		ListadoDocentes.eliminarDocente(legajo);
		
		//Mostrar Nuevo Listadp
		ModelAndView modelView = new ModelAndView("listaDeDocentes");
		modelView.addObject("listadoDocentes",ListadoDocentes.listarDocentes());
		
		return modelView;
	}
	
	@GetMapping("/modificarDocente/{legajo}")
	public ModelAndView modificarDocente(@PathVariable(name="legajo")String legajo) {
		Docente docente = ListadoDocentes.buscarDocenteLeg(legajo);
		ModelAndView modelView =new ModelAndView("formDocente");
		modelView.addObject("nuevoDocente",docente);
		modelView.addObject("flag", true);		
		return modelView;
	}
	
	@PostMapping("/modificarDocente")
	public ModelAndView modifcarDocente(@ModelAttribute("nuevoDocente") Docente dMod)
	{	ListadoDocentes.modificarDocente(dMod);
		ModelAndView modelView = new ModelAndView("listaDeDocentes");
		modelView.addObject("listadoDocentes",ListadoDocentes.listarDocentes());
		return modelView;
		
	}
}
