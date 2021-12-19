-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 19, 2021 at 10:49 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.4.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `notes`
--

-- --------------------------------------------------------

--
-- Table structure for table `notes_table`
--

CREATE TABLE `notes_table` (
  `noteId` int(11) NOT NULL,
  `addedDate` datetime DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `notes_table`
--

INSERT INTO `notes_table` (`noteId`, `addedDate`, `content`, `title`) VALUES
(658088, '2021-12-11 16:58:40', ' Java \r\n Aptitude Training\r\n HTML\r\n CSS\r\n JavaScript\r\n\r\ndsfsdfjksdfjk fjkdsf jksd fjksf skjdfks dfjksdf sdfj sfjksjf ksjfks dfsjkdf f', 'Learing Content'),
(877442, '2021-12-19 12:57:10', 'Rohan Jadhav', 'rohan'),
(283387, '2021-12-19 14:06:45', 'titljfkdfj kfjkdf', 'java');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `notes_table`
--
ALTER TABLE `notes_table`
  ADD PRIMARY KEY (`noteId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
