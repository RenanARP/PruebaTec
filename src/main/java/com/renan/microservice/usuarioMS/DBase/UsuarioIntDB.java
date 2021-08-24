package com.renan.microservice.usuarioMS.DBase;

import com.renan.microservice.usuarioMS.Usuarios.UsuarioInterno;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioIntDB extends MongoRepository<UsuarioInterno, String>{

}