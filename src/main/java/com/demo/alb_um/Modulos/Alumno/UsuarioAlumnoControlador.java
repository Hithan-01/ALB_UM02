package com.demo.alb_um.Modulos.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class UsuarioAlumnoControlador {

    @Autowired
    private UsuarioAlumnoServicio usuarioAlumnoServicio;

    @GetMapping
    public List<Entidad_Usuario_Alumno> obtenerTodosLosAlumnos() {
        return usuarioAlumnoServicio.obtenerTodosLosAlumnos();
    }

    @PostMapping
    public Entidad_Usuario_Alumno crearAlumno(@RequestBody Entidad_Usuario_Alumno usuarioAlumno) {
        return usuarioAlumnoServicio.guardarAlumno(usuarioAlumno);
    }

    @GetMapping("/{id}")
    public Entidad_Usuario_Alumno obtenerAlumnoPorId(@PathVariable Long id) {
        return usuarioAlumnoServicio.obtenerAlumnoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarAlumno(@PathVariable Long id) {
        usuarioAlumnoServicio.eliminarAlumno(id);
    }
}
