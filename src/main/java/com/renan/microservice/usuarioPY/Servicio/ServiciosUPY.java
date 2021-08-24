package com.renan.microservice.usuarioPY.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renan.microservice.usuarioPY.DBase.UsuarioPYDB;
import com.renan.microservice.usuarioPY.Usuario.UsuarioPY;

@Service
public class ServiciosUPY {
	@Autowired
	private UsuarioPYDB UPYDB;
	
	public UsuarioPY crearUPY(UsuarioPY UPY) {
		return UPYDB.save(UPY);
	}
	
	public List<UsuarioPY>CUPY() {
		return UPYDB.findAll();
	}
}
