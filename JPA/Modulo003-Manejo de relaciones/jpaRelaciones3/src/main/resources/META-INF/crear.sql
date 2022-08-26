CREATE TABLE `Libros` (`isbn` VARCHAR(255) NOT NULL,`titulo` VARCHAR(255) NOT NULL,`autor` VARCHAR(255) ,`fecha` DATE NOT NULL,`precio` INT NOT NULL,`categorias_nombre` VARCHAR(255) ,PRIMARY KEY (`isbn`));
CREATE TABLE `Categorias` (	`nombre` VARCHAR(255) NOT NULL,`descripcion` VARCHAR(255) NOT NULL,PRIMARY KEY (`nombre`));
CREATE TABLE `Ejemplares` (`codigo` VARCHAR(255) NOT NULL,`libros_isbn` VARCHAR(255) NOT NULL,PRIMARY KEY (`codigo`));
CREATE TABLE `Prestamos` (	`id` INT NOT NULL AUTO_INCREMENT,	`fecha` DATE NOT NULL ,PRIMARY KEY (`id`));
CREATE TABLE `PrestamosEjemplares` (`prestamos_id` INT NOT NULL,`ejemplares_codigo` VARCHAR(255) NOT NULL,PRIMARY KEY (`prestamos_id`,`ejemplares_codigo`));
ALTER TABLE `Libros` ADD CONSTRAINT `Libros_fk0` FOREIGN KEY (`categorias_nombre`) REFERENCES `Categorias`(`nombre`);
ALTER TABLE `Ejemplares` ADD CONSTRAINT `Ejemplares_fk0` FOREIGN KEY (`libros_isbn`) REFERENCES `Libros`(`isbn`);
ALTER TABLE `PrestamosEjemplares` ADD CONSTRAINT `PrestamosEjemplares_fk0` FOREIGN KEY (`prestamos_id`) REFERENCES `Prestamos`(`id`);
ALTER TABLE `PrestamosEjemplares` ADD CONSTRAINT `PrestamosEjemplares_fk1` FOREIGN KEY (`ejemplares_codigo`) REFERENCES `Ejemplares`(`codigo`);

