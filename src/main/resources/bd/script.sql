CREATE DATABASE BDEvaluacion;

USE BDEvaluacion;

CREATE TABLE usuario (
	idusuario INT auto_increment NOT NULL,
	nomusuario varchar(100) NULL,
	email varchar(200) NULL,
	password varchar(300) NULL,
	nombres varchar(100) NULL,
	apellidos varchar(100) NULL,
	activo BOOL NULL,
	CONSTRAINT users_pk PRIMARY KEY (idusuario)
);


CREATE TABLE rol (
	idrol INT auto_increment NOT NULL,
	nomrol varchar(300) NULL,
	CONSTRAINT roles_pk PRIMARY KEY (idrol)
);

CREATE TABLE usuario_rol (
	idusuario INT NOT NULL,
	idrol INT NOT NULL,
	CONSTRAINT user_role_pk PRIMARY KEY (idusuario, idrol),
	CONSTRAINT user_role_FK FOREIGN KEY (idusuario) REFERENCES usuario(idusuario),
	CONSTRAINT user_role_FK_1 FOREIGN KEY (idrol) REFERENCES rol(idrol)
);

CREATE TABLE Medico
(
 IdMedico 		INT NOT NULL AUTO_INCREMENT,
 NomMedico		VARCHAR(50) NOT NULL,
 ApeMedico 		VARCHAR(50) NOT NULL,
 FechNacMedico	DATE NOT NULL,
 PRIMARY KEY (IdMedico)
);

CREATE TABLE Especialidad
(
 IdEspecialidad 		INT NOT NULL AUTO_INCREMENT,
 Titulo 			VARCHAR(250) NOT NULL,
 Funcion 			VARCHAR(250) NOT NULL,
 FechGraduacion	DATE NOT NULL,
 IdMedico 			INT NOT NULL,
 PRIMARY KEY (IdEspecialidad),
 FOREIGN KEY (IdMedico) REFERENCES Medico(IdMedico)
 );
 
 

 
 -- Registros de ejemplo para la tabla usuario
INSERT INTO usuario (nomusuario, email, password, nombres, apellidos, activo) VALUES
('usuario1', 'usuario1@example.com', 'password1', 'Juan', 'Pérez', 1),
('usuario2', 'usuario2@example.com', 'password2', 'María', 'González', 1),
('usuario3', 'usuario3@example.com', 'password3', 'Luis', 'Martínez', 1),
('usuario4', 'usuario4@example.com', 'password4', 'Ana', 'Sánchez', 1),
('usuario5', 'usuario5@example.com', 'password5', 'Pedro', 'López', 1),
('usuario6', 'usuario6@example.com', 'password6', 'Laura', 'Díaz', 1),
('usuario7', 'usuario7@example.com', 'password7', 'Carlos', 'Ruiz', 1),
('usuario8', 'usuario8@example.com', 'password8', 'Sofía', 'Hernández', 1);

-- Registros de ejemplo para la tabla rol
INSERT INTO rol (nomrol) VALUES
('Administrador'),
('Médico'),
('Recepcionista');

-- Registros de ejemplo para la tabla usuario_rol
INSERT INTO usuario_rol (idusuario, idrol) VALUES
(1, 1),
(2, 2),
(3, 2),
(4, 3),
(5, 3),
(6, 2),
(7, 2),
(8, 1);

-- Registros de ejemplo para la tabla Medico
INSERT INTO Medico (NomMedico, ApeMedico, FechNacMedico) VALUES
('Juan', 'García', '1980-05-15'),
('María', 'López', '1975-09-23'),
('Luis', 'Martínez', '1982-12-10'),
('Ana', 'Rodríguez', '1978-07-30'),
('Pedro', 'Fernández', '1985-03-20'),
('Laura', 'Díaz', '1990-11-05'),
('Carlos', 'Ruiz', '1970-02-18'),
('Sofía', 'Hernández', '1988-06-28');

-- Registros de ejemplo para la tabla Especialidad
INSERT INTO Especialidad (Titulo, Funcion, FechGraduacion, IdMedico) VALUES
('Cirugía General', 'Realizar cirugías de diversa índole', '2010-07-01', 1),
('Pediatría', 'Atender a niños y adolescentes', '2005-05-15', 2),
('Ginecología', 'Atender a mujeres en temas de salud reproductiva', '2008-09-30', 3),
('Cardiología', 'Atender a pacientes con problemas cardíacos', '2006-12-20', 4),
('Dermatología', 'Tratar enfermedades de la piel', '2007-04-10', 5),
('Psiquiatría', 'Atender a pacientes con trastornos mentales', '2012-03-05', 6),
('Oftalmología', 'Atender a pacientes con problemas de visión', '2003-08-12', 7),
('Neurología', 'Atender a pacientes con trastornos neurológicos', '2000-11-25', 8);

SELECT * FROM Medico;