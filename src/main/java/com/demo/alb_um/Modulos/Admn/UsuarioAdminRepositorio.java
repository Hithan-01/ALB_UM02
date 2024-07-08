package com.demo.alb_um.Modulos.Admn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioAdminRepositorio extends JpaRepository<Ent_UsuarioAdmin, Long> {
}
