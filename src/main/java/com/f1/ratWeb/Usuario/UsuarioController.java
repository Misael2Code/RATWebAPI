package com.f1.ratWeb.Usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<USU_T000CON> getAllUsuario() {
        return usuarioService.getAllUsuario();        
    }

    @GetMapping("/{id}")
    public ResponseEntity<USU_T000CON> getUsuarioById(@PathVariable Integer id) {
        return usuarioService.getUsuarioById(id)
        .map(ResponseEntity::ok).orElse(ResponseEntity
        .notFound().build());
    }

}
