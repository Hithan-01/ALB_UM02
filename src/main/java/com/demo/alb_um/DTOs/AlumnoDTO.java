package com.demo.alb_um.DTOs;

import java.sql.Time;

public class AlumnoDTO {
    private String nombre;
    private String apellido;
    private String facultad;
    private String nombreActividadFisica;
    private String nombreCoach;
    private String grupo;
    private Time hora;
    private String diaSemana;

    // Constructor
    public AlumnoDTO(String nombre, String apellido, String facultad, String nombreActividadFisica, String nombreCoach, String grupo, Time hora, String diaSemana) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.facultad = facultad;
        this.nombreActividadFisica = nombreActividadFisica;
        this.nombreCoach = nombreCoach;
        this.grupo = grupo;
        this.hora = hora;
        this.diaSemana = diaSemana;
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getNombreActividadFisica() {
        return nombreActividadFisica;
    }

    public void setNombreActividadFisica(String nombreActividadFisica) {
        this.nombreActividadFisica = nombreActividadFisica;
    }

    public String getNombreCoach() {
        return nombreCoach;
    }

    public void setNombreCoach(String nombreCoach) {
        this.nombreCoach = nombreCoach;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }
}
