package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;

public class ListadoMaterias {
	public static List<Materia> materias=new ArrayList<Materia>();
	
	
	public static List<Materia> listadoMaterias(){
		List<Materia> materiasVal=new ArrayList<Materia>();
		for (int i = 0; i < materias.size(); i++) {
			Materia materia = materias.get(i);
			if (materia.getStatus() == true) {
				materiasVal.add(materia);
			}

		}

		return materiasVal;
	}
	
	public static Materia buscarMateriaCod(String cod) {
		for (Materia m:materias) {
			if(m.getCod().equals(cod)) {
				return m;
			}
		}
		return null;
	}
	
	public static void agMateria(Materia m) {
		materias.add(m);
		//agregar estado
		m.setStatus(true);
	}
	
	public static void modificarMateria(Materia matMod ) {
		for (int i=0;i<materias.size();i++) {
			Materia materia =materias.get(i);
			if (materia.getCod().equals(matMod.getCod())) {
				materias.set(i, matMod);
				break;
			}
		}
	}
	
	public static void eliminarMateria(String cod) {
		for (int i = 0; i < materias.size(); i++) {
			Materia materia = materias.get(i);
			if (materia.getCod().equals(cod)) {
				materia.setStatus(false);
				break;
			}
		}
	}
	
}
