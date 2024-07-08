package com.demo.alb_um.Modulos.Inscripcion_Taller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscripcionTallerRepositorio extends JpaRepository<Ent_InscripcionTaller, Long> {
}
