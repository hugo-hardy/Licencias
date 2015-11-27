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
-- Table structure for table `log_titular`
--

DROP TABLE IF EXISTS `log_titular`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `log_titular` (
  `id_log_titular` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_modificacion` datetime DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `id_titular` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_log_titular`),
  KEY `fk_id_titular_lt_idx` (`id_titular`),
  CONSTRAINT `fk_id_titular_lt` FOREIGN KEY (`id_titular`) REFERENCES `titular` (`id_titular`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `log_titular`
--

LOCK TABLES `log_titular` WRITE;
/*!40000 ALTER TABLE `log_titular` DISABLE KEYS */;
INSERT INTO `log_titular` VALUES (1,'2015-11-15 08:13:55',1,9),(2,'2015-11-15 08:30:58',1,10),(3,'2015-11-15 08:32:17',1,11),(4,'2015-11-15 08:34:41',1,12),(5,'2015-11-15 09:48:24',1,13),(6,'2015-11-15 09:56:49',1,14),(7,'2015-11-15 09:58:16',1,15),(8,'2015-11-15 10:04:23',1,16),(9,'2015-11-15 10:05:00',1,17),(10,'2015-11-15 10:44:32',1,18);
/*!40000 ALTER TABLE `log_titular` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-11-27 11:41:50
