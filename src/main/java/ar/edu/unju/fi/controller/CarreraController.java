package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.ListadoCarreras;
import ar.edu.unju.fi.model.Carrera;

@Controller
public class CarreraController {
	
	@GetMapping("/formularioCarrera")
	public ModelAndView getFormCarrera() {
		//Vista
		ModelAndView modelView= new ModelAndView("formCarrera");
		//Objeto
		modelView.addObject("nuevaCarrera",new Carrera());
		
		return modelView;
		
	}
	@PostMapping("/guardarCarrera")
	public ModelAndView saveCarrera(@ModelAttribute("nuevaCarrera") Carrera carrera) {

		//Guardado de carrera
		ListadoCarreras.agCarrera(carrera);
		
		//mostrar la vista
		ModelAndView modelView= new ModelAndView("listaDeCarreras");
		modelView.addObject("listaCarreras",ListadoCarreras.listarCarreras());
		
		return modelView;
		
	}
}
