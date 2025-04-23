-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 17, 2023 at 11:44 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.0.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbclient`
--

-- --------------------------------------------------------

--
-- Table structure for table `datamember`
--

CREATE TABLE `datamember` (
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `datamember`
--

INSERT INTO `datamember` (`Username`, `Password`) VALUES
('Aku', 'www'),
('Andi', 'arif'),
('Farel', 'Dia'),
('Kamu', 'Bocak'),
('rosa', 'isahbau');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_akun`
--

CREATE TABLE `tbl_akun` (
  `Username` varchar(20) NOT NULL,
  `Harga` double(7,2) NOT NULL,
  `Waktu` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_akun`
--

INSERT INTO `tbl_akun` (`Username`, `Harga`, `Waktu`) VALUES
('Aku', 18000.00, '02:00:00.000000'),
('Andi', 0.00, '00:00:00.000000'),
('Farel', 85000.00, '15:00:00.000000'),
('Kamu', 50000.00, '10:00:00.000000'),
('rosa', 28000.00, '03:00:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_transaksi`
--

CREATE TABLE `tbl_transaksi` (
  `Tanggal` datetime(6) NOT NULL DEFAULT current_timestamp(6),
  `Username` varchar(20) NOT NULL,
  `Harga` double(7,2) NOT NULL,
  `Waktu` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_transaksi`
--

INSERT INTO `tbl_transaksi` (`Tanggal`, `Username`, `Harga`, `Waktu`) VALUES
('2023-06-12 00:00:00.000000', 'Aku', 10000.00, '01:00:00.000000'),
('2023-06-12 16:22:58.000000', 'Farel', 10000.00, '01:00:00.000000'),
('2023-06-12 19:31:16.000000', 'Aku', 10000.00, '01:00:00.000000'),
('2023-06-12 19:32:29.000000', 'rosa', 10000.00, '01:00:00.000000'),
('2023-06-12 19:35:06.000000', 'Farel', 50000.00, '10:00:00.000000'),
('2023-06-15 12:08:22.000000', 'rosa', 18000.00, '02:00:00.000000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datamember`
--
ALTER TABLE `datamember`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `tbl_akun`
--
ALTER TABLE `tbl_akun`
  ADD PRIMARY KEY (`Username`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_akun`
--
ALTER TABLE `tbl_akun`
  ADD CONSTRAINT `tbl_akun_ibfk_1` FOREIGN KEY (`Username`) REFERENCES `datamember` (`Username`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
