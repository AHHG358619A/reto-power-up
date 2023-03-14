CREATE DATABASE IF NOT EXISTS powerup_usuarios;

USE powerup_usuarios;

CREATE TABLE IF NOT EXISTS roles (
    id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(50),
	descripcion VARCHAR(100),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS usuarios (
    id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(100),
	apellido VARCHAR(100),
	documento_identidad VARCHAR(50),
	celular VARCHAR(13),
	correo VARCHAR(100),
	clave VARCHAR(60),
	rol_id INT,
    PRIMARY KEY (id),
	FOREIGN KEY (rol_id) REFERENCES roles(id)
);

INSERT INTO roles (id, nombre, descripcion) VALUES (1, 'ADMINISTRADOR', 'Rol para administradores del sistema');
INSERT INTO roles (id, nombre, descripcion) VALUES (2, 'PROPIETARIO', 'Rol para propietarios de restaurantes');
INSERT INTO roles (id, nombre, descripcion) VALUES (2, 'EMPLEADO', 'Rol para empleados de restaurantes');
INSERT INTO roles (id, nombre, descripcion) VALUES (2, 'CLIENTE', 'Rol para cliente de restaurantes');