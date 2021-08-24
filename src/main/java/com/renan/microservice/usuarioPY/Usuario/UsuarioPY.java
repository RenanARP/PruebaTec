package com.renan.microservice.usuarioPY.Usuario;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UPY")
public class UsuarioPY {
	
	@Id
	public String id;
	public String nombre;
	public String estadocivil;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	
	public UsuarioPY(String id, String nombre, String estadocivil) {
		this.id = id;
		this.nombre = nombre;
		this.estadocivil = estadocivil;
	}
	
	
	
}
