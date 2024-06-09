package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unju.fi.model.Docente;

public class ListadoDocentes {
	public static List<Docente> docentes = new ArrayList<Docente>();
	
	public static List<Docente> listarDocentes(){
		return docentes.stream().filter(d->d.getStatus()==true).collect(Collectors.toList());
	}
	
	public static Docente buscarDocenteLeg(String legajo) {
		for(Docente d: docentes) {
			if(d.getLegajo().equals(legajo)) {
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
		docMod.setStatus(true);
		for(int i=0;i<docentes.size();i++) {
			Docente docente = docentes.get(i);
			if(docente.getLegajo().equals(docMod.getLegajo())){
				docentes.set(i, docMod);
				break;
			}
		}
	}
	
	public static void eliminarDocente(String legajo) {
		for (int i = 0; i < docentes.size(); i++) {
			Docente docente = docentes.get(i);
			if (docente.getLegajo().equals(legajo)) {
				docente.setStatus(false);
				break;
			}
		}
	}
}
