package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.collections.ListadoDocentes;

@Component
public class Materia {
	private String cod;
	private String nombre;
	private String curso;
	private Integer cantHoras;
	private String modalidad;
	private Docente docente;
		private Integer legDoc;
	private String carrera;
	private Boolean status;
	
	public Materia() {
		
	}
	
	public Materia(String cod, String nombre, String curso, Integer cantHoras, String modalidad, Integer legDoc,
			String carrera) {
		this.cod = cod;
		this.nombre = nombre;
		this.curso = curso;
		this.cantHoras = cantHoras;
		this.modalidad = modalidad;
		this.legDoc =legDoc;
		this.carrera = carrera;
	//Legajo para asignar al docente a cargo de la amteria a partir de su legajo
	//Facilita el ignreso de datos en el formulario
	}
	public Integer getLegDoc() {
		return legDoc;
	}

	public void setLegDoc(Integer legDoc) {
		this.legDoc = legDoc;
	}

	
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Integer getCantHoras() {
		return cantHoras;
	}
	public void setCantHoras(Integer cantHoras) {
		this.cantHoras = cantHoras;
	}
	public String getModalidad() {
		return modalidad;
	}
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}
	public Docente getDocente() {
		return docente;
	}
	public void setDocente() {
		this.docente =ListadoDocentes.buscarDocenteLeg(legDoc);
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
}
