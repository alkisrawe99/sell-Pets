-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 21, 2022 at 04:01 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pl`
--

-- --------------------------------------------------------

--
-- Table structure for table `pit`
--

DROP TABLE IF EXISTS `pit`;
CREATE TABLE IF NOT EXISTS `pit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `type` text NOT NULL,
  `age` int(5) NOT NULL,
  `price` int(10) NOT NULL,
  `seller_info` text NOT NULL,
  `video` text NOT NULL,
  `image` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pit`
--

INSERT INTO `pit` (`id`, `name`, `type`, `age`, `price`, `seller_info`, `video`, `image`) VALUES
(7, 'aa', 'watery', 21, 200, 'ahmed', 'C:\\Users\\User\\Videos\\Captures\\CLIPS 6.3 2021-06-06 03-01-57.mp4', 'C:\\Users\\User\\Pictures\\Capture.png'),
(3, 'cat', 'reptile', 55, 55, 'lala', '', 'C:\\Users\\User\\Desktop\\New folder (2)\\246229011_138720.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `email` text NOT NULL,
  `password` text NOT NULL,
  `image` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `name`, `email`, `password`, `image`) VALUES
(5, 's', 'fdq', 'ret', ''),
(2, 'ahmed', 'ahmed@gmail.com', '123', ''),
(3, 'a', 'a', 'a', ''),
(4, 'alaa', 'aa', 'aaa', ''),
(6, 's', 'fdq', 'a', ''),
(7, 'alaa', 'alaa', 'alaa', 'C:\\Users\\User\\Pictures\\FB_IMG_1529582738777.jpg'),
(8, 'hade', 'hade', '123', 'C:\\Users\\User\\Pictures\\FB_IMG_1529582738777.jpg'),
(9, 'roro', 'roro', '123', 'C:\\Users\\User\\Pictures\\FB_IMG_1529582738777.jpg'),
(10, 'soso', 'soso', '123', 'C:\\Users\\User\\Pictures\\Capture3.PNG'),
(11, 'alaa', 'alaa', '123', 'C:\\Users\\User\\Pictures\\Capture.png');

-- --------------------------------------------------------

--
-- Table structure for table `vendor`
--

DROP TABLE IF EXISTS `vendor`;
CREATE TABLE IF NOT EXISTS `vendor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `mobile` int(10) NOT NULL,
  `image` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vendor`
--

INSERT INTO `vendor` (`id`, `name`, `mobile`, `image`) VALUES
(3, 'ahmed', 987654321, 'C:\\Users\\User\\Pictures\\Capture.PNG'),
(4, 'ahmed', 987654321, 'C:\\Users\\User\\Pictures\\aiu.jpg'),
(5, 'ahmed', 987654321, 'C:\\Users\\User\\Pictures\\aiu.jpg'),
(6, 'ahmed', 987654321, 'C:\\Users\\User\\Pictures\\aiu.jpg'),
(7, 'ahmed', 987654321, 'C:\\Users\\User\\Pictures\\aiu.jpg'),
(8, 'ahmed', 987654321, 'C:\\Users\\User\\Pictures\\aiu.jpg'),
(10, 'ahmed', 987654321, 'C:\\Users\\User\\Pictures\\aiu.jpg'),
(11, 'ahmed', 987654321, 'C:\\Users\\User\\Pictures\\aiu.jpg'),
(12, 'ahmed', 987654321, 'C:\\Users\\User\\Pictures\\aiu.jpg'),
(13, 'ahmed', 987654321, 'C:\\Users\\User\\Pictures\\aiu.jpg'),
(14, 'ahmed', 987654321, 'C:\\Users\\User\\Pictures\\aiu.jpg');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
