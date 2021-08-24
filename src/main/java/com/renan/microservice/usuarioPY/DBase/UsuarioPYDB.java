package com.renan.microservice.usuarioPY.DBase;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.renan.microservice.usuarioPY.Usuario.UsuarioPY;

@Repository
public interface UsuarioPYDB  extends MongoRepository<UsuarioPY, Integer>{

}