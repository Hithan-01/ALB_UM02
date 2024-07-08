package com.demo.alb_um.Modulos.Admn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios_admin")
public class UsuarioAdminControlador {

    @Autowired
    private UsuarioAdminServicio usuarioAdminServicio;

    @GetMapping
    public List<Ent_UsuarioAdmin> obtenerTodosLosUsuariosAdmin() {
        return usuarioAdminServicio.obtenerTodosLosUsuariosAdmin();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ent_UsuarioAdmin> obtenerUsuarioAdminPorId(@PathVariable Long id) {
        return usuarioAdminServicio.obtenerUsuarioAdminPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Ent_UsuarioAdmin crearUsuarioAdmin(@RequestBody Ent_UsuarioAdmin usuarioAdmin) {
        return usuarioAdminServicio.guardarUsuarioAdmin(usuarioAdmin);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUsuarioAdmin(@PathVariable Long id) {
        usuarioAdminServicio.eliminarUsuarioAdmin(id);
        return ResponseEntity.noContent().build();
    }
}
