package com.demo.alb_um.Modulos.Alumno;

import com.demo.alb_um.DTOs.AlumnoDTO;
import com.demo.alb_um.Modulos.Alumno_Actividad.Ent_AlumnoActividad;
import com.demo.alb_um.Modulos.Actividad_Fisica.Entidad_ActividadFisica;
import com.demo.alb_um.Modulos.Coach.Ent_CoachActividad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Optional;

@Service
public class UsuarioAlumnoServicio {

    @Autowired
    private UsuarioAlumnoRepositorio usuarioAlumnoRepositorio;

    public Optional<AlumnoDTO> obtenerInformacionAlumnoPorUserName(String userName) {
        Optional<Entidad_Usuario_Alumno> alumnoOpt = usuarioAlumnoRepositorio.findByUsuario_UserName(userName);

        if (alumnoOpt.isPresent()) {
            Entidad_Usuario_Alumno alumno = alumnoOpt.get();
            String nombre = alumno.getUsuario().getNombre();
            String apellido = alumno.getUsuario().getApellido();
            String facultad = alumno.getFacultad();

            Optional<Entidad_ActividadFisica> actividadFisicaOpt = alumno.getAlumnoActividades().stream()
                    .findFirst() // Asumiendo que el alumno está inscrito en una sola actividad
                    .map(Ent_AlumnoActividad::getActividadFisica);

            String nombreActividadFisica = actividadFisicaOpt.map(Entidad_ActividadFisica::getNombre).orElse("No inscrito");
            String grupo = actividadFisicaOpt.map(Entidad_ActividadFisica::getGrupo).orElse("N/A");
            Time hora = actividadFisicaOpt.map(Entidad_ActividadFisica::getHora).orElse(null);
            String diaSemana = actividadFisicaOpt.map(Entidad_ActividadFisica::getDiaSemana).orElse("N/A");

            String nombreCoach = actividadFisicaOpt.flatMap(actividadFisica -> actividadFisica.getCoachActividades().stream()
                    .findFirst() // Asumiendo que cada actividad tiene un solo coach
                    .map(Ent_CoachActividad::getUsuario)
                    .map(usuario -> usuario.getNombre())
            ).orElse("Sin Coach");

            return Optional.of(new AlumnoDTO(nombre, apellido, facultad, nombreActividadFisica, nombreCoach, grupo, hora, diaSemana));
        }

        return Optional.empty();
    }
}
