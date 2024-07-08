package com.demo.alb_um.Modulos.Admn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioAdminServicio {

    @Autowired
    private UsuarioAdminRepositorio usuarioAdminRepositorio;

    public List<Ent_UsuarioAdmin> obtenerTodosLosUsuariosAdmin() {
        return usuarioAdminRepositorio.findAll();
    }

    public Optional<Ent_UsuarioAdmin> obtenerUsuarioAdminPorId(Long id) {
        return usuarioAdminRepositorio.findById(id);
    }

    public Ent_UsuarioAdmin guardarUsuarioAdmin(Ent_UsuarioAdmin usuarioAdmin) {
        return usuarioAdminRepositorio.save(usuarioAdmin);
    }

    public void eliminarUsuarioAdmin(Long id) {
        usuarioAdminRepositorio.deleteById(id);
    }
}
