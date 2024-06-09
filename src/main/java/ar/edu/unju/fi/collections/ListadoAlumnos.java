package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unju.fi.model.Alumno;

public class ListadoAlumnos {
	public static List<Alumno> alumnos = new ArrayList<Alumno>();
	
	//Listar carreras
		public static List<Alumno> listarAlumnos(){
			return alumnos.stream().filter(a->a.getStatus()==true).collect(Collectors.toList());
		}
		
		//Metodo para buscar por ID
		
		public static Alumno buscarAlumnoLu(String lu) {
			for (Alumno a:alumnos) {
				if(a.getLu().equals(lu)) {
					return a;
				}
			}
			return null;
		}
		
		//Agregar Carrera
		public static void agAlumno(Alumno a) {
			alumnos.add(a);
			//agregar estado
			a.setStatus(true);
		}
		
		//Modificar Carrera
		
		public static void modificarAlumno(Alumno alMod ) {
			alMod.setStatus(true);
			for (int i=0;i<alumnos.size();i++) {
				Alumno alumno =alumnos.get(i);
				if (alumno.getLu()==alMod.getLu()) {
					alumnos.set(i, alMod);
					break;
				}
			}
		}
		
		//Eliminar Carrera
		public static void eliminarAlumno(String lu) {
			for (int i = 0; i < alumnos.size(); i++) {
				Alumno alumno = alumnos.get(i);
				if (alumno.getLu().equals(lu)) {
					alumno.setStatus(false);
					break;
				}
			}
		}
}
