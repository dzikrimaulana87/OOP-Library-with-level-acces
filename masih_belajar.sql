-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 25, 2023 at 01:39 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `masih_belajar`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `kode_buku` varchar(25) NOT NULL,
  `judul_buku` varchar(25) NOT NULL,
  `tanggal_beli` date NOT NULL,
  `pengarang` varchar(25) NOT NULL,
  `penerbit` varchar(25) NOT NULL,
  `tahun_terbit` int(11) NOT NULL,
  `jumlah_buku` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`kode_buku`, `judul_buku`, `tanggal_beli`, `pengarang`, `penerbit`, `tahun_terbit`, `jumlah_buku`) VALUES
('0', '0', '2023-01-19', '0', '0', 0, 0),
('0000', '1', '2023-01-12', '1', '1', 1, 0),
('BIO', 'Ir.Soekarno', '2022-08-05', 'Dzikri', 'Erlangga', 148, 19),
('dawd121', 'dawdad', '2021-09-02', 'dawd', 'adadw', 121, 1208),
('NLV001', 'pkii2', '2023-09-01', 'adawd', 'awda', 121, 2121),
('NVL002', 'Tangga Darurat99', '2020-04-14', 'Reza Riefa', 'WattPad899', 2020, 0);

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `kode_peminjaman` varchar(25) NOT NULL,
  `tanggal_pinjam` date NOT NULL,
  `nis` varchar(25) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `kelas` varchar(25) NOT NULL,
  `kode_buku` varchar(25) NOT NULL,
  `judul_buku` varchar(25) NOT NULL,
  `jumlah_buku` int(11) NOT NULL,
  `id_petugas` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `peminjaman`
--

INSERT INTO `peminjaman` (`kode_peminjaman`, `tanggal_pinjam`, `nis`, `nama`, `kelas`, `kode_buku`, `judul_buku`, `jumlah_buku`, `id_petugas`) VALUES
('12121212', '2023-12-21', '17180552', 'Reza Chaerul fajri', 'XII RPL', 'dawd121', 'dawdad', 1, '4'),
('122121', '2023-12-02', '17180556', 'Rizky Fahrureza', 'XII RPL', 'BIO', 'Ir.Soekarno', 1, '4'),
('13', '2023-12-21', '17180552', 'Reza Chaerul fajri', 'XII RPL', 'dawd121', 'dawdad', 1, '69'),
('69', '2023-12-20', '17180556', 'Rizky Fahrureza', 'XII RPL', 'dawd121', 'dawdad', 1, '69'),
('699', '2023-12-25', '171805432', 'Fajar Alvian', 'XII TKR 1', '0000', '1', 1, '55');

-- --------------------------------------------------------

--
-- Table structure for table `pengembalian`
--

CREATE TABLE `pengembalian` (
  `kode_pengembalian` varchar(25) NOT NULL,
  `tanggal_pengembalian` date NOT NULL,
  `kode_peminjaman` varchar(25) NOT NULL,
  `tanggal_pinjam` date DEFAULT NULL,
  `nis` int(11) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `kelas` varchar(25) NOT NULL,
  `kode_buku` varchar(25) NOT NULL,
  `nama_buku` varchar(25) NOT NULL,
  `jumlah_buku` int(11) NOT NULL,
  `keterlambatan` varchar(25) NOT NULL,
  `denda` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pengembalian`
--

INSERT INTO `pengembalian` (`kode_pengembalian`, `tanggal_pengembalian`, `kode_peminjaman`, `tanggal_pinjam`, `nis`, `nama`, `kelas`, `kode_buku`, `nama_buku`, `jumlah_buku`, `keterlambatan`, `denda`) VALUES
('P0BIO552', '2023-12-29', '13', '2023-12-20', 17180552, 'Reza Chaerul fajri', 'XII RPL', 'dawd121', 'dawdad', 1, '0', 0),
('P0dawd121556', '2023-12-22', '69', '2023-12-20', 17180556, 'Rizky Fahrureza', 'XII RPL', 'dawd121', 'dawdad', 1, '0', 0);

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `id_petugas` varchar(25) NOT NULL,
  `nama_petugas` varchar(25) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `level` enum('admin','superadmin') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`id_petugas`, `nama_petugas`, `username`, `password`, `level`) VALUES
('1', 'Riefaa', 'admin', '123', 'admin'),
('3', 'Rizky', 'tarmin007', 'tarmin007', 'superadmin'),
('4', 'ahmad', 'ahmad123', 'rplmutu', 'admin'),
('55', 'Rizal', 'rizal', 'rizal', 'admin'),
('666', 'sample', 'sample', 'sample', 'superadmin'),
('69', 'dzikri', 'dzikri', 'dzikri', 'superadmin');

-- --------------------------------------------------------

--
-- Table structure for table `siswa`
--

CREATE TABLE `siswa` (
  `nis` varchar(25) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `kelas` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `siswa`
--

INSERT INTO `siswa` (`nis`, `nama`, `kelas`) VALUES
('171805432', 'Fajar Alvian', 'XII TKR 1'),
('17180552', 'Reza Chaerul fajri', 'XII RPL'),
('17180556', 'Rizky Fahrureza', 'XII RPL'),
('17180557', 'Reza', 'XII RPL');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`kode_buku`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`kode_peminjaman`),
  ADD KEY `nis` (`nis`),
  ADD KEY `kode_buku` (`kode_buku`),
  ADD KEY `id_petugas` (`id_petugas`);

--
-- Indexes for table `pengembalian`
--
ALTER TABLE `pengembalian`
  ADD PRIMARY KEY (`kode_pengembalian`),
  ADD UNIQUE KEY `uique_peminjaman` (`kode_peminjaman`),
  ADD KEY `kode_peminjaman` (`kode_peminjaman`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id_petugas`);

--
-- Indexes for table `siswa`
--
ALTER TABLE `siswa`
  ADD PRIMARY KEY (`nis`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD CONSTRAINT `peminjaman_ibfk_2` FOREIGN KEY (`kode_buku`) REFERENCES `buku` (`kode_buku`),
  ADD CONSTRAINT `peminjaman_ibfk_3` FOREIGN KEY (`nis`) REFERENCES `siswa` (`nis`),
  ADD CONSTRAINT `peminjaman_ibfk_4` FOREIGN KEY (`id_petugas`) REFERENCES `petugas` (`id_petugas`),
  ADD CONSTRAINT `peminjaman_ibfk_5` FOREIGN KEY (`nis`) REFERENCES `siswa` (`nis`) ON DELETE CASCADE,
  ADD CONSTRAINT `peminjaman_ibfk_6` FOREIGN KEY (`nis`) REFERENCES `siswa` (`nis`) ON DELETE CASCADE;

--
-- Constraints for table `pengembalian`
--
ALTER TABLE `pengembalian`
  ADD CONSTRAINT `pengembalian_ibfk_1` FOREIGN KEY (`kode_peminjaman`) REFERENCES `peminjaman` (`kode_peminjaman`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
