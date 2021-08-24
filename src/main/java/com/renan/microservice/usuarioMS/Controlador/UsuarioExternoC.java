package com.renan.microservice.usuarioMS.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.renan.microservice.usuarioMS.Servicio.ServiciosUExt;
import com.renan.microservice.usuarioMS.Usuarios.UsuarioExterno;

@RestController
@RequestMapping(path = "/usuarioMS")
public class UsuarioExternoC {
	
	@Autowired
    private ServiciosUExt SUExt;
	
	@PostMapping(value = "/postCUExterno")
    public @ResponseBody
    UsuarioExterno saveInterno(@RequestBody UsuarioExterno UsuarioExterno) {
        return SUExt.crearUExt(UsuarioExterno);
    }

    @GetMapping("/getUExterno")
    public @ResponseBody
    List<UsuarioExterno> consultExterno() {
        return SUExt.CUExterno();
    }
    
    @GetMapping(value = "/getIDUExterno")
    public @ResponseBody
    UsuarioExterno consult(@RequestBody UsuarioExterno UsuarioExterno) {
        return SUExt.consultaId(UsuarioExterno);
    }
}