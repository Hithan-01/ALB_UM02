package com.demo.alb_um.Modulos.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoachActividadServicio {

    @Autowired
    private CoachActividadRepositorio coachActividadRepositorio;

    public List<Ent_CoachActividad> obtenerTodasLasCoachActividades() {
        return coachActividadRepositorio.findAll();
    }
}
