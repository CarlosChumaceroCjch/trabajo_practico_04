package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Alumno {
	private Integer dni;
	private String nombre;
	private String apellido;
	private String email;
	private Integer tel;
	private LocalDate fecNac;
	private String domicilio;
	private Integer lu;
	
	public Alumno() {
		
	}
	
	public Alumno(Integer dni, String nombre, String apellido, String email, Integer tel, LocalDate fecNac,
			String domicilio, Integer lu) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.tel = tel;
		this.fecNac = fecNac;
		this.domicilio = domicilio;
		this.lu = lu;
	}



	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getTel() {
		return tel;
	}
	public void setTel(Integer tel) {
		this.tel = tel;
	}
	public LocalDate getFecNac() {
		return fecNac;
	}
	public void setFecNac(LocalDate fecNac) {
		this.fecNac = fecNac;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public Integer getLu() {
		return lu;
	}
	public void setLu(Integer lu) {
		this.lu = lu;
	}
	
	
}
