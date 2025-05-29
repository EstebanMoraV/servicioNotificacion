package com.grupo6.servicioNotificacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo6.servicioNotificacion.model.Notificacion;
import com.grupo6.servicioNotificacion.repository.NotificacionRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class NotificacionService {

    @Autowired
    private NotificacionRepository notificacionRepository;

    public List<Notificacion> getAllNotificaciones() {
        return notificacionRepository.findAll();
    }

    public Notificacion getNotificacionById(Integer id) {
        return notificacionRepository.findById(id).orElse(null);
    }

    public List<Notificacion> getNotificacionesByUsuarioId(Integer usuarioId) {
        return notificacionRepository.findAll().stream()
                .filter(notificacion -> notificacion.getUsuario().getId().equals(usuarioId))
                .toList();
    }

    public Notificacion createNotificacion(Notificacion notificacion) {
        return notificacionRepository.save(notificacion);
    }

    public Notificacion updateNotificacion(Integer id, Notificacion notificacion) {
        Notificacion existingNotificacion = notificacionRepository.findById(id).orElse(null);
        if (existingNotificacion != null) {
            existingNotificacion.setMensaje(notificacion.getMensaje());
            existingNotificacion.setTipoNotificacion(notificacion.getTipoNotificacion());
            return notificacionRepository.save(existingNotificacion);
        }
        return null;
    }

    public void deleteNotificacion(Integer id) {
        notificacionRepository.deleteById(id);
    }

}
