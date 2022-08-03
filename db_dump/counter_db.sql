CREATE DATABASE  IF NOT EXISTS `counter_db` DEFAULT CHARACTER SET utf8mb4;
USE `counter_db`;
DROP TABLE IF EXISTS `counter`;
CREATE TABLE `counter` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(15) DEFAULT NULL,
  `count` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

LOCK TABLES `counter` WRITE;
INSERT INTO `counter` VALUES (1,'First counter',5),(2,'Second counter',1),(3,'Third counter',1);
UNLOCK TABLES;