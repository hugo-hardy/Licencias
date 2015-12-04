CREATE DATABASE  IF NOT EXISTS `licencias` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `licencias`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: licencias
-- ------------------------------------------------------
-- Server version	5.7.9-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `licencia_vencida`
--

DROP TABLE IF EXISTS `licencia_vencida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `licencia_vencida` (
  `id_licencia_vencida` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_alta` datetime DEFAULT NULL,
  `clase` varchar(11) DEFAULT NULL,
  `vigencia` datetime DEFAULT NULL,
  `fecha_baja` datetime DEFAULT NULL,
  `observacion` varchar(45) DEFAULT NULL,
  `valor` double DEFAULT NULL,
  `id_titular` int(11) DEFAULT NULL,
  `apellido_Nombre` varchar(100) DEFAULT NULL,
  `nro_documento` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_licencia_vencida`),
  KEY `idTitular_idx` (`id_titular`),
  CONSTRAINT `fk_id_titular_lv` FOREIGN KEY (`id_titular`) REFERENCES `titular` (`id_titular`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `licencia_vencida`
--

LOCK TABLES `licencia_vencida` WRITE;
/*!40000 ALTER TABLE `licencia_vencida` DISABLE KEYS */;
INSERT INTO `licencia_vencida` VALUES (5,'2015-11-29 11:11:48','Clase A','1902-06-28 00:00:00',NULL,'No usa lentes',40,19,'Hardy Hugo','30175437'),(6,'2015-11-29 11:11:48','Clase A','1902-06-28 00:00:00',NULL,'No usa lentes',40,19,'Hardy Hugo','30175437'),(7,'2015-11-29 11:11:48','Clase A','1902-06-28 00:00:00',NULL,'No usa lentes',40,19,'Hardy Hugo','30175437'),(8,'2015-11-29 11:11:48','Clase A','1902-06-28 00:00:00',NULL,'No usa lentes',40,19,'Hardy Hugo','30175437'),(9,'2015-11-29 11:11:48','Clase B','1902-06-28 00:00:00',NULL,'No usa lentes',40,19,'Hardy Hugo','30175437'),(10,'2015-11-29 11:11:48','Clase B','1902-06-28 00:00:00',NULL,'No usa lentes',40,19,'Hardy Hugo','30175437'),(11,'2015-11-29 11:11:48','Clase B','1902-06-28 00:00:00',NULL,'No usa lentes',40,19,'Hardy Hugo','30175437'),(12,'2015-11-29 15:08:07','Clase A','1907-09-10 00:00:00',NULL,'No usa lentes',40,19,'Hardy Hugo','30175437'),(13,'2015-11-29 15:08:07','Clase B','1907-09-10 00:00:00',NULL,'No usa lentes',40,19,'Hardy Hugo','30175437');
/*!40000 ALTER TABLE `licencia_vencida` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-03 21:37:17
