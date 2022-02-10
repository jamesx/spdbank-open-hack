-- MySQL dump 10.13  Distrib 5.7.33, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: fabmedical
-- ------------------------------------------------------
-- Server version	5.7.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `fabmedical`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `fabmedical` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `fabmedical`;

--
-- Table structure for table `session`
--

DROP TABLE IF EXISTS `session`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `session`
--

LOCK TABLES `session` WRITE;
/*!40000 ALTER TABLE `session` DISABLE KEYS */;
INSERT INTO `session` VALUES ('351302f5-4f18-49ec-89c7-a322506ce440','Miya Bernson-Leung,Theonia K. Boyd','','Anglebrackets','131',NULL,'<b>Objective:</b> Understand the relationship between placental abnormalities and neonatal stroke.<br/><b>Background:</b> Arterial ischemic stroke (AIS) and venous infarction (VI) affect 1 in 4,000 newborns. While maternal and fetal/neonatal factors exist, placental risk factors have not been well described.<br/><b>Methods:</b> We retrospectively reviewed patients with neonatal stroke at three academic medical centers from 2005-2015 and identified 46 cases with placental specimens, including 26 AIS and 18 VI. We identified 100 control newborns matched for gestational age and year with placentas collected for any indication. One pathologist reviewed all specimens. Stroke type was determined by consensus neuroimaging review.<br/><b>Results:</b> Forty-five of 46 cases (98%) and 95/100 controls had any abnormal finding; cases had significantly more by number and severity, as follows. Fifteen cases (33%) met pathologically defined criteria for two or more major categories of placental abnormality, compared to 8/100 controls (OR 5.56, ?² p<0.0001). Uteroplacental malperfusion occurred in 30% of cases and 20% of controls. Fetal vascular flow restriction occurred in 50% of cases and 17% of controls (OR 5.25, ?² p<0.0001). Amniotic fluid inflammation with maternal- and fetal-side response occurred in 32% of cases and 20% of controls; of cases, it occurred in 11 with AIS (39%) and 4 with VI (22%). There was evidence of non-acute stress (meconium plus many nucleated red blood cells) in 24% of cases and 1% of controls (OR 5.25, Fisher’s t-test p<0.0001), including 29% of AIS and 17% of VI.<br/><b>Conclusions:</b> Major placental abnormalities were common in stroke cases relative to controls, with trends towards different patterns in arterial versus venous stroke. Many findings were subacute to chronic and reflect intrauterine stressors that may predispose to acute stroke in the perinatal period. We are continuing to investigate these abnormalities and their implications for screening, monitoring, and even prevention of neonatal stroke.<br/>','05/19/2017','2021-10-27','2015 Spring','false',130,'PRINCESS F&G',1165,'AB08','2021-10-27',74,'Placental Pathology in Neonatal Stroke: A Retrospective Case-Control Study'),('59127513-1c1f-4232-ba9d-9f771a349f29','Theresa Zesiewicz','','Visual Studio/Azure intersection','124',NULL,'<b>Objective:</b> To evaluate the effects of EPI-743 in subjects with Parkinson’s disease (PD).<br/><b>Background:</b> Oxidative stress and energetic disturbances are thought to contribute to the pathogenesis of PD. EPI-743 (alpha-tocotrienol quinone) is an investigational drug targeting oxidoreductase enzymes essential for redox control of metabolism. In preclinical tests on primary cells from sporadic and mito-PD variants, EPI-743 provides protection against oxidative stress secondary to glutathione depletion.<br/><b>Methods:</b> This was a 6-month open label trial comparing 2 dose levels of orally administered EPI-743 (200 mg or 400 mg TID). Study outcomes included changes from baseline in UPDRS II and III “ON” scores, and brain metabolite levels as measured by 3T magnetic resonance spectroscopy (MRS). Wilcoxon signed rank sum tests were used in the statistical analysis.<br/><b>Results:</b> Ten subjects were enrolled in the trial (mean Hoehn and Yahr 1.5); 3 patients discontinued the study after 3 months for reasons unrelated to drug. Six of 7 patients with follow up MRS studies demonstrated a decrease in glutamine/glutamate levels in the basal ganglia opposite the side most severely affected by PD (mean decrease of 1.18 ppm to 0.74 ppm, p=0.002), signifying CNS target engagement. Clinically, subjects demonstrated an improvement in UPDRS Parts II/III, with a mean decrease from 8.1 to 6.7 (p=0.19) in UPDRS Part II and a mean decrease from 16.6 to 13.3 (p=0.17) in UPDRS Part III (n=10). EPI-743 was well tolerated with no dose-limiting toxicities or serious adverse events.<br/><b>Conclusions:</b> EPI-743 resulted in a significant decrease in CNS glutamine/glutamate levels in PD patients as well as improvements in UPDRS combined parts II and III scores, and UPDRS part III scores alone, that approached statistical significance. Treatment with EPI-743 improved an objective CNS marker of oxidative stress that correlated with clinical improvement. These positive data provide the foundation for further development of EPI-743 for PD.<br/>','05/19/2015','2021-10-27','2015 Spring','false',126,'PALOMINO 10',1174,'VS04','2021-10-27',69,'Improves Motor Function and CNS Biomarkers in PD: Results from a Phase 2A Pilot Trial'),('81367e1e-05ff-4454-b1c9-e1537d0695cc','Giuseppe Iaria','','Visual Studio/Azure intersection','124',NULL,'<b>Objective:</b> Our objective is to determine if features seen on chronic MR imaging could be used to assist in prognosis of cognitive outcomes in children.<br/><b>Background:</b> Perinatal ischemic strokes are caused by a vascular disruption between 20 weeks gestation and 28 days postnatal, resulting in a focal brain injury. Although studies show children with a perinatal stroke may have IQ in the normal range, there are individuals that have significant intellectual impairment. In literature symptomatic epilepsy has been linked to poor cognitive outcomes but evidence for other predictive factors is scant and inconsistent.<br/><b>Methods:</b> Twenty-six children with perinatal stroke were tested with a neuropsychological battery including Wechsler IQ and additional tests of memory and spatial skills. Existing structural MRI were obtained for all patients. MRI were analyzed for location of stroke (by lobe and regions of interest), tissue volumes relative to healthy controls (based on curve estimation after automated segmentation), and hippocampus volumes (by manual tracing) and related to performance on neuropsychological measures.<br/><b>Results:</b> The only connection between location of stroke lesion and testing performance that was found was a difference in FSIQ between those children that had a lesion that included the dorsolateral prefrontal (DLPF) cortex and those whose lesion did not. There was a correlation between grey matter volume loss and the verbal comprehension component of IQ testing. A reduction in hippocampus volume was observed in those children that had symptomatic epilepsy, but there was no correlation between volume and IQ or memory performance.<br/><b>Conclusions:</b> As seen in other studies, prognosis of cognitive outcome is difficult and there was no correlation between site of lesion and areas of intellectual deficit. However, there was some indication that loss of more cortical volume, or involvement of the DLPF cortex may be risk factors for intellectual impairment in childhood.<br/>','05/21/2015','2021-10-27','2015 Spring','false',127,'PRINCESS C',1179,'AB14','2021-10-27',69,'Neuroimaging Markers of Cognitive Outcome in Children with Perinatal Stroke');
/*!40000 ALTER TABLE `session` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `speaker`
--

DROP TABLE IF EXISTS `speaker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `speaker`
--

LOCK TABLES `speaker` WRITE;
/*!40000 ALTER TABLE `speaker` DISABLE KEYS */;
INSERT INTO `speaker` VALUES ('593576b4-5569-45a6-995c-9906edad96bf','','','',NULL,'<b>Prof Lesley Jones</b> has a long-standing interest in neurodegeneration, particularly in Huntington’s (HD) and Alzheimer’s disease (AD).  She has organised and performed genetic and genomic studies in HD and AD, analysed mouse models of disease and determined the biological mechanisms through which the diseases work, to identify new targets for therapies. In AD her pathway analysis papers highlighted the aetiological contribution of the immune system to AD that now forms a key area of therapeutic research. In HD her leadership in the Genetic Modifiers of HD consortium and in other repeat diseases provide novel avenues for therapeutic exploitation in DNA repair that inform her current research.','Cardiff University School of Medicine, Cardiff, UK','Lesley','false','none','Jones','speaker2.jpg',1125,'Prof'),('676dfb23-a7c4-4816-9ae3-5bcbcc120d52','','','',NULL,'<b>John C Morris</b> MD is the Friedman Distinguished Professor of Neurology and Director of the Charles F. and Joanne Knight Alzheimer\'s Disease Research Center at Washington University School of Medicine. Dr. Morris has more than 500 published articles. He has received many honors and awards, including the Lifetime Achievement Award from the Alzheimer’s Association (2002); the MetLife Award for Medical Research in Alzheimer’s Disease (2004); the Potamkin Prize for Research in Pick’s, Alzheimer’s, and Related Dementias (2005); and the Peter H. Raven Lifetime Achievement Award from the Academy of Science St. Louis. He is ranked in the top 1% of investigators in the field of Neuroscience and Behavior by Essential Science Indicators database.','Washington University School of Medicine, St Louis, Missouri, USA','John','false','Fall2015','Morris','speaker4.jpg',1013,'MD'),('e861e978-ad64-4e89-804c-4e19d339241f','','','',NULL,'<b>Geoff Nichol</b> BMed Sc, MB, ChB, MBA, FRACP is currently Executive Vice President of Research and Development at Sangamo BioSciences in San Francisco, USA.  He has over 20 years of experience in the pharmaceutical and biotechnology industries, and has been closely associated with the development of over 15 new drug candidates and the approval or launch of several marketed drugs, including Augmentin BID (amoxicillin/clavulanate), Foradil (formoterol) and Yervoy (ipilimumab). He started his career in drug development with SmithKline Beecham, then served on the senior global development management team at Novartis. He then led all aspects of product development for Medarex Inc, pioneering the pharmaceutical development of the novel immunotherapeutic antibodies ipilimumab, the first agent to improve survival in advanced melanoma, and nivolumab. Following the acquisition of Medarex by Bristol-Myers Squibb Company in 2009, he served as CMO at Ikaria prior to joining Sangamo.','Sangamo BioSciences, USA','Geoffrey','false','Fall2015','Nichol','speaker1.jpg',1021,'Dr');
/*!40000 ALTER TABLE `speaker` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-10  6:24:51
