package com.demo.alb_um.Modulos.Alumno;

import com.demo.alb_um.DTOs.AlumnoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;

import java.util.Optional;

@Controller
@RequestMapping("/api/alumnos")
public class UsuarioAlumnoControlador {

    @Autowired
    private UsuarioAlumnoServicio usuarioAlumnoServicio;

    @GetMapping("/{userName}")
    public String obtenerInformacionAlumnoPorUserName(@PathVariable String userName, Model model) {
        Optional<AlumnoDTO> alumnoOpt = usuarioAlumnoServicio.obtenerInformacionAlumnoPorUserName(userName);
        if (alumnoOpt.isPresent()) {
            model.addAttribute("alumno", alumnoOpt.get());
            return "alumno";
        } else {
            return "error";
        }
    }
}
