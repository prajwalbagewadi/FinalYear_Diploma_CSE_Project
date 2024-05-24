-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 04, 2018 at 07:26 AM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `heuristic`
--

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE IF NOT EXISTS `result` (
  `cost` varchar(100) NOT NULL,
  `perDay` varchar(100) NOT NULL,
  `threeMonth` varchar(100) NOT NULL,
  `sixMonth` varchar(100) NOT NULL,
  `perYear` varchar(100) NOT NULL,
  `threeYear` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`cost`, `perDay`, `threeMonth`, `sixMonth`, `perYear`, `threeYear`) VALUES
('5.09421096781392', '122.26106322753408', '11003.495690478067', '22006.991380956133', '44625.28807804994', '133875.8642341498');

-- --------------------------------------------------------

--
-- Table structure for table `result2`
--

CREATE TABLE IF NOT EXISTS `result2` (
  `cost` varchar(100) NOT NULL,
  `perDay` varchar(100) NOT NULL,
  `threeMonth` varchar(100) NOT NULL,
  `sixMonth` varchar(100) NOT NULL,
  `perYear` varchar(100) NOT NULL,
  `threeYear` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `result2`
--

INSERT INTO `result2` (`cost`, `perDay`, `threeMonth`, `sixMonth`, `perYear`, `threeYear`) VALUES
('5.267651130796044', '126.42362713910506', '11378.126442519457', '22756.252885038914', '46144.62390577335', '138433.87171732006');
