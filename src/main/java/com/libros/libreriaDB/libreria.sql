CREATE DATABASE libreria;
USE libreria;
DROP TABLE IF EXISTS  `Libros`;
DROP TABLE IF EXISTS `Categorias`;
CREATE TABLE `Libros` (`isbn` INT NOT NULL,`titulo` VARCHAR(255) NOT NULL,`autor` VARCHAR(255) ,`precio` INT NOT NULL,`categorias_nombre` VARCHAR(255) ,PRIMARY KEY (`isbn`));
CREATE TABLE `Categorias` (	`nombre` VARCHAR(255) NOT NULL,`descripcion` VARCHAR(255) NOT NULL,PRIMARY KEY (`nombre`));
ALTER TABLE `Libros` ADD CONSTRAINT `Libros_fk0` FOREIGN KEY (`categorias_nombre`) REFERENCES `Categorias`(`nombre`);

INSERT INTO `Categorias` (`nombre`, `descripcion`) VALUES ('aventura','libros de aventura');
INSERT INTO `Categorias` (`nombre`, `descripcion`) VALUES ('hechizeria','libros de magia');
INSERT INTO `Categorias` (`nombre`, `descripcion`) VALUES ('musica','no te lo esperabas');

INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `precio`, `categorias_nombre`) VALUES ('123456789', 'El señor de los anillos', 'J. R. R. Tolkien', 15, 'aventura');