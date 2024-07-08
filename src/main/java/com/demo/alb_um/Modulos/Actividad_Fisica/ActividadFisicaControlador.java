package com.demo.alb_um.Modulos.Actividad_Fisica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/actividades_fisicas")
public class ActividadFisicaControlador {

    @Autowired
    private ActividadFisicaServicio actividadFisicaServicio;

    @GetMapping
    public List<Entidad_ActividadFisica> obtenerTodasLasActividadesFisicas() {
        return actividadFisicaServicio.obtenerTodasLasActividadesFisicas();
    }
}