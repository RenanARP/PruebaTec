package com.renan.microservice.usuarioMS.Usuarios;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UsuarioInterno")
public class UsuarioInterno {
	
	@Id
	public String id;
	public String nombre;
	public String estadocivil;

	public String nacionalidad;
	public String sexo;
	public String profesion;
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
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public UsuarioInterno(String id, String nombre, String estadocivil, String nacionalidad, String sexo,
			String profesion) {
		this.id = id;
		this.nombre = nombre;
		this.estadocivil = estadocivil;
		this.nacionalidad = nacionalidad;
		this.sexo = sexo;
		this.profesion = profesion;
	}
	
}
