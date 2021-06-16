drop database restaurante;
create database restaurante;

use  restaurante;


CREATE TABLE `Entrantes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `precio` int (45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO `Entrantes` VALUES (1,'Tostas de sobrasada y queso de cabra',4),(2,'Canapé de lomo de atún con pimientos',4),(3,'Canapés de jamón, queso y piña',4),(4,'Aros de cebolla empanados',4),(5,'Pulpo con patata braseada y salsa de pimientos',4);

CREATE TABLE `PlatoPrincipal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
	`precio` int (45) not null,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO `PlatoPrincipal` VALUES (1,'Paella',4),(2,'Cocido madrileño',4),(3,'Fabada Asturiana',4),(4,'Pulpo a la gallega',4),(5,'Rabo de Toro',4);

CREATE TABLE `PlatoSecundario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `precio` int (45) not null,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `PlatoSecundario` VALUES (1,'Pechugas de pollo a la carbonara',4),(2,'Albóndigas caseras con salsa española',4),(3,'Churrasco de ternera asado con verduras',4),(4,'Pechugas rellenas y gratinadas con queso',4),(5,'Bacalao a la plancha con pisto',4);

CREATE TABLE `Postre` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `precio` int (45) not null,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO `Postre` VALUES (1,'Crema catalana',4),(2,'Torrijas',4),(3,'Ensaimada',4),(4,'Sobaos pasiegos',4),(5,'Arroz con leche',4);

CREATE TABLE `Bebidas` (
  `id` int  NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `precio` int (45) not null,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `Bebidas` VALUES (1,'Aguas caseras',4),(2,'Sangrías reinventadas',4),(3,'CocaCola',4),(4,'Vino Tinto',4),(5,'Cerbeza',4);

CREATE TABLE `SalasDisponibles` (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `nombre` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO `SalasDisponibles` VALUES (1,'Mesa 1'),(2,'Mesa 2'),(3,'Mesa 3'),(4,'Mesa 4'),(5,'Mesa 5');

DROP TABLE  `SalasDisponibles`;
DROP TABLE  `SalasOcupadas`;
CREATE TABLE `SalasOcupadas` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `nombreocupante` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `menu` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_entrantes` int DEFAULT NULL,
  `id_platosprincipal` int DEFAULT NULL,
  `id_platosecundario` int DEFAULT NULL,
  `id_postre` int DEFAULT NULL,
  `id_bebidas` int DEFAULT NULL,
  `precio` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_idx` (`id_entrantes`),
  KEY `id_idx1` (`id_platosprincipal`),
   KEY `id_idx2` (`id_platosecundario`),
  KEY `id_idx3` (`id_postre`),
   KEY `id_idx4` (`id_bebidas`),
  CONSTRAINT `id` FOREIGN KEY (`id_entrantes`) REFERENCES `Entrantes` (`id`),
  CONSTRAINT `id_platosprincipal` FOREIGN KEY (`id_platosprincipal`) REFERENCES `PlatoPrincipal` (`id`),
  CONSTRAINT `id_platosecundario` FOREIGN KEY (`id_platosecundario`) REFERENCES `PlatoSecundario` (`id`),
  CONSTRAINT `id_postre` FOREIGN KEY (`id_postre`) REFERENCES `Bebidas` (`id`),
  CONSTRAINT `id_bebidas` FOREIGN KEY (`id_bebidas`) REFERENCES `Postre` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


