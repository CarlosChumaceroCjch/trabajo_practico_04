package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Docente;

public class ListadoDocentes {
	public static List<Docente> docentes = new ArrayList<Docente>();
	
	public static List<Docente> listarDocentes(){
		return docentes;
	}
	
	public static Docente buscarDocenteLeg(String leg) {
		for(Docente d: docentes) {
			if(d.getLegajo().equals(leg)) {
				return d;
			}
		}
		return null;
	}
	
	public static void agDocente(Docente d) {
		docentes.add(d);
		d.setStatus(true);
	}
	
	public static void modificarDocente(Docente docMod) {
		for(int i=0;i<docentes.size();i++) {
			Docente docente = docentes.get(i);
			if(docente.getLegajo().equals(docMod.getLegajo())){
				docentes.set(i, docMod);
				break;
			}
		}
	}
	
	public static void eliminarDocente(String leg) {
		docentes.removeIf(docente->docente.getLegajo().equals(leg));
	}
}
