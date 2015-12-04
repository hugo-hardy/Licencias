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
-- Table structure for table `licencia`
--

DROP TABLE IF EXISTS `licencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `licencia` (
  `id_licencia` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_alta` datetime DEFAULT NULL,
  `clase` varchar(45) DEFAULT NULL,
  `vigencia` datetime DEFAULT NULL,
  `fecha_baja` datetime DEFAULT NULL,
  `observacion` varchar(45) DEFAULT NULL,
  `valor` double DEFAULT NULL,
  `id_titular` int(11) DEFAULT NULL,
  `impresa` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_licencia`),
  KEY `fk_id_titular_idx` (`id_titular`),
  CONSTRAINT `fk_id_titular` FOREIGN KEY (`id_titular`) REFERENCES `titular` (`id_titular`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `licencia`
--

LOCK TABLES `licencia` WRITE;
/*!40000 ALTER TABLE `licencia` DISABLE KEYS */;
INSERT INTO `licencia` VALUES (10,'2015-11-29 15:59:54','Clase A','3920-03-15 00:00:00',NULL,'No usa lentes',40,19,1),(11,'2015-11-29 15:59:54','Clase B','3920-03-15 00:00:00',NULL,'No usa lentes',40,19,1),(12,'2015-11-30 06:24:07','Clase G','2020-02-15 00:00:00',NULL,'No usa lentes',40,19,1),(13,'2015-12-01 17:56:57','Clase D','2019-12-01 00:00:00',NULL,'',40,20,1),(14,'2015-12-01 17:56:57','Clase E','2019-12-01 00:00:00',NULL,'',59,20,0);
/*!40000 ALTER TABLE `licencia` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trg_licencia_in 
AFTER INSERT ON licencia FOR EACH ROW 
BEGIN 
INSERT INTO log_licencia 
(fecha,id_usuario,id_licencia) 
VALUES (now(),1,new.id_licencia);

END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-03 21:37:18
