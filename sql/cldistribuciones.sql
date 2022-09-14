-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.9.1-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para cldistribuciones
CREATE DATABASE IF NOT EXISTS `cldistribuciones` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_bin */;
USE `cldistribuciones`;

-- Volcando estructura para tabla cldistribuciones.compras
CREATE TABLE IF NOT EXISTS `compras` (
  `idcompra` int(11) NOT NULL,
  `username` varchar(10) NOT NULL,
  `idproducto` int(11) NOT NULL,
  `fechacompra` datetime NOT NULL,
  `cantidad` int(11) NOT NULL,
  `valorcompra` float NOT NULL,
  `direccionenvio` varchar(50) NOT NULL,
  PRIMARY KEY (`idcompra`,`username`,`idproducto`) USING BTREE,
  KEY `FK_usuarios` (`username`),
  KEY `FK_productos` (`idproducto`),
  CONSTRAINT `FK_productos` FOREIGN KEY (`idproducto`) REFERENCES `productos` (`idproducto`),
  CONSTRAINT `FK_usuarios` FOREIGN KEY (`username`) REFERENCES `usuarios` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla cldistribuciones.productos
CREATE TABLE IF NOT EXISTS `productos` (
  `idproducto` int(11) NOT NULL,
  `material` varchar(20) DEFAULT NULL,
  `descripcion` varchar(1000) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `unidades` int(11) DEFAULT NULL,
  `categoria` varchar(20) DEFAULT NULL,
  `tiempoentrega` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idproducto`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla cldistribuciones.usuarios
CREATE TABLE IF NOT EXISTS `usuarios` (
  `username` varchar(10) NOT NULL,
  `contraseña` varchar(20) DEFAULT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `apellido` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `tipousuario` varchar(10) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `ciudad` varchar(20) DEFAULT NULL,
  `direccion` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
