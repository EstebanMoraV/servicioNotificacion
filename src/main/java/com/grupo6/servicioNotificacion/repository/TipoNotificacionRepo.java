package com.grupo6.servicioNotificacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo6.servicioNotificacion.model.TipoNotificacion;

public interface TipoNotificacionRepo extends JpaRepository<TipoNotificacion, Integer> {

}
