package com.demo.alb_um.Modulos.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/coach_actividades")
public class CoachActividadControlador {

    @Autowired
    private CoachActividadServicio coachActividadServicio;

    @GetMapping
    public List<Ent_CoachActividad> obtenerTodasLasCoachActividades() {
        return coachActividadServicio.obtenerTodasLasCoachActividades();
    }
}
