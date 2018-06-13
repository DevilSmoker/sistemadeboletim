# sistemadeboletim
projetinho maroto pra faturar 3 pontos 
CREATE DATABASE  IF NOT EXISTS `boletim` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `boletim`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: boletim
-- ------------------------------------------------------
-- Server version	5.7.15-log

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
-- Table structure for table `aluno`
--

DROP TABLE IF EXISTS `aluno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aluno` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(100) NOT NULL,
  `DT_NASCIMENTO` date NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aluno`
--

LOCK TABLES `aluno` WRITE;
/*!40000 ALTER TABLE `aluno` DISABLE KEYS */;
INSERT INTO `aluno` VALUES (1,'CHARLIE','1996-02-05'),(2,'JENNY','1994-02-15'),(3,'TODINHO','1990-04-20'),(4,'TATTY','1998-06-28');
/*!40000 ALTER TABLE `aluno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `aula`
--

DROP TABLE IF EXISTS `aula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aula` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DT_AULA` date NOT NULL,
  `FK_MATERIA` int(11) NOT NULL,
  `FK_PROFESSOR` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_PROFESSOR` (`FK_PROFESSOR`),
  KEY `FK_MATERIA` (`FK_MATERIA`),
  CONSTRAINT `aula_ibfk_1` FOREIGN KEY (`FK_PROFESSOR`) REFERENCES `professor` (`ID`),
  CONSTRAINT `aula_ibfk_2` FOREIGN KEY (`FK_MATERIA`) REFERENCES `materia` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aula`
--

LOCK TABLES `aula` WRITE;
/*!40000 ALTER TABLE `aula` DISABLE KEYS */;
/*!40000 ALTER TABLE `aula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `frequencia`
--

DROP TABLE IF EXISTS `frequencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `frequencia` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `FK_AULA` int(11) NOT NULL,
  `FK_ALUNO` int(11) NOT NULL,
  `PRESENTE` bit(1) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_AULA` (`FK_AULA`),
  KEY `FK_ALUNO` (`FK_ALUNO`),
  CONSTRAINT `frequencia_ibfk_1` FOREIGN KEY (`FK_AULA`) REFERENCES `aula` (`ID`),
  CONSTRAINT `frequencia_ibfk_2` FOREIGN KEY (`FK_ALUNO`) REFERENCES `aluno` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `frequencia`
--

LOCK TABLES `frequencia` WRITE;
/*!40000 ALTER TABLE `frequencia` DISABLE KEYS */;
/*!40000 ALTER TABLE `frequencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materia`
--

DROP TABLE IF EXISTS `materia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `materia` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MATERIA` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materia`
--

LOCK TABLES `materia` WRITE;
/*!40000 ALTER TABLE `materia` DISABLE KEYS */;
INSERT INTO `materia` VALUES (1,'LP 2 '),(2,'CALCULO '),(3,'ESTATISTICA'),(4,'BANCO DE DADOS');
/*!40000 ALTER TABLE `materia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nota`
--

DROP TABLE IF EXISTS `nota`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nota` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `FK_ALUNO` int(11) NOT NULL,
  `FK_MATERIA` int(11) NOT NULL,
  `NOTA1` float DEFAULT NULL,
  `PESO1` float DEFAULT NULL,
  `NOTA2` float DEFAULT NULL,
  `PESO2` float DEFAULT NULL,
  `MEDIA` float DEFAULT NULL,
  `NOTAF` float DEFAULT NULL,
  `MEDIAF` float DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_ALUNO` (`FK_ALUNO`),
  KEY `FK_MATERIA` (`FK_MATERIA`),
  CONSTRAINT `nota_ibfk_1` FOREIGN KEY (`FK_ALUNO`) REFERENCES `aluno` (`ID`),
  CONSTRAINT `nota_ibfk_2` FOREIGN KEY (`FK_MATERIA`) REFERENCES `materia` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nota`
--

LOCK TABLES `nota` WRITE;
/*!40000 ALTER TABLE `nota` DISABLE KEYS */;
INSERT INTO `nota` VALUES (1,1,1,7,NULL,7,NULL,NULL,NULL,NULL),(2,2,2,8,NULL,6,NULL,NULL,NULL,NULL),(3,3,3,9,NULL,5,NULL,NULL,NULL,NULL),(4,4,4,4.5,NULL,5,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `nota` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `professor`
--

DROP TABLE IF EXISTS `professor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `professor` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `professor`
--

LOCK TABLES `professor` WRITE;
/*!40000 ALTER TABLE `professor` DISABLE KEYS */;
INSERT INTO `professor` VALUES (1,'JONES'),(2,'DAVID'),(3,'JAMAL'),(4,'ATENA');
/*!40000 ALTER TABLE `professor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-13  1:37:55
