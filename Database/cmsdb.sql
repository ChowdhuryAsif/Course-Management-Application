-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 08, 2019 at 01:08 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cmsdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `applicationdetails`
--

CREATE TABLE `applicationdetails` (
  `applicationNo` int(1) NOT NULL,
  `researchTopicName` varchar(50) NOT NULL,
  `mem1ID` int(11) NOT NULL,
  `mem1Name` varchar(30) NOT NULL,
  `mem1Status` tinyint(1) NOT NULL DEFAULT '1',
  `mem2ID` int(11) DEFAULT NULL,
  `mem2Name` varchar(30) DEFAULT NULL,
  `mem2Status` tinyint(1) DEFAULT '0',
  `mem3ID` int(11) DEFAULT NULL,
  `mem3Name` varchar(30) DEFAULT NULL,
  `mem3Status` tinyint(1) DEFAULT '0',
  `supervisorName` varchar(30) NOT NULL,
  `supervisorStatus` tinyint(1) NOT NULL DEFAULT '0',
  `applicationStatus` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `applicationdetails`
--

INSERT INTO `applicationdetails` (`applicationNo`, `researchTopicName`, `mem1ID`, `mem1Name`, `mem1Status`, `mem2ID`, `mem2Name`, `mem2Status`, `mem3ID`, `mem3Name`, `mem3Status`, `supervisorName`, `supervisorStatus`, `applicationStatus`) VALUES
(25, 'Research1', 201710015, 'Chowdhury Asif', 1, 201610003, 'Tanvir Sojal', 1, NULL, 'null', 0, 'SM', 1, 1),
(26, 'Research2', 201710015, 'Chowdhury Asif', 1, NULL, 'null', 0, NULL, 'null', 0, 'KMH', 0, 0),
(27, 'Research3', 201710015, 'Chowdhury Asif', 1, NULL, 'null', 0, NULL, 'null', 0, 'RB', 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `deadline`
--

CREATE TABLE `deadline` (
  `semesterID` varchar(20) NOT NULL,
  `researchApplicationDeadline` date NOT NULL,
  `facultyApprovalDeadline` date NOT NULL,
  `applicationApprovalDeadline` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `deadline`
--

INSERT INTO `deadline` (`semesterID`, `researchApplicationDeadline`, `facultyApprovalDeadline`, `applicationApprovalDeadline`) VALUES
('Summer2019', '2019-05-15', '2019-05-20', '2019-06-25'),
('Fall2019', '2019-09-15', '2019-09-20', '2019-09-25'),
('Spring2019', '2019-01-15', '2019-01-20', '2019-01-25');

-- --------------------------------------------------------

--
-- Table structure for table `semester`
--

CREATE TABLE `semester` (
  `semesterID` varchar(20) NOT NULL,
  `semesterStart` date NOT NULL,
  `semesterEnd` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `semester`
--

INSERT INTO `semester` (`semesterID`, `semesterStart`, `semesterEnd`) VALUES
('Fall2019', '2019-09-01', '2019-12-31'),
('Spring2019', '2019-01-01', '2019-04-30'),
('Summer2019', '2019-05-01', '2019-08-31');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `studentId` int(11) NOT NULL,
  `studentName` varchar(30) NOT NULL,
  `studentEmail` varchar(30) NOT NULL,
  `studentPass` varchar(30) NOT NULL,
  `registeredForCSE4000` tinyint(1) NOT NULL,
  `researchConfirmation` tinyint(1) NOT NULL DEFAULT '0',
  `applicationCount` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`studentId`, `studentName`, `studentEmail`, `studentPass`, `registeredForCSE4000`, `researchConfirmation`, `applicationCount`) VALUES
(201510028, 'Md. Ziaul Hoque', 'zhbdripon@gmail.com', '201510028', 0, 0, 0),
(201510130, 'Md. Rana Hossain', 'ranasl62@gmail.com', '201510130', 0, 0, 0),
(201510140, 'Shihab Hossain', 'shihabhossain611@gmail.com', '201510140', 0, 0, 0),
(201520021, 'Morshed Alam Raju', 'rajuseu5@gmail.com', '201520021', 0, 0, 0),
(201610001, 'Abdullah Al Jamil', 'jamilahmed284@gmail.com', '201610001', 0, 0, 0),
(201610003, 'Tanvir Sojal', 'tanvirahmedsojal@gmail.com', '201610003', 1, 1, 0),
(201610034, 'Md. Akrabul Islam', 'akrabulislam1@gmail.com', '201610034', 0, 0, 0),
(201620058, 'Atikur Rahman', 'atikur1998@yahoo.com', '201620058', 0, 0, 0),
(201700037, 'Anik Chakrabortty', 'anikchakrabortty22@gmail.com', '201700037', 0, 0, 0),
(201710007, 'Israt Jahan', 'isratjahaneva4256@gmail.com', '201710007', 0, 0, 0),
(201710010, 'Musharrat Tabassum', 'musharrattabassum710@gmail.com', '201710010', 0, 0, 0),
(201710015, 'Chowdhury Asif', 'chowdhuy.asif.cse@gmail.com', '201710015', 1, 1, 3),
(201710031, 'Zawad Zamil', 'heartsick77@gmail.com', '201710031', 0, 0, 0),
(201710038, 'Md.Shajalal', 'shah.jalal0894@gmail.com', '201710038', 0, 0, 0),
(201710039, 'Tasnim Raihan', 'tasnimraihan28@gmail.com ', '201710039', 0, 0, 0),
(201710049, 'ZM. Rakib Hasan', 'eshan765@gmail.com', '201710049', 0, 0, 0),
(201710051, 'Md. Najmul Hasan', 'shaikhzayed37@gmail.com', '201710051', 0, 0, 0),
(201710085, 'Mst.Rumpa Islam', 'rumpa.islam628780@gmail.com', '201710085', 0, 0, 0),
(201710102, 'Himika Sultana', 'himika102@gmail.com', '201710102', 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `supervisor`
--

CREATE TABLE `supervisor` (
  `facultyInitial` varchar(10) NOT NULL,
  `facultyName` varchar(30) NOT NULL,
  `facultyStudentCount` int(11) NOT NULL,
  `facultyPass` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supervisor`
--

INSERT INTO `supervisor` (`facultyInitial`, `facultyName`, `facultyStudentCount`, `facultyPass`) VALUES
('AHQ', 'Ashraful Hoque', 0, 'AHQ'),
('AR', 'Ashikur Rahman', 0, 'AR'),
('HT', 'Hasan Tareque', 0, 'HT'),
('KIA', 'Kimia Aksir', 0, 'KIA'),
('KMH', 'Monirul Hasan', 0, 'KMH'),
('MAHB', 'Mahbub Hasan', 0, 'MAHB'),
('RB', 'Rajon Bardhan', 0, 'RB'),
('RIK', 'Rezwan-Al-Islam Khan', 0, 'RIK'),
('SM', 'Shahriar Manzoor', 2, 'SM');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `applicationdetails`
--
ALTER TABLE `applicationdetails`
  ADD PRIMARY KEY (`applicationNo`),
  ADD KEY `mem1ID` (`mem1ID`),
  ADD KEY `mem2ID` (`mem2ID`),
  ADD KEY `mem3ID` (`mem3ID`),
  ADD KEY `supervisorName` (`supervisorName`);

--
-- Indexes for table `deadline`
--
ALTER TABLE `deadline`
  ADD KEY `semesterID` (`semesterID`);

--
-- Indexes for table `semester`
--
ALTER TABLE `semester`
  ADD PRIMARY KEY (`semesterID`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`studentId`);

--
-- Indexes for table `supervisor`
--
ALTER TABLE `supervisor`
  ADD PRIMARY KEY (`facultyInitial`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `applicationdetails`
--
ALTER TABLE `applicationdetails`
  MODIFY `applicationNo` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `applicationdetails`
--
ALTER TABLE `applicationdetails`
  ADD CONSTRAINT `applicationdetails_ibfk_1` FOREIGN KEY (`mem1ID`) REFERENCES `student` (`studentId`),
  ADD CONSTRAINT `applicationdetails_ibfk_2` FOREIGN KEY (`mem2ID`) REFERENCES `student` (`studentId`),
  ADD CONSTRAINT `applicationdetails_ibfk_3` FOREIGN KEY (`mem3ID`) REFERENCES `student` (`studentId`),
  ADD CONSTRAINT `applicationdetails_ibfk_4` FOREIGN KEY (`supervisorName`) REFERENCES `supervisor` (`facultyInitial`);

--
-- Constraints for table `deadline`
--
ALTER TABLE `deadline`
  ADD CONSTRAINT `deadline_ibfk_1` FOREIGN KEY (`semesterID`) REFERENCES `semester` (`semesterID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
