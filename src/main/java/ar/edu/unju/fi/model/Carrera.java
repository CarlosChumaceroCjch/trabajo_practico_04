package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Carrera {
	private String codigo;
	private String nombre;
	private Integer cantAnios;
	private Boolean status;
	
	public Carrera () {
		
	}

	
	
	public Carrera(String codigo, String nombre, Integer cantAnios, Boolean status) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantAnios = cantAnios;
		this.status = status;
	}



	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantAnios() {
		return cantAnios;
	}

	public void setCantAnios(Integer cantAnios) {
		this.cantAnios = cantAnios;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
}
