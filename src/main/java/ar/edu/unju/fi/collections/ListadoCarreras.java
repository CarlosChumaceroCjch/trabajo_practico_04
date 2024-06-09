package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Carrera;

public class ListadoCarreras {

	public static List<Carrera> carreras = new ArrayList<Carrera>();

	// Listar carreras
	public static List<Carrera> listarCarreras() {

		List<Carrera> carrerasVal = new ArrayList<Carrera>();
		for (int i = 0; i < carreras.size(); i++) {
			Carrera carrera = carreras.get(i);
			if (carrera.getStatus() == true) {
				carrerasVal.add(carrera);
			}

		}

		return carrerasVal;
	}

	// Metodo para buscar por ID

	public static Carrera buscaCarreraCod(String cod) {
		for (Carrera c : carreras) {
			if (c.getCodigo().equals(cod)) {
				return c;
			}
		}
		return null;
	}

	// Agregar Carrera
	public static void agCarrera(Carrera c) {
		carreras.add(c);
		// agregar estado
		c.setStatus(true);
	}

	// Modificar Carrera

	public static void modificarCarrera(Carrera carMod) {
		carMod.setStatus(true);
		for (int i = 0; i < carreras.size(); i++) {
			Carrera carrera = carreras.get(i);
			if (carrera.getCodigo().equals(carMod.getCodigo())) {
				carreras.set(i, carMod);
				break;
			}
		}
	}

	// Eliminar Carrera
	public static void eliminarCarrera(String codigo) {
		// Borrado Fisico
		// carreras.removeIf(carrera ->carrera.getCodigo().equals(codigo));

		// Borrado Logico
		for (int i = 0; i < carreras.size(); i++) {
			Carrera carrera = carreras.get(i);
			if (carrera.getCodigo().equals(codigo)) {
				carrera.setStatus(false);
				break;
			}
		}
	}

}
