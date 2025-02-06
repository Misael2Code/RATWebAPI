package com.f1.ratWeb.Usuario;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<USU_T000CON> getAllUsuario(){
        return usuarioRepository.findAll();
    }

    public Optional<USU_T000CON> getUsuarioById(Integer id) {
        return usuarioRepository.findById(id);
    }
}
