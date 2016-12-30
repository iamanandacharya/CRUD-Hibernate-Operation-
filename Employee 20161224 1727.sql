-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.7.15-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema employee
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ employee;
USE employee;

--
-- Table structure for table `employee`.`employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `empId` int(15) unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `phone` int(15) unsigned DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `role` varchar(45) DEFAULT NULL,
  `date_of_birth` date DEFAULT '0000-00-00',
  PRIMARY KEY (`empId`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee`.`employee`
--

/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`empId`,`first_name`,`last_name`,`address`,`phone`,`gender`,`role`,`date_of_birth`) VALUES 
 (29,'Test2','Test2','xyz Tober\r\nOp-Xyz Petrol Pump\r\nNR xyz Tower\r\nVadodara\r\nGujarat ',789,'male','Manager','0027-12-28'),
 (30,'Test','Test2',' xyz Tober Op-Xyz Petrol Pump NR xyz Tower Vadodara Gujarat',456,'male','Manager','0027-12-28');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
