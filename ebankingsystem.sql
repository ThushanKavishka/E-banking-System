-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 09, 2017 at 04:22 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ebankingsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `cusName` varchar(50) NOT NULL,
  `birthdate` date NOT NULL,
  `address` varchar(50) NOT NULL,
  `mobile` varchar(50) NOT NULL,
  `email` varchar(75) NOT NULL,
  `accountType` varchar(50) NOT NULL,
  `accountNumber` varchar(50) NOT NULL,
  `sortCode` varchar(8) NOT NULL,
  `balance` double NOT NULL,
  `card` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`cusName`, `birthdate`, `address`, `mobile`, `email`, `accountType`, `accountNumber`, `sortCode`, `balance`, `card`) VALUES
('Jimmy', '1995-02-24', 'colombo', '07540154565', 'vjimmy.20@gmail.com', 'fixed', 'AQW4565', '5555', 250000, '5555'),
('Jane', '1960-02-25', 'colombo', '0775456585', 'jane@gmail.com', 'fixed', 'AQW5256545', '256544', 150000, '2525'),
('Gowthamy', '1995-02-20', 'colombo', '0754075980', 'vthamy.20@gmail.com', 'fixed', 'AWE2565485', '2525', 0.1, '5050'),
('Peter', '1998-02-26', 'colombo-06', '07545658545', 'ram@gmail.com', 'fixed', 'AWE45857595', '33333', 25000000, '50455');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `name` varchar(75) NOT NULL,
  `position` varchar(50) NOT NULL,
  `username` varchar(75) NOT NULL,
  `password` varchar(75) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`name`, `position`, `username`, `password`) VALUES
('Jane', 'Manager', 'jane', '1234'),
('Jimmy', 'Manager', 'jimmy', '12345'),
('peter', 'staffr', 'peter', '1234'),
('Gowthamy', 'Manager', 'thamy', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`accountNumber`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`username`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
