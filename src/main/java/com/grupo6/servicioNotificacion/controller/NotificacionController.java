package com.grupo6.servicioNotificacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grupo6.servicioNotificacion.model.Notificacion;
import com.grupo6.servicioNotificacion.service.NotificacionService;


@RestController
@RequestMapping("/api/v1/notificaciones")
public class NotificacionController {

    @Autowired
    private NotificacionService notificacionService;

    @GetMapping
    public ResponseEntity<List<Notificacion>> getAllNotificaciones() {
        List<Notificacion> notificaciones = notificacionService.getAllNotificaciones();
        return new ResponseEntity<>(notificaciones, HttpStatus.OK);
    }

    @GetMapping("/usuario")
    public ResponseEntity<List<Notificacion>> getNotificacionesByUsuarioId(@RequestParam Integer usuarioId) {
        List<Notificacion> notificaciones = notificacionService.getNotificacionesByUsuarioId(usuarioId);
        return new ResponseEntity<>(notificaciones, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notificacion> getNotificacionById(@RequestParam Integer id) {
        Notificacion notificacion = notificacionService.getNotificacionById(id);
        if (notificacion != null) {
            return new ResponseEntity<>(notificacion, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Notificacion> createNotificacion(@RequestParam Notificacion notificacion) {
        Notificacion createdNotificacion = notificacionService.createNotificacion(notificacion);
        return new ResponseEntity<>(createdNotificacion, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Notificacion> updateNotificacion(@RequestParam Integer id, @RequestParam Notificacion notificacion) {
        Notificacion updatedNotificacion = notificacionService.updateNotificacion(id, notificacion);
        if (updatedNotificacion != null) {
            return new ResponseEntity<>(updatedNotificacion, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNotificacion(@RequestParam Integer id) {
        notificacionService.deleteNotificacion(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
