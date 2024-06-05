package ar.edu.unju.fi.model;

public class Materia {
	private String cod;
	private String nombre;
	private String curso;
	private Integer cantHoras;
	private String modalidad;
	private Docente docente;
	private String carrera;
	private Boolean status;
	
	public Materia() {
		
	}
	
	public Materia(String cod, String nombre, String curso, Integer cantHoras, String modalidad, Docente docente,
			String carrera) {
		this.cod = cod;
		this.nombre = nombre;
		this.curso = curso;
		this.cantHoras = cantHoras;
		this.modalidad = modalidad;
		this.docente = docente;
		this.carrera = carrera;
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
	public void setDocente(Docente docente) {
		this.docente = docente;
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
