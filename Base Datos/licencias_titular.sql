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
-- Table structure for table `titular`
--

DROP TABLE IF EXISTS `titular`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `titular` (
  `id_titular` int(11) NOT NULL AUTO_INCREMENT,
  `apellido` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `tipo_documento` varchar(45) DEFAULT NULL,
  `nro_documento` varchar(45) DEFAULT NULL,
  `clase_requerida` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `es_donante` tinyint(1) DEFAULT NULL,
  `factor_rh` varchar(5) DEFAULT NULL,
  `fecha_nacimiento` datetime DEFAULT NULL,
  `grupo_sanguineo` varchar(45) DEFAULT NULL,
  `observacion` varchar(45) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT NULL,
  `rutaImagen` varchar(200) DEFAULT NULL,
  `clase_a` tinyint(1) DEFAULT NULL,
  `clase_b` tinyint(1) DEFAULT NULL,
  `clase_c` tinyint(1) DEFAULT NULL,
  `clase_d` tinyint(1) DEFAULT NULL,
  `clase_e` tinyint(1) DEFAULT NULL,
  `clase_f` tinyint(1) DEFAULT NULL,
  `clase_g` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_titular`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `titular`
--

LOCK TABLES `titular` WRITE;
/*!40000 ALTER TABLE `titular` DISABLE KEYS */;
INSERT INTO `titular` VALUES (2,'Hardy','Hugo','DNI','30175434','1','Parana',1,NULL,NULL,'0','Lentes',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,'Domato','Tania','DNI','31398030','1','321',1,'RH -',NULL,'0','lkj',1,NULL,1,0,0,0,0,0,0),(4,'Hardy','Hugo','DNI','30175437','','j bach',1,'RH -',NULL,'0','Lentes',1,'C:\\hugo2.png',1,1,0,0,0,0,0),(5,'Hardy','Alexis','DNI','31398038','','Buenos Aires',1,'RH +',NULL,'A','123',1,'',0,0,0,1,0,0,0),(9,'hardy','ale','DNI','123','','',0,'RH +',NULL,'0','',1,'',1,1,0,0,0,0,0),(10,'domato ','ta','DNI','321','','',0,'RH +','3886-07-27 00:00:00','0','',1,'',1,0,0,1,0,0,0),(11,'pipo','gorosito','DNI','654','','',1,'RH +','3909-11-15 00:00:00','0','',1,'',0,1,0,0,0,0,0),(12,'hardy','hugo','DNI','456','','',0,'RH -','3884-02-15 00:00:00','0','',1,'',0,0,0,1,0,0,0),(13,'yiyo','hector','DNI','987','','',0,'RH +','3911-11-01 00:00:00','0','',1,'',0,0,0,0,0,0,1),(14,'prueba','prueba','DNI','147','','',0,'RH +','3910-09-08 00:00:00','0','',1,'',0,0,0,1,0,0,0),(15,'uno','uno','DNI','369','','',0,'RH +','2009-06-09 00:00:00','0','',1,'',1,0,0,0,0,0,0),(16,'Dos','Dos','DNI','123','','',0,'RH +','2015-11-02 00:00:00','0','',1,'',1,0,0,0,0,0,0),(17,'Tres','Tres','DNI','123','','',0,'RH +','2015-11-15 00:00:00','0','',1,'',0,0,0,0,1,0,0),(18,'Hardy','Alexis','CI','321','','',0,'RH +','1985-10-03 00:00:00','0','',1,'C:\\Users\\HARDY\\Pictures\\fotis\\vieji.jpg',1,0,0,0,0,0,0);
/*!40000 ALTER TABLE `titular` ENABLE KEYS */;
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
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trg_titular_in 
AFTER INSERT ON titular FOR EACH ROW 
BEGIN 
INSERT INTO log_titular 
(fecha_modificacion,id_usuario,id_titular) 
VALUES (now(),1,new.id_titular);

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

-- Dump completed on 2015-11-27 11:41:49
