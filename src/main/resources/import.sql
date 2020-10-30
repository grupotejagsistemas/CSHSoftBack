INSERT INTO voluntarios (direccion, nombre_completo,presencial,telefono,transito,traslado,localidad) VALUES ('Calle falsa 123', 'Gonzalo Laime', 'NO','44623224','NO','SI','Ciudad Madero');
INSERT INTO voluntarios (direccion, nombre_completo,presencial,telefono,transito,traslado,localidad) VALUES ('Calle falsa 120', 'Tomas Herrero', 'NO','1122334455','NO','SI','Lugano');
INSERT INTO voluntarios (direccion, nombre_completo,presencial,telefono,transito,traslado,localidad) VALUES ('Calle falsa 121', 'Ezequiel Miño', 'NO','1133445566','NO','SI','Lugano');
INSERT INTO voluntarios (direccion, nombre_completo,presencial,telefono,transito,traslado,localidad) VALUES ('Calle falsa 122', 'Agustin Escalante', 'NO','1144556677','NO','SI','Lugano');
INSERT INTO voluntarios (direccion, nombre_completo,presencial,telefono,transito,traslado,localidad) VALUES ('Calle falsa 124', 'Joel Miranda', 'NO','1123456789','NO','SI','Lugano');
INSERT INTO voluntarios (direccion, nombre_completo,presencial,telefono,transito,traslado,localidad) VALUES ('Calle falsa 125', 'Guadalupe Cedeira', 'NO','23175888','NO','SI','Lugano');
INSERT INTO voluntarios (direccion, nombre_completo,presencial,telefono,transito,traslado,localidad) VALUES ('Calle falsa 126', 'Paloma Fernández', 'NO','12345678','NO','SI','Villa Celina');
INSERT INTO voluntarios (direccion, nombre_completo,presencial,telefono,transito,traslado,localidad) VALUES ('Calle falsa 127', 'Victoria Díaz', 'NO','123456779','NO','SI','Lugano');
INSERT INTO voluntarios (direccion, nombre_completo,presencial,telefono,transito,traslado,localidad) VALUES ('Calle falsa 128', 'Manuel Lepo', 'NO','123888496','NO','SI','Lugano');
INSERT INTO voluntarios (direccion, nombre_completo,presencial,telefono,transito,traslado,localidad) VALUES ('Calle falsa 129', 'Pepe Pompin', 'NO','31178546','NO','SI','Lugano');
INSERT INTO estado_mascota (descripcion) VALUES ('Adoptado');
INSERT INTO estado_mascota (descripcion) VALUES ('No Adoptado');
INSERT INTO estado_mascota (descripcion) VALUES ('En proceso de adopcion');
INSERT INTO veterinarias (direccion, horario_atencion, internacion, observaciones, razon_social) VALUES ('Av. Gral. Paz 17543','24hs','SI','Los veterinarios son muy buenos','San Roque');
INSERT INTO veterinarias (direccion, horario_atencion, internacion, observaciones, razon_social) VALUES ('Av. Roca 5200','10:00am - 19:00pm','NO','No atenderse con Jorge, trata mal a los perros','Veterinaria Roca');
INSERT INTO veterinarias (direccion, horario_atencion, internacion, observaciones, razon_social) VALUES ('Olavarria 3100','10:00am - 15:00pm','NO','Tiene peluqueria','Veterina los 3 caniches');
INSERT INTO estado_adoptantes (descripcion) VALUES ('Apto');
INSERT INTO estado_adoptantes (descripcion) VALUES ('No Apto');
INSERT INTO estado_adoptantes (descripcion) VALUES ('En Proceso');
INSERT INTO estado_adoptantes (descripcion) VALUES ('Rechazado');
INSERT INTO estado_adoptantes (descripcion) VALUES ('Finalizado');
INSERT INTO tipo_movimientos (descripcion) VALUES ('Medicacion');
INSERT INTO tipo_movimientos (descripcion) VALUES ('Alimento');
INSERT INTO tipo_movimientos (descripcion) VALUES ('Egreso');
INSERT INTO tipo_movimientos (descripcion) VALUES ('Ingreso');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('Gonzalo','$2a$10$lyOEnBiyAicf0PP4hBpG9eVPWXRp9L3/jBDqyKLMJWKpVj8iT7RAm',1, 'Gonzalo', 'Laime', 'gonzielxeneize@hotmail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$m6fjcNXy9pGq2qRsm.L9zOhxNsgQgtecdgE8xSzHMJvbbtYiVjlBK',1, 'Admin', 'Admin', 'admin@admin.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1,1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,1);

