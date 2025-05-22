package com.grupo6.servicioNotificacion.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo6.servicioNotificacion.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    @SuppressWarnings("override")
    Optional<Usuario> findById(Integer id);
}
