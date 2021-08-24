package com.renan.microservice.usuarioMS.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renan.microservice.usuarioMS.DBase.UsuarioExtDB;
import com.renan.microservice.usuarioMS.Usuarios.UsuarioExterno;

@Service
public class ServiciosUExt {
	@Autowired
    private UsuarioExtDB UExtDB;
	
    public UsuarioExterno crearUExt(UsuarioExterno UExt) {
        return UExtDB.save(UExt);
    }    
    
    public List<UsuarioExterno>CUExterno() {
        return UExtDB.findAll();
    }
    
    public UsuarioExterno consultaId(UsuarioExterno UExt) {
        return UExtDB.findById(UExt.getId()).orElse(null);
    }

}
