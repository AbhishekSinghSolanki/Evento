/*
SQLyog Enterprise - MySQL GUI v8.14 
MySQL - 5.7.17-log : Database - evento
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`evento` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `evento`;

/*Table structure for table `corpevent` */

DROP TABLE IF EXISTS `corpevent`;

CREATE TABLE `corpevent` (
  `S.no` int(20) NOT NULL AUTO_INCREMENT,
  `name` char(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `services` char(20) NOT NULL,
  `package` char(20) NOT NULL,
  `message` varchar(200) NOT NULL,
  PRIMARY KEY (`S.no`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `corpevent` */

insert  into `corpevent`(`S.no`,`name`,`email`,`services`,`package`,`message`) values (1,'Project Solaanki','abhi1996aug@yahoo.com','Conference','silver','hii'),(2,'abhishek','abhi1996aug@yahoo.com','Promo','gold','needed 10 hospitaly members ');

/*Table structure for table `liveevent` */

DROP TABLE IF EXISTS `liveevent`;

CREATE TABLE `liveevent` (
  `S.no` int(20) NOT NULL AUTO_INCREMENT,
  `name` char(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `services` char(20) NOT NULL,
  `package` char(20) NOT NULL,
  `message` varchar(200) NOT NULL,
  PRIMARY KEY (`S.no`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `liveevent` */

insert  into `liveevent`(`S.no`,`name`,`email`,`services`,`package`,`message`) values (1,'Project Solaanki','abhi1996aug@yahoo.com','liveconcert','silver','hii');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `username` char(25) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`username`,`password`) values ('abhi','0704');

/*Table structure for table `wedevent` */

DROP TABLE IF EXISTS `wedevent`;

CREATE TABLE `wedevent` (
  `S.no` int(20) NOT NULL AUTO_INCREMENT,
  `name` char(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `services` char(20) NOT NULL,
  `package` char(20) NOT NULL,
  `message` varchar(200) NOT NULL,
  PRIMARY KEY (`S.no`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `wedevent` */

insert  into `wedevent`(`S.no`,`name`,`email`,`services`,`package`,`message`) values (1,'Project Solaanki','abhi1996aug@yahoo.com','Seminar','platinum','hii'),(2,'yash','abhi1995Aug@gmail.com','Promo','platinum','yoyoyoyoyoy');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
