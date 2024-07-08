package com.demo.alb_um.Modulos.Actividad_Fisica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadFisicaServicio {

    @Autowired
    private ActividadFisicaRepositorio actividadFisicaRepositorio;

    public List<Entidad_ActividadFisica> obtenerTodasLasActividadesFisicas() {
        return actividadFisicaRepositorio.findAll();
    }
}
