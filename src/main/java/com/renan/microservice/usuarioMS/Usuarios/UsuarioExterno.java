package com.renan.microservice.usuarioMS.Usuarios;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UsuarioExterno")
public class UsuarioExterno {
	
	@Id
	public String id;
	public String nombre;
	public String estadocivil;
	
	public String vacuna;
	public String centrovacunacion;
	public String vacunador;
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
	public String getVacuna() {
		return vacuna;
	}
	public void setVacuna(String vacuna) {
		this.vacuna = vacuna;
	}
	public String getCentrovacunacion() {
		return centrovacunacion;
	}
	public void setCentrovacunacion(String centrovacunacion) {
		this.centrovacunacion = centrovacunacion;
	}
	public String getVacunador() {
		return vacunador;
	}
	public void setVacunador(String vacunador) {
		this.vacunador = vacunador;
	}
	public UsuarioExterno(String id, String nombre, String estadocivil, String vacuna, String centrovacunacion,
			String vacunador) {
		this.id = id;
		this.nombre = nombre;
		this.estadocivil = estadocivil;
		this.vacuna = vacuna;
		this.centrovacunacion = centrovacunacion;
		this.vacunador = vacunador;
	}
}
