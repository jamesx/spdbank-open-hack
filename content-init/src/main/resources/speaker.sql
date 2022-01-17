/*
Navicat MySQL Data Transfer

Source Server         : 192.168.56.103
Source Server Version : 50736
Source Host           : 192.168.56.103:3306
Source Database       : training

Target Server Type    : MYSQL
Target Server Version : 50736
File Encoding         : 65001

Date: 2021-10-27 16:32:33
*/

SET FOREIGN_KEY_CHECKS=0;

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

-- ----------------------------
-- Records of speaker
-- ----------------------------
INSERT INTO `speaker` VALUES ('593576b4-5569-45a6-995c-9906edad96bf', '', '', '', null, '<b>Prof Lesley Jones</b> has a long-standing interest in neurodegeneration, particularly in Huntington’s (HD) and Alzheimer’s disease (AD).  She has organised and performed genetic and genomic studies in HD and AD, analysed mouse models of disease and determined the biological mechanisms through which the diseases work, to identify new targets for therapies. In AD her pathway analysis papers highlighted the aetiological contribution of the immune system to AD that now forms a key area of therapeutic research. In HD her leadership in the Genetic Modifiers of HD consortium and in other repeat diseases provide novel avenues for therapeutic exploitation in DNA repair that inform her current research.', 'Cardiff University School of Medicine, Cardiff, UK', 'Lesley', 'false', 'none', 'Jones', 'speaker2.jpg', '1125', 'Prof');
INSERT INTO `speaker` VALUES ('676dfb23-a7c4-4816-9ae3-5bcbcc120d52', '', '', '', null, '<b>John C Morris</b> MD is the Friedman Distinguished Professor of Neurology and Director of the Charles F. and Joanne Knight Alzheimer\'s Disease Research Center at Washington University School of Medicine. Dr. Morris has more than 500 published articles. He has received many honors and awards, including the Lifetime Achievement Award from the Alzheimer’s Association (2002); the MetLife Award for Medical Research in Alzheimer’s Disease (2004); the Potamkin Prize for Research in Pick’s, Alzheimer’s, and Related Dementias (2005); and the Peter H. Raven Lifetime Achievement Award from the Academy of Science St. Louis. He is ranked in the top 1% of investigators in the field of Neuroscience and Behavior by Essential Science Indicators database.', 'Washington University School of Medicine, St Louis, Missouri, USA', 'John', 'false', 'Fall2015', 'Morris', 'speaker4.jpg', '1013', 'MD');
INSERT INTO `speaker` VALUES ('e861e978-ad64-4e89-804c-4e19d339241f', '', '', '', null, '<b>Geoff Nichol</b> BMed Sc, MB, ChB, MBA, FRACP is currently Executive Vice President of Research and Development at Sangamo BioSciences in San Francisco, USA.  He has over 20 years of experience in the pharmaceutical and biotechnology industries, and has been closely associated with the development of over 15 new drug candidates and the approval or launch of several marketed drugs, including Augmentin BID (amoxicillin/clavulanate), Foradil (formoterol) and Yervoy (ipilimumab). He started his career in drug development with SmithKline Beecham, then served on the senior global development management team at Novartis. He then led all aspects of product development for Medarex Inc, pioneering the pharmaceutical development of the novel immunotherapeutic antibodies ipilimumab, the first agent to improve survival in advanced melanoma, and nivolumab. Following the acquisition of Medarex by Bristol-Myers Squibb Company in 2009, he served as CMO at Ikaria prior to joining Sangamo.', 'Sangamo BioSciences, USA', 'Geoffrey', 'false', 'Fall2015', 'Nichol', 'speaker1.jpg', '1021', 'Dr');
