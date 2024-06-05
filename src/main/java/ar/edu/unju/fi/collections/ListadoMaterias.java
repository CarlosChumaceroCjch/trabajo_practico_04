package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Materia;

public class ListadoMaterias {
	public static List<Materia> materias=new ArrayList<Materia>();
	
	
	public static List<Materia> listadoMaterias(){
		return materias;
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
	
	public static void eliminarmateria(String cod) {
		materias.removeIf(materia ->materia.getCod().equals(cod));
	}
	
}
