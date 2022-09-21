/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

/*!40000 ALTER TABLE `compras` DISABLE KEYS */;
INSERT INTO `compras` (`idcompra`, `username`, `idproducto`, `fechacompra`, `cantidad`, `valorcompra`, `direccionenvio`) VALUES
	(1, 'avasquez', 1, '2022-09-13 08:00:00', 1, 82000000, 'Calle 11 13-44'),
	(2, 'rperez', 2, '2022-09-14 12:19:08', 2, 268000000, 'Transversal 8 5-52'),
	(3, 'rbecerra', 6, '2022-09-14 15:00:46', 1, 36000000, 'Calle 78 25-89'),
	(4, 'jgomez', 3, '2022-09-19 08:01:49', 2, 204000000, 'Avenida 6 28-52'),
	(5, 'squintero', 4, '2022-09-19 12:02:50', 5, 105000000, 'Calle 6 78-21'),
	(6, 'aospina', 5, '2022-09-20 16:00:00', 1, 18780000, 'Carrera 8 9-54'),
	(7, 'Jlosada', 3, '2022-09-21 15:06:33', 2, 204000000, 'Transversal 14 5-45');
/*!40000 ALTER TABLE `compras` ENABLE KEYS */;

/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` (`idproducto`, `material`, `descripcion`, `precio`, `unidades`, `categoria`, `tiempoentrega`) VALUES
	(1, 'Plastico', 'Parque Importado Pulpo', 82000000, 5, '0-12 años', '30 dias'),
	(2, 'Plastico', 'Parque Importado Pirata', 134000000, 4, '0-12 años', '40 dias'),
	(3, 'Plastico', 'Parque Importado Mundo Aventura', 102000000, 3, '0-12 años', '40 dias'),
	(4, 'Metal', 'Parque Infantil Metalico', 21000000, 8, '0-8 años', '20 dias'),
	(5, 'Plastico\r\n', 'Parque Gorila', 18780000, 8, '0-12 años', '30 dias'),
	(6, 'Madera', 'Parque Madera', 36000000, 7, '0-6 años', '20 dias');
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;

/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` (`username`, `contraseña`, `nombre`, `apellido`, `email`, `tipousuario`, `telefono`, `ciudad`, `direccion`) VALUES
	('aospina', '4589', 'Angelica', 'Ospina', 'angelica@gmail.com', '2', '3175869421', 'Cali, Valle ', 'Carrera 8 9-54'),
	('avasquez', '1234', 'Angela Maria', 'Vasquez', 'angelavasquez05@gmail.com', '1', '3178549389', 'Buga, Valle', 'Calle 11 13-44'),
	('ebocanegra', '14725632', 'Estela', 'Bocanegra', 'estelab@yahoo.es', '1', '3859631474', 'Ibague', 'Calle 3 85-47'),
	('jgomez', 'Julian1258*', 'Julian', 'Gomez', 'july@gmail.com', '2', '3145698752', 'Cali, Valle', 'Avenida 6 28-52'),
	('Jlosada', '147jjl', 'Juan Jose', 'Losada', 'losada@hotmail.com', '2', '3215694741', 'Pereira', 'Transversal 14 5-45'),
	('lgil', '5689', 'Luis', 'Gil', 'lucho@hotmail.com', '2', '3175286394', 'Bogota', 'Avenida 4 9-87'),
	('lsuarez', 'lsuarez123', 'Luisa', 'Suarez', 'lucy@hotmail.es', '1', '3694175285', 'Bogota', 'Avn 58 con 7'),
	('rbecerra', '14752', 'Rubiela', 'Becerra', 'ruby1@yahoo.es', '1', '3255867814', 'Bucaramanga', 'Calle 78 25-89'),
	('rperez', '2589', 'Raul ', 'Perez', 'rperez@gmail.com', '1', '3205869745', 'Armenia, Quindio', 'Transversal 8 5-52'),
	('squintero', 'sanquin123', 'Santiago', 'Quintero', 'sanquintero@gmail.com', '1', '3135842369', 'Pasto', 'Calle 6 78-21');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
