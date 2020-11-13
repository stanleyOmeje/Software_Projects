-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 13, 2020 at 08:56 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `capp_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `contact`
--

CREATE TABLE `contact` (
  `contactid` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address` varchar(150) NOT NULL,
  `remark` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contact`
--

INSERT INTO `contact` (`contactid`, `userid`, `name`, `phone`, `email`, `address`, `remark`) VALUES
(1, 1, 'Uche', '090876599', 'uche@gmail.com', 'Ibadan', 'Good'),
(3, 3, 'Temitope', '090876599', 'temi.chi@gmail.com', 'Ibadan', 'Ok'),
(11, 15, 'NKECHI', '08147470719', 'nk@gmail.com', 'idimu', 'mum'),
(19, 24, '', '', '', '', ''),
(20, 24, '', '', '', '', ''),
(22, 23, '', '', '', '', ''),
(25, 24, '', '', '', '', ''),
(26, 24, '', '', '', '', ''),
(27, 24, '', '', '', '', ''),
(29, 19, 'OMEJE CHIDOZIE STANLEY', '08066635427', 'omejechidozie@gmail.com', 'LAG', 'FRIEND'),
(30, 19, 'Product', '08066635427', 'prod@gmail.com', 'LAG', 'sake'),
(38, 15, 'OMEJE CHIDOZIE STANLEY', '08066635427', 'wale@yahoo.com', 'LAG', 'FRIEND'),
(43, 19, 'Gbenga Oshin', '08088877666', 'gben@gmail.com', 'Las', 'Friend');

-- --------------------------------------------------------

--
-- Table structure for table `contactid`
--

CREATE TABLE `contactid` (
  `contactid` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address` varchar(150) NOT NULL,
  `remark` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `userid` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address` varchar(150) NOT NULL,
  `loginName` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `role` int(11) NOT NULL,
  `loginStatus` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userid`, `name`, `phone`, `email`, `address`, `loginName`, `password`, `role`, `loginStatus`) VALUES
(1, 'stan', '08066635427', 'stan@yahoo.com', 'lagos', 'v', 'me', 1, 1),
(2, 'Kelech', '090876543', 'kel.gmail.com', 'Ibadan', 'Khelz', 'kelebobo', 1, 1),
(3, 'AmaraChi', '090876599', 'arara.chi@gmail.com', 'Ibadan', 'Marax', 'presbobo', 1, 1),
(4, 'IK', '090876599', 'ik@gmail.com', 'Ibadan', 'Marax', 'presbobo', 1, 1),
(6, 'AC', '090876599', 'arara.chi@gmail.com', 'Ibadan', 'Marax', 'presbobo', 1, 1),
(7, 'Uc', '090876599', 'uche@gmail.com', 'Ibadan', 'Marax', 'presbobo', 1, 1),
(8, 'Ayo', '090876599', 'ayo@gmail.com', 'Ibadan', 'Marax', 'presbobo', 1, 1),
(9, 'Ego', '090876599', 'ayo@gmail.com', 'Ibadan', 'Marax', 'presbobo', 2, 1),
(10, 'Nkechi', '090876599', 'nk.chi@gmail.com', 'Lagos', 'Marax', 'presbobo', 1, 1),
(11, 'Baba', '090876599', 'nk@gmail.com', 'Ibadan', 'Marax', 'presbobo', 2, 1),
(12, 'Chidi', '090876599', 'nk@gmail.com', 'Ibadan', 'chi', 'stan', 2, 1),
(13, 'Chidozie', '090876599', 'nk@gmail.com', 'Ibadan', 'chid', 'stan1', 2, 2),
(14, 'dozie', '090876599', 'nk@gmail.com', 'Ibadan', 'd', 'st', 2, 1),
(15, '', '', '', '', 'v', 'me', 2, 1),
(16, 'Riches', '09088888888', 'richies@gmail.com', 'lagos', 'rc', 'rc', 2, 1),
(17, 'Ifeoms', '0807777777', 'ify@gmail.com', 'Lagos', 'ify', 'ify', 2, 1),
(18, 'Riches', '09088888888', 'dd', 'lagos', 'ify', 'ify', 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `userid` int(11) NOT NULL,
  `name` varchar(80) NOT NULL,
  `phone` varchar(80) NOT NULL,
  `email` varchar(80) NOT NULL,
  `address` varchar(150) NOT NULL,
  `loginName` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `role` int(11) NOT NULL,
  `loginStatus` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`userid`, `name`, `phone`, `email`, `address`, `loginName`, `password`, `role`, `loginStatus`) VALUES
(1, 'Stan', 'o8o66635427', 'stan@gmail.com', 'lagos', 'stan', 'stan', 2, 1),
(15, 'kelechi', '08138281168', 'nwaigwekelechi1@gmail.com', 'Idimu', 'kelechi', 'kc', 2, 1),
(17, 'kele', '585', 'dd', 'lagos', 'kelech', 'kc', 2, 1),
(19, 'Dele', '090888', 'dele@gmail.com', 'Lagos', 'dele', 'delta', 2, 1),
(21, 'Riches', '09088888888', 'dd', 'lagos', 'gbenga', 'gbenga', 2, 1),
(23, '', '', '', '', '', '', 2, 1),
(24, 'Babajide', 'Hamed', 'jide@gmail.com', 'lagos', 'jide', 'jd', 2, 1),
(25, 'Me', '09088888888', 'richies@gmail.com', 'lagos', 'check', 'check', 2, 1),
(26, 'Julie', '090876599', 'nk@gmail.com', 'Ibadan', 'd', 'st', 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `contact`
--
ALTER TABLE `contact`
  ADD PRIMARY KEY (`contactid`);

--
-- Indexes for table `contactid`
--
ALTER TABLE `contactid`
  ADD PRIMARY KEY (`contactid`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userid`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`userid`),
  ADD UNIQUE KEY `c_ln` (`loginName`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `contact`
--
ALTER TABLE `contact`
  MODIFY `contactid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;

--
-- AUTO_INCREMENT for table `contactid`
--
ALTER TABLE `contactid`
  MODIFY `contactid` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `userid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `userid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
