INSERT INTO `Categorias` (`nombre`, `descripcion`) VALUES ('programacion','libros de programacion');
INSERT INTO `Categorias` (`nombre`, `descripcion`) VALUES ('web','libros web');
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_nombre`) VALUES ('1AB', 'Java', 'cecilio', '2020-01-01', '3','programacion')
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_nombre`) VALUES ('2AC', 'Java Web', 'cecilio', '2020-01-02', '3','programacion')
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_nombre`) VALUES ('3BC', 'html', 'gema', '2020-01-02', '2','web')
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_nombre`) VALUES ('4BD', 'html5', 'andres', '2020-01-02', '2','web')
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_nombre`) VALUES ('5BD', 'C', 'maria', '2020-01-02', '5','programacion')
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_nombre`) VALUES ('6FG', 'PHP', null, '2020-03-02', '4','programacion')
INSERT INTO `Ejemplares` (`codigo`, `libros_isbn`) VALUES ('1-1AB-2020','1AB')
INSERT INTO `Ejemplares` (`codigo`, `libros_isbn`) VALUES ('2-1AB-2020','1AB')
INSERT INTO `Ejemplares` (`codigo`, `libros_isbn`) VALUES ('3-1AB-2020','1AB')
INSERT INTO `Ejemplares` (`codigo`, `libros_isbn`) VALUES ('1-2AC-2020','2AC')
INSERT INTO `Ejemplares` (`codigo`, `libros_isbn`) VALUES ('2-2AC-2020','2AC')
INSERT INTO `Ejemplares` (`codigo`, `libros_isbn`) VALUES ('3-2AC-2020','2AC')