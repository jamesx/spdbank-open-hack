/*
Navicat MySQL Data Transfer

Source Server         : 192.168.56.103
Source Server Version : 50736
Source Host           : 192.168.56.103:3306
Source Database       : training

Target Server Type    : MYSQL
Target Server Version : 50736
File Encoding         : 65001

Date: 2021-10-27 16:16:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for session
-- ----------------------------
DROP TABLE IF EXISTS `session`;
CREATE TABLE `session` (
  `id` varchar(255) NOT NULL DEFAULT '1',
  `speakerNames` varchar(255) DEFAULT NULL,
  `speakers` varchar(255) DEFAULT NULL,
  `trackNames` varchar(255) DEFAULT NULL,
  `tracks` varchar(255) DEFAULT NULL,
  `v` int(11) DEFAULT NULL,
  `my_abstract` longtext,
  `date` varchar(255) DEFAULT NULL,
  `endTime` date DEFAULT NULL,
  `eventName` varchar(255) DEFAULT NULL,
  `hidden` varchar(255) DEFAULT NULL,
  `roomID` int(11) DEFAULT NULL,
  `roomName` varchar(255) DEFAULT NULL,
  `sessionID` int(11) DEFAULT '1',
  `sessioncode` varchar(255) DEFAULT NULL,
  `startTime` date DEFAULT NULL,
  `timeSlot` int(11) DEFAULT NULL,
  `title` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for speaker
-- ----------------------------
DROP TABLE IF EXISTS `speaker`;
CREATE TABLE `speaker` (
  `id` varchar(255) NOT NULL,
  `sessions` varchar(255) DEFAULT NULL,
  `sessionscodes` varchar(255) DEFAULT NULL,
  `tracks` varchar(255) DEFAULT NULL,
  `v` int(11) DEFAULT NULL,
  `bio` longtext,
  `company` varchar(255) DEFAULT NULL,
  `first` varchar(255) DEFAULT NULL,
  `hidden` varchar(255) DEFAULT NULL,
  `inShow` varchar(255) DEFAULT NULL,
  `last` varchar(255) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `speakerID` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
