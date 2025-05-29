INSERT INTO tipo_notificacion (tipo_notificacion) VALUES
('Notificación de bienvenida'),
('Cambio de contraseña'),
('Verificación de número'),
('Notificación general'),
('Agenda de reuniones'),
('Actualización de estado'),
('Alerta de seguridad'),
('Confirmación de acción'),
('Recordatorio de tarea'),
('Mensaje del sistema');


INSERT INTO notificacion (mensaje, leida, id_tipo_notificacion, id_usuario) VALUES
('Bienvenido a nuestra plataforma. Esperamos que tengas una excelente experiencia.', false, 1, 1),
('Tu contraseña fue cambiada recientemente. Si no fuiste tú, contáctanos.', false, 8, 2),
('Se ha agendado una llamada para discutir tu proyecto mañana a las 10:00 AM.', true, 5, 3),
('Tienes una nueva notificación en la aplicación.', false, 4, 4),
('Hemos actualizado nuestras políticas de privacidad.', true, 3, 5),
('Recuerda revisar el estado de tu solicitud antes del viernes.', false, 6, 1),
('Confirmamos tu registro al evento de innovación.', true, 9, 2),
('Detectamos un intento de acceso no autorizado a tu cuenta.', false, 7, 3),
('Tu cuenta será sometida a mantenimiento esta noche a las 12:00 AM.', true, 10, 4),
('Tu número fue verificado exitosamente.', true, 2, 5);