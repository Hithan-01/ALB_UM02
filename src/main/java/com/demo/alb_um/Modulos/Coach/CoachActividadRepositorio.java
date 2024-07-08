package com.demo.alb_um.Modulos.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CoachActividadRepositorio extends JpaRepository<Ent_CoachActividad, CoachActividadId> {
}