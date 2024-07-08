package com.demo.alb_um.Modulos.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioAlumnoServicio {

    @Autowired
    private UsuarioAlumnoRepositorio usuarioAlumnoRepositorio;

    public List<Entidad_Usuario_Alumno> obtenerTodosLosAlumnos() {
        return usuarioAlumnoRepositorio.findAll();
    }

    public Entidad_Usuario_Alumno guardarAlumno(Entidad_Usuario_Alumno usuarioAlumno) {
        return usuarioAlumnoRepositorio.save(usuarioAlumno);
    }

    public Entidad_Usuario_Alumno obtenerAlumnoPorId(Long id) {
        return usuarioAlumnoRepositorio.findById(id).orElse(null);
    }

    public void eliminarAlumno(Long id) {
        usuarioAlumnoRepositorio.deleteById(id);
    }
}
