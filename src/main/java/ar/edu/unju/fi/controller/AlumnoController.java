package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.ListadoAlumnos;
import ar.edu.unju.fi.model.Alumno;

@Controller
public class AlumnoController {
	@Autowired
	Alumno nuevoAlumno = new Alumno();
	
	@GetMapping("/formularioAlumno")
	public ModelAndView getformAlumno() {
		ModelAndView modelView = new ModelAndView("formAlumno");
		
		modelView.addObject("nuevoAlumno",nuevoAlumno);
		
		return modelView;
	}
	
	@PostMapping("/guardarAlumno")
	public ModelAndView saveAlumno(@ModelAttribute("nuevoAlumno") Alumno a) {

		ListadoAlumnos.agAlumno(a);
		
		//mostrar la vista (el Html)
		ModelAndView modelView= new ModelAndView("listaDeAlumnos");
		modelView.addObject("listadoAlumnos",ListadoAlumnos.listarAlumnos());
		
		return modelView;
		
	}
	
	@GetMapping("/eliminarAlumno/{lu}")
	public ModelAndView eliminarAlumnoDeLista(@PathVariable(name="lu") Integer lu) {
		//Borrar
		ListadoAlumnos.eliminarAlumno(lu);
		
		//Mostrar Nuevo Listadp
		ModelAndView modelView = new ModelAndView("listaDeAlumnos");
		modelView.addObject("listadoAlumnos",ListadoAlumnos.listarAlumnos());
		
		return modelView;
	}
}
