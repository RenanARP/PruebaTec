package com.renan.microservice.usuarioMS.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.renan.microservice.usuarioMS.Servicio.ServiciosUInt;
import com.renan.microservice.usuarioMS.Usuarios.UsuarioInterno;

@RestController
@RequestMapping(path = "/usuarioMS")
public class UsuarioInternoC {
	@Autowired
    private ServiciosUInt SUInt;
	
	@PostMapping(value = "/postCUInterno")
    public @ResponseBody
    UsuarioInterno saveInterno(@RequestBody UsuarioInterno UsuarioInterno) {
        return SUInt.crearUInt(UsuarioInterno);
    }
	
	@GetMapping("/getUInterno")
    public @ResponseBody
    List<UsuarioInterno> consultInterno() {
        return SUInt.CUInterno();
    }
	
	@GetMapping(value = "/getIDUInterno")
    public @ResponseBody
    UsuarioInterno consult(@RequestBody UsuarioInterno UsuarioInterno) {
        return SUInt.consultaId(UsuarioInterno);
    }
}
