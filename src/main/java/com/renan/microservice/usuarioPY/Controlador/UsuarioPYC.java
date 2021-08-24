package com.renan.microservice.usuarioPY.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.renan.microservice.usuarioPY.Usuario.UsuarioPY;
import com.renan.microservice.usuarioPY.Servicio.ServiciosUPY;

@RestController
@RequestMapping(path = "/usuarioPY")
public class UsuarioPYC {
	
	@Autowired
    private ServiciosUPY UsrPy;
	
	@PostMapping(value = "/postCUPY")
    public @ResponseBody
    UsuarioPY saveInterno(@RequestBody UsuarioPY UsuarioPY) {
        return UsrPy.crearUPY(UsuarioPY);
    }

    @GetMapping("/getUPY")
    public @ResponseBody
    List<UsuarioPY> consultExterno() {
        return UsrPy.CUPY();
    }
}