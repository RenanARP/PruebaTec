package com.renan.microservice.usuarioMS.DBase;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.renan.microservice.usuarioMS.Usuarios.UsuarioExterno;

@Repository
public interface UsuarioExtDB extends MongoRepository<UsuarioExterno, String> {
	
}