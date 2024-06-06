package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Alumno {
	private Integer dni;
	private String nombre;
	private String apellido;
	private String email;
	private String tel;
	private LocalDate fecNac;
	private String domicilio;
	private Integer lu;
	private Boolean status;
	
	public Alumno() {
		
	}
	
	public Alumno(Integer dni, String nombre, String apellido, String email, String tel, LocalDate fecNac,
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
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
	
	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
}
