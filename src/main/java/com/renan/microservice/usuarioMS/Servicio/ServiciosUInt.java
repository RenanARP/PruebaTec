package com.renan.microservice.usuarioMS.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renan.microservice.usuarioMS.DBase.UsuarioIntDB;
import com.renan.microservice.usuarioMS.Usuarios.UsuarioInterno;

@Service
public class ServiciosUInt {
	@Autowired
	private UsuarioIntDB UIntDB;
	
	public UsuarioInterno crearUInt(UsuarioInterno UInt) {
		return UIntDB.save(UInt);
	}
	
	public List<UsuarioInterno>CUInterno() {
		return UIntDB.findAll();
	}
	
	public UsuarioInterno consultaId(UsuarioInterno UInt) {
		return UIntDB.findById(UInt.getId()).orElse(null);
	}

}
