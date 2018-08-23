/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.5.61 : Database - qujie
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`qujie` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `qujie`;

/*Table structure for table `address` */

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
  `add_id` int(11) NOT NULL,
  `add_city` varchar(10) DEFAULT NULL,
  `add_area` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`add_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `address` */

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `d_id` int(11) NOT NULL,
  `d_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`d_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `department` */

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `e_id` int(11) NOT NULL AUTO_INCREMENT,
  `e_name` varchar(20) NOT NULL,
  `e_email` varchar(20) DEFAULT NULL,
  `e_phone` varchar(20) DEFAULT NULL,
  `e_sex` char(1) DEFAULT NULL,
  `e_location_id` int(11) DEFAULT NULL,
  `e_dept_id` int(11) DEFAULT NULL,
  `salary` decimal(18,2) DEFAULT NULL,
  PRIMARY KEY (`e_id`),
  KEY `fk_emp_dept` (`e_dept_id`),
  KEY `fk_emp_add` (`e_location_id`),
  CONSTRAINT `fk_emp_add` FOREIGN KEY (`e_location_id`) REFERENCES `address` (`add_id`),
  CONSTRAINT `fk_emp_dept` FOREIGN KEY (`e_dept_id`) REFERENCES `department` (`d_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
