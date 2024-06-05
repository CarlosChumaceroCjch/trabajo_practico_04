package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Alumno;

public class ListadoAlumnos {
	public static List<Alumno> alumnos = new ArrayList<Alumno>();
	
	//Listar carreras
		public static List<Alumno> listarAlumnos(){
			return alumnos;
		}
		
		//Metodo para buscar por ID
		
		public static Alumno buscarAlumnoLu(Integer lu) {
			for (Alumno a:alumnos) {
				if(a.getLu()==lu) {
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
			for (int i=0;i<alumnos.size();i++) {
				Alumno alumno =alumnos.get(i);
				if (alumno.getLu()==alMod.getLu()) {
					alumnos.set(i, alMod);
					break;
				}
			}
		}
		
		//Eliminar Carrera
		public static void eliminarAlumno(Integer lu) {
			alumnos.removeIf(alumno ->alumno.getLu()==lu);
		}
}
