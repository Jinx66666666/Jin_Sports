-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sport
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `desc` varchar(20) DEFAULT NULL,
  `state` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (1,'总经办','哈哈哈',1),(2,'人事部','呵呵呵',1),(3,'业务部','是是是',1);
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `disclaimer`
--

DROP TABLE IF EXISTS `disclaimer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `disclaimer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `disclaimer` varchar(255) DEFAULT NULL COMMENT '免责声明名称',
  `content` text COMMENT '免责声明内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2113 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disclaimer`
--

LOCK TABLES `disclaimer` WRITE;
/*!40000 ALTER TABLE `disclaimer` DISABLE KEYS */;
INSERT INTO `disclaimer` VALUES (1,'长跑免责声明','    凡报名参加的成年人均视为具有完全民事行为能力的人，如在活动中发生人身损害后果，团队的发起者和同行者不承担赔偿责任，由受损害人自行承担。2. 凡报名参加的成年人均视为具有完全民事行为能力的人，如在活动中发生人身损害后果，团队的发起者和同行者不承担赔偿责任，由受损害人自行承担。2. 凡报名参加的成年人均视为具有完全民事行为能力的人，如在活动中发生人身损害后果，团队的发起者和同行者不承担赔偿责任，由受损害人自行承担。2. 凡报名参加的成年人均视为具有完全民事行为能力的人，如在活动中发生人身损害后果，团队的发起者和同行者不承担赔偿责任，由受损害人自行承担。2. 凡报名参加的成年人均视为具有完全民事行为能力的人，如在活动中发生人身损害后果，团队的发起者和同行者不承担赔偿责任，由受损害人自行承担。\n     4. 如报名参加者为未成年人，视为未成年及其监护人同意在活动中发生人身损害后果，由监护人和受损害人自行承担，团队的发起者不承担赔偿责任。\n4. 如报名参加者为未成年人，视为未成年及其监护人同意在活动中发生人身损害后果，由监护人和受损害人自行承担，团队的发起者不承担赔偿责任。54. 如报名参加者为未成年人，视为未成年及其监护人同意在活动中发生人身损害后果，由监护人和受损害人自行承担，团队的发起者不承担赔偿责任。64. 如报名参加者为未成年人，视为未成年及其监护人同意在活动中发生人身损害后果，由监护人和受损害人自行承担，团队的发起者不承担赔偿责任。74. 如报名参加者为未成年人，视为未成年及其监护人同意在活动中发生人身损害后果，由监护人和受损害人自行承担，团队的发起者不承担赔偿责任。84. 如报名参加者为未成年\n    人，视为未成年及其监护人同意在活动中发生人身损害后果，由监护人和受损害人自行承担，团队的发起者不承担赔偿责任。94. 如报名参加者为未成年人，视为未成年及其监护人同意在活动中发生人身损害后果，由监护人和受损害人自行承担，团队的发起者不承担赔偿责任。104. 如报名参加者为未成年人，视为未成年及其监护人同意在活动中发生人身损害后果，由监护人和受损害人自行承担，团队的发起者不承担赔偿责任。114. 如报名参加者为未成年人，视为未成年及其监护人同意在活动中发生人身损害后果，由监护人和受损害人自行承担，团队的发起者不承担赔偿责任。124. 如报名参加者为未成年人，视为未成年及其监护人同意在活动中发生人身损害后果，由监护人和受损害人自行承担，团队的发起者不承担赔偿责任。134. 如报名参加者为未成年人，视为未成年及其监护人同意在活动中发生人身损害后果，由监护人和受损害人自行承担，团队的发起者不承担赔偿责任。154. 如报名参加者为未成年人，视为未成年及其监护人同意在活动中发生人身损害后果，由监护人和受损害人自行承担，团队的发起者不承担赔偿责任。164. 如报名参加者为未成年人，视为未成年及其监护人同意在活动中发生人身损害后果，由监护人和受损害人自行承担，团队的发起者不承担赔偿责任。'),(2101,'篮球运动免责声明','篮球运动免责声明\n\nXX球场系按时计费出租的篮球场,XX球场实行明码标价,收取的费用为场地租赁费。XX球场仅提供运动场地租赁服务,不提供日常训练、比赛组织、赛事裁判、纠纷仲裁等服务。场地租赁人及其邀请的人员(以下称为“运动参与者”)可且仅可在XX球场进行符合体育道德规范和一般公序良俗的篮球运动。运动参与者不得在XX球场从事与篮球运动无关的活动或从事非法活动的(如打架斗殴、赌赛、赌球等),运动参与者在XX球场从事上述活动的,XX球场有权解除租赁合同并要求运动参与者离开。\n\n运动参与者已充分认识到或经本声明提示后充分认识到以下免责事项:\n\n1、鉴于篮球运动是身体对抗型竞技体育运动,运动参与者如患有不适合体育运动的疾病的(如心脏病、高血压、哮喘等),不得在XX球场进行篮球运动。XX球场未配备专门医疗人员、抢救设备及药品,无法提供现场抢救措施(如心肺复苏、止血、氧气插管等),因运动参与者自身原因在运动过程中突发疾病引起的一切后果由其自负,XX球场不承担任何赔偿责任。\n\n2、鉴于篮球运动方法本身蕴含有较大人身伤害风险,运动参与者对篮球运动中可能遭受到的人身伤害风险有充分的预计并愿意使自己置于此种风险之下,XX球场对运动参与者在XX球场内进行篮球运动过程中遭受的人身损害无过错且不承担任何赔偿责任。\n\n3、鉴于篮球运动是身体对抗型竞技体育运动,运动参与者在运动过程中易因对抗产生摩擦,发生纠纷。XX球场由于管理力量有限,无足够人力物力有效制止运动参与者之间的暴力冲突,XX球场对运动参与者之间的纠纷仅能进行口头劝导及报警处理,对运动参与者之间暴力冲突造成的人身、财产损失,由侵权行为人承担赔偿责任,XX球场不承担任何赔偿责任。\n\n4、运动参与者随着财物应自行保管妥当,XX球场对运动参与者随身财物提供免费存放服务,运动参与者免费存放的财物被盗、抢造成的损失由运动参与者自行承担,XX球场不承担任何赔偿责任。\n\n本免责声明系运动参与者与XX球场之间租赁合同的组成部分,运动参与者经提示已充分了解并接受XX球场的上述免责声明。\n\n本人已认真阅读、充分理解并自愿接受XX球场上述免责声明。\n\n签名:。'),(2106,'越野挑战比赛','越野挑战比赛是一项具有危险性、不可预见性的户外越野长跑运动。制定此协议是让参与者更多了解户外越野活动中存在的风险,提高自己的安全意识,规范自己的行为,对自己负责,对同行选手负责,对家人负责。本协议是有关户外越野比赛活动的责任豁免、权利放弃、风险承担和赔偿责任放弃的协议。为了让户外越野比赛活动更精彩、更安全更快乐,请仔细阅读,理解并签署本协议。\n\n【免责协议】:\n\n一.本免责协议仅适用于2015年8月8日在桥头开展的RW50腾冲“重走远征路”国际越野挑战赛活动。\n\n二.参赛人员需是具备完全民事行为能力的成年人,如果是未满18周岁未成年人,需监护及陪同人员签字同意,且属自愿参加本次户外越野比赛活动。\n\n三.首先本人已经充分了解活动过程中可能面临的风险,包括交通工具带来的危险、疾病带来的危险,第三方带来的危险,动物带来的危险等等。\n\n四. 户外越野比赛过程中如遇到危险,组委会将全力救助,但不产生法律上的权利义务关系。当发生不能完全避免伤害的时候,声明人不向其他成员主张任何赔偿责任,除非该伤害是由于其他成员的故意所导致。\n\n五.必须清楚活动发起者及其所有同行成员均非职业或有许可证的急救人员。所有其他成员可能并没有参加过急救(包括野外)的培训和经验,彼此不承担安全责任,只有救助的义务。\n\n六.凡参加户外越野比赛活动者,均视为具有完全民事行为能力人,如果由于个人行为而导致了第三方的财产损失或个人伤害,由行为人独立承担责任,免除所有其他同行成员的赔偿责任。凡报名者均视为接受本声明。如报名者为未成年人或无民事行为能力人或限制民事行为能力人,则其监护人同意在活动中发生人身损害后果,赔偿责任发起人及队友不承担,由监护人或受损害人依据法律规定和本声明依法解决,监护人虽没有直接报名仍视为接受本声明。本声明是根据最高人民法院于2004年5月1日起颁布施行的《关于审理人身损害赔偿案件适用法律若干问题的解释》而制定。\n\n七.活动中组委会只负责活动的召集、协调和技术支持,举办方并不从活动组织中获取任何费用或盈利,亦不构成发起人的经营行为,发起人不对任何个人或机构承担民事赔偿责任或补充民事赔偿责任。发起人对活动仅提供信息发布服务,并不担保任何参加人的人身和财产的安全保障。本户外越野比赛活动之行为,在任何情况下不构成违反对设施设备未尽安全保障义务,不构成违反服务管理未尽安全保障义务,不构成违反防范制止侵权行为未尽安全保障义务,也不构成对未成年人、无民事行为能力人、限制民事行为能力人未尽安全保障义务。\n\n八.为保证此次户外越野比赛活动的严肃、高效,尊重越野比赛运动所具有的危险、不可预知性,如果你报名参加了本次比赛活动,将自行承担活动的危险和风险。报名参加活动前,必须事先与自己的家属沟通,取得家属的理解和支持,同时知道并同意该免责声明。参加人报名参加活动后视作其家属也已知情并同意,否则后果由参加者自负。\n\n九.比赛活动中,参加者必须事先明确申明自己能否做长时间的户外越野比赛运动,让组织者和其他参赛队友知道;在身体有疾病的,比如心脏病、哮喘病等请不要报名参加此活动,隐瞒自己身体疾病,所引发的任何事故由参加者自己负责,活动发起人不负任何责任。\n\n十.本次发布的户外越野比赛路线、地点跟距离,参与者应结合自己的能力,考虑是否能参加完成,感觉存在安全问题的路线,可以拒绝参加。一经参加将视为认可当次的路线、地点跟距离,是能力范围内以及安全的。\n\n十一.凡参加活动的朋友,均视为同意该声明!如恶意侵犯他人或其它涉及犯罪行为,则不在此免责范围内,必须承担相应的法律责任。\n\n【未成年人附加免责声明】\n\n1、18周岁以下的未成年人,必须由监护人陪同,或具有由监护人签字的书面免责声明,否则不能参加活动;\n\n2、对于参加活动但又存在隐瞒真实年龄、提供虚假监护人或者伪造监护人签字等欺骗行为的未成年,发起人及同行人员不承担任何法律上和道德上的责任。\n\n本人亲笔签名:\n\n监护人亲笔签名:\n\n2015年月日'),(2107,'官方活动','官方活动\n中国法律规定的免责条件主要有：\n1.不可抗力：《合同法》第117条规定，因不可抗力不能履行合同的，根据不可抗力的影响，部分或者全部免除责任，但法律另有规定的除外。当事人延迟履行后发生不可抗力的，不能免除责任。本法所称不可抗力，是指不能预见、不能避免并不能克服的客观情况。 [1] \n2.货物本身的自然性质、货物的合理损耗：《合同法》第311条规定：承运人对运输过程中货物的毁损、灭失承担损害赔偿责任，但承运人证明货物的毁损、灭失是因不可抗力、货物本身的自然性质或者合理损耗以及托运人、收货人的过错造成的，不承担损害赔偿责任。\n3.债权人的过错：《合同法》第311条规定、第370条规定：寄存人交付的保管物有瑕疵或者按照保管物的性质需要采取特殊保管措施的，寄存人应当将有关情况告知保管人。寄存人未告知，致使保管物受损失的，保管人不承担损害赔偿责任；保管人因此受损失的，除保管人知道或者应当知道并且未采取补救措施的以外，寄存人应当承担损害赔偿责任。'),(2108,'国际足球','国际足球\n中国法律规定的免责条件主要有：\n1.不可抗力：《合同法》第117条规定，因不可抗力不能履行合同的，根据不可抗力的影响，部分或者全部免除责任，但法律另有规定的除外。当事人延迟履行后发生不可抗力的，不能免除责任。本法所称不可抗力，是指不能预见、不能避免并不能克服的客观情况。 [1] \n2.货物本身的自然性质、货物的合理损耗：《合同法》第311条规定：承运人对运输过程中货物的毁损、灭失承担损害赔偿责任，但承运人证明货物的毁损、灭失是因不可抗力、货物本身的自然性质或者合理损耗以及托运人、收货人的过错造成的，不承担损害赔偿责任。\n3.债权人的过错：《合同法》第311条规定、第370条规定：寄存人交付的保管物有瑕疵或者按照保管物的性质需要采取特殊保管措施的，寄存人应当将有关情况告知保管人。寄存人未告知，致使保管物受损失的，保管人不承担损害赔偿责任；保管人因此受损失的，除保管人知道或者应当知道并且未采取补救措施的以外，寄存人应当承担损害赔偿责任。'),(2111,'兵乓球声明名称','1、本活动为非盈利性质的，在户外平台（网站）平等结伴的自助游活动，所有参与者都完全了解该户外活动存在着一定的不可预测的危险性，都是具备完全民事行为能力的成年人，且自行评估有较强的自立能力和集体团队精神，能够完全具备对自已个人行为和安危认知和负责的能力，约伴人无权也无义务为参加者进行户外能力评估。\n2、自觉遵守国家法律法规，严格遵守交通规则。有积极自觉的环保意识，爱护自然环境，不得破坏人文自然景观。安全、快乐、团结、互助、共同达到目标，本活动不欢迎个人主义激进倾向者。\n3、本活动各参与者均为完全民事行为能力的人，如在活动中发生人身损害后果，其他参与者无承担赔偿责任义务，本声明中关于免除赔偿责任之约定效力，适用于所有参与人员。 \n4、本次活动适用法规《中华人民共和国道路交通安全法》及相关条例。各参与者自行购买人身意外保'),(2112,'2019年国际飞机赛','1、本活动为非盈利性质的，在户外平台（网站）平等结伴的自助游活动，所有参与者都完全了解该户外活动存在着一定的不可预测的危险性，都是具备完全民事行为能力的成年人，且自行评估有较强的自立能力和集体团队精神，能够完全具备对自已个人行为和安危认知和负责的能力，约伴人无权也无义务为参加者进行户外能力评估。\n2、自觉遵守国家法律法规，严格遵守交通规则。有积极自觉的环保意识，爱护自然环境，不得破坏人文自然景观。安全、快乐、团结、互助、共同达到目标，本活动不欢迎个人主义激进倾向者。\n3、本活动各参与者均为完全民事行为能力的人，如在活动中发生人身损害后果，其他参与者无承担赔偿责任义务，本声明中关于免除赔偿责任之约定效力，适用于所有参与人员。 \n4、本次活动适用法规《中华人民共和国道路交通安全法》及相关条例。各参与者自行购买人身意外保');
/*!40000 ALTER TABLE `disclaimer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dynamic`
--

DROP TABLE IF EXISTS `dynamic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dynamic` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dynamictitle` varchar(255) DEFAULT NULL COMMENT '动态标题',
  `dynamicinfo` varchar(255) DEFAULT NULL COMMENT '详细信息',
  `dynamicintro` varchar(255) DEFAULT NULL COMMENT '简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dynamic`
--

LOCK TABLES `dynamic` WRITE;
/*!40000 ALTER TABLE `dynamic` DISABLE KEYS */;
INSERT INTO `dynamic` VALUES (1,'啊啊啊啊啊啊1萨达','神神道道大奥算得上是大多撒','11111222222222'),(2,'2222222','阿诗丹顿多多多多多多多多多多多多多多多多多多多多多多多多多多多','22222'),(3,'国际乒乓','赛事报名时间为：2019.1.20','强来了'),(4,'阿老师','请问阿斯顿阿斯顿撒sad','21');
/*!40000 ALTER TABLE `dynamic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  `hiredate` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '入职时间',
  `state` int DEFAULT NULL COMMENT '状态 离职-在职-',
  `deptID` int DEFAULT NULL COMMENT '部门ID',
  `roleID` int DEFAULT NULL COMMENT '角色ID',
  `admin` bit(1) DEFAULT b'0',
  `loginID` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `name_age_index` (`telephone`,`name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'张三','18999998888','2018-09-15 16:00:00',1,1,1,_binary '',1),(2,'傻强','15978566538','2018-12-31 02:35:41',1,2,1,_binary '',2);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gameinformation`
--

DROP TABLE IF EXISTS `gameinformation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gameinformation` (
  `id` int NOT NULL AUTO_INCREMENT,
  `gamename` varchar(255) DEFAULT NULL COMMENT '赛事名称',
  `introduce` text COMMENT '赛事简介',
  `sumpeople` int DEFAULT NULL COMMENT '赛事参赛总人数',
  `disclaimerID` int DEFAULT NULL COMMENT '免责声明id',
  `applydate` datetime DEFAULT NULL COMMENT '报名日期',
  `cutdate` datetime DEFAULT NULL COMMENT '截止日期',
  `begindate` datetime DEFAULT NULL COMMENT '开始日期',
  `enddate` datetime DEFAULT NULL COMMENT '结束日期',
  `groupfrom` varchar(255) DEFAULT NULL COMMENT '参赛小组',
  `groupID` int DEFAULT NULL COMMENT '组类别id',
  `stadiumID` int DEFAULT NULL COMMENT '场馆id',
  `state` int NOT NULL DEFAULT '0' COMMENT '开启关闭状态',
  `picture` varchar(255) DEFAULT NULL COMMENT '前台宣传的图片',
  `sportID` int DEFAULT NULL,
  `manipuler` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=74 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gameinformation`
--

LOCK TABLES `gameinformation` WRITE;
/*!40000 ALTER TABLE `gameinformation` DISABLE KEYS */;
INSERT INTO `gameinformation` VALUES (62,'英雄联盟S9世界总决赛','赛事简介',NULL,2111,'2019-01-09 17:04:32','2019-01-09 17:04:33','2019-01-09 21:42:59','2020-01-17 21:42:57',NULL,NULL,5,2,'/sports/301a9161-44df-4532-8dcb-26e9896afb24.jpeg',5,'张三'),(63,'2019足球世界杯','32支参赛队通过抽签分为八个小组,每个小组分别有四支球队进行比赛，每支球队都必须和其他三支球队进行且只进行一场比赛,每组4个队循环比赛，共打6场(a1-a2;a1-a3;a1-a4;a2-a3;a2-a4;a3-a4),每场比赛90分钟，胜平负分别积3、1、0分。每个小组积分的前两名球队出线进入淘汰赛阶段的1/8决赛，共16支队，即“16强”。\n每个小组分别有四只球队，其排名按以下规则确定：\na、积分高者排名靠前\nb、小组中总净胜球高者排名靠前\nc、小组中总进球数高者排名靠前\n如果按照以上规则仍有两支或两支以上的球队并列，则按以下顺序依次比较以确定排名先后：\n（除去并列球队以外的所有球队，仅在并列球队之间进行如下规则。）\nd、比较并列的几队之间相互比赛的净胜球多少。如果仍然相等，则：\ne、比较并列几队之间相互比赛的得分高低（也就是两队之间的胜负关系）胜利者排名靠前。\nf、比较并列的几队之间相互比赛的总进球数多少。\ng、积分、净胜球、胜负关系，总进球数均持平。这样需要比较公平竞赛积分。\n每个小组前两名球队出线，进入淘汰赛阶段。\n',NULL,2111,'2019-01-09 18:31:27','2019-01-09 18:31:29','2019-01-09 18:31:31','2019-01-09 18:31:34',NULL,NULL,5,1,'/sports/bde4b8f0-258e-461f-a4e4-4366e1f9cee6.jpeg',5,'张三'),(67,'德玛西亚杯','赛事简介',NULL,2106,'2019-01-10 11:16:56','2019-01-12 11:16:55','2019-01-13 11:17:00','2020-01-18 11:16:58',NULL,NULL,1,1,'/sports/86fcc5fe-5545-4cf9-bc93-1f81852bb58c.jpeg',6,'张三'),(69,'英雄联盟msi','赛事简介',NULL,2106,'2019-01-11 16:36:05','2019-01-11 16:36:07','2019-01-11 16:36:09','2019-01-11 16:36:11',NULL,NULL,2,1,'/sports/25f1066a-bcfa-406d-8750-17b8dec0421a.jpeg',6,'张三'),(70,'王雨薇杀掉','\n\n2006百事世界挑战赛是由百事可乐组织的全球性足球挑战赛。除了中国，还有很多来自世界各地的足球强国参与这次比赛，包括举世公认的足球王国巴西、现代足球的发源地英国、孕育了世纪球王马拉多纳的阿根廷、拥有“忧郁王子”巴乔的意大利等。每个国家要从成千上万的候选人中选出两位16-20岁的选手代表自己的国家参赛，也许我们将看到下一个贝克汉姆或者是第二个小罗。他们要接受一个又一个地由专家们精心设计的挑战，决出最后胜负。最后的前三名将进入AC米兰的主场圣西罗球场进行点球大赛，冠军队还将获得高达10万美元的奖金。\n\n这次百事全球挑战赛的规模之大，范围之广，是让人难以想象的。全程跟踪的摄制组就有将近30人，选手们的所有经历，他们的喜怒哀乐，都会被记录下来，并且编制成多集电视节目在全球十几个国家同时播放。 挑战项目包括球技、创意、领导能力、体能、在不同场地上的足球对抗等。每个挑战都在不同的城市进行，并且在国际超级足球明星的指挥下完成。每站的冠军都会获得意想不到的精彩奖品。 这些幸运儿不但可以在这个国际舞台上得以表现自己的球技，还可以跟多位国际球星面对面零距离地接触和向他们学习。 这些足球巨星包括世界足球先生罗纳尔迪尼奥、万人迷贝克汉姆、阿森纳的灵魂人物亨利、AC米兰的后卫内斯塔、巴西国脚卡洛斯、曼联队队长内维尔……\n\n整个活动历经6个星期，挑战的地点分布在足球运动最发达的3大洲，5个国家，7个城市。从白金汉宫到金字塔，从泰晤士河到尼罗河，从巴塞罗那的海港到里约日内卢的著名科巴卡巴纳海滩，都会留下这些未来足球之星的脚印。选手们还能走遍世界上最有名的足球俱乐部：巴塞罗那、曼联、皇马、AC米兰。。。英国的球迷到底有多疯狂？巴西的沙滩足球为什么这么厉害？埃及的金字塔到底有多雄伟？意大利是不是真的到处都是俊男靓女？只有亲临现场才能知道。　这是一次真正的足球之旅，文化之旅，改变他们命运的梦想之旅。通过这次活动，这六个星期的磨炼，他们的人生将变得更加精彩，他们的命运将从此被改变。\n\n参赛国家： 巴西、英国、意大利、阿根廷、土耳其、巴林、沙特、埃及、罗马尼亚、中国、泰国\n\n挑战地点： 欧洲：西班牙（巴塞罗那、马德里）、英国（伦敦、曼城）、意大利（米兰） 非洲：埃及（开罗） 南美洲：巴西（里约日内卢）\n\n节目播出时间： 日期：4月6日 时间：19:25-21:25 央视5台《足球之夜》栏目将播出本次活动的第一集：百事世界挑战赛的中国海选。\n\n如果想知道这两个幸运儿是如何被选出的，他们都要具备哪些条件，他们是用什么样的心态去面对这一路上的成功与失败，他们是如何靠自己的努力而实现自己的突破渴望的超级梦想，请关注《足球之夜》节目。在4月到6月期间，《足球之夜》将陆续播出多集关于本次活动的电视节目精彩花絮。网易作为本次活动的官方网站，也将第一时间刊登最新的赛事消息，包括选手们的旅途日记、精彩照片和视频、幕后花絮。',NULL,2107,'2019-01-18 16:06:37','2019-01-18 16:06:39','2019-01-18 16:06:41','2019-01-18 16:06:44',NULL,NULL,4,1,'/sports/3a9ea3c0-5042-4475-bbad-91e3ccc5a475.jpeg',6,'张三'),(71,'乒乓联赛','赛事简介\n这是一个测试的赛事简介\n就像你说的那样，这就是一个赛事简介',NULL,2107,'2019-01-19 14:51:09','2019-01-25 12:00:00','2019-01-30 12:00:00','2019-02-22 12:00:00',NULL,NULL,4,1,'/sports/823fba38-bf48-4a3b-9814-dfe584af38e5.jpeg',6,'张三'),(72,'强，测试名称','\n2006百事世界挑战赛是由百事可乐组织的全球性足球挑战赛。除了中国，还有很多来自世界各地的足球强国参与这次比赛，包括举世公认的足球王国巴西、现代足球的发源地英国、孕育了世纪球王马拉多纳的阿根廷、拥有“忧郁王子”巴乔的意大利等。每个国家要从成千上万的候选人中选出两位16-20岁的选手代表自己的国家参赛，也许我们将看到下一个贝克汉姆或者是第二个小罗。他们要接受一个又一个地由专家们精心设计的挑战，决出最后胜负。最后的前三名将进入AC米兰的主场圣西罗球场进行点球大赛，冠军队还将获得高达10万美元的奖金。\n\n这次百事全球挑战赛的规模之大，范围之广，是让人难以想象的。全程跟踪的摄制组就有将近30人，选手们的所有经历，他们的喜怒哀乐，都会被记录下来，并且编制成多集电视节目在全球十几个国家同时播放。 挑战项目包括球技、创意、领导能力、体能、在不同场地上的足球对抗等。每个挑战都在不同的城市进行，并且在国际超级足球明星的指挥下完成。每站的冠军都会获得意想不到的精彩奖品。 这些幸运儿不但可以在这个国际舞台上得以表现自己的球技，还可以跟多位国际球星面对面零距离地接触和向他们学习。 这些足球巨星包括世界足球先生罗纳尔迪尼奥、万人迷贝克汉姆、阿森纳的灵魂人物亨利、AC米兰的后卫内斯塔、巴西国脚卡洛斯、曼联队队长内维尔……\n\n整个活动历经6个星期，挑战的地点分布在足球运动最发达的3大洲，5个国家，7个城市。从白金汉宫到金字塔，从泰晤士河到尼罗河，从巴塞罗那的海港到里约日内卢的著名科巴卡巴纳海滩，都会留下这些未来足球之星的脚印。选手们还能走遍世界上最有名的足球俱乐部：巴塞罗那、曼联、皇马、AC米兰。。。英国的球迷到底有多疯狂？巴西的沙滩足球为什么这么厉害？埃及的金字塔到底有多雄伟？意大利是不是真的到处都是俊男靓女？只有亲临现场才能知道。　这是一次真正的足球之旅，文化之旅，改变他们命运的梦想之旅。通过这次活动，这六个星期的磨炼，他们的人生将变得更加精彩，他们的命运将从此被改变。\n\n参赛国家： 巴西、英国、意大利、阿根廷、土耳其、巴林、沙特、埃及、罗马尼亚、中国、泰国\n\n挑战地点： 欧洲：西班牙（巴塞罗那、马德里）、英国（伦敦、曼城）、意大利（米兰） 非洲：埃及（开罗） 南美洲：巴西（里约日内卢）\n\n节目播出时间： 日期：4月6日 时间：19:25-21:25 央视5台《足球之夜》栏目将播出本次活动的第一集：百事世界挑战赛的中国海选。\n\n如果想知道这两个幸运儿是如何被选出的，他们都要具备哪些条件，他们是用什么样的心态去面对这一路上的成功与失败，他们是如何靠自己的努力而实现自己的突破渴望的超级梦想，请关注《足球之夜》节目。在4月到6月期间，《足球之夜》将陆续播出多集关于本次活动的电视节目精彩花絮。网易作为本次活动的官方网站，也将第一时间刊登最新的赛事消息，包括选手们的旅途日记、精彩照片和视频、幕后花絮。',NULL,2111,'2019-01-21 14:38:31','2019-01-31 00:00:00','2019-02-20 00:00:00','2020-01-09 00:00:00',NULL,NULL,5,1,'/sports/b823a6c1-babb-4fd7-9db5-de1ed24100d7.jpeg',5,'张三'),(73,'2019年国际飞机赛','\n 一. 骑行活动须知：\n1. 参加骑行活动，必须佩戴安全防护装备（头盔、眼镜、绑腿带、手套等），防止因意外造成身体伤害；自行车有前灯、尾灯、车铃；本人携带手机等通讯工具；\n2. 参加骑行活动前，仔细检查车辆及装备，及时维护保养，以保证骑行活动的顺利完成；\n3. 参加骑行活动，所需的费用（用餐、住宿、门票等）由活动参与者自理及平均承担（AA制）；\n4. 参加骑行活动，应爱护环境，保护生物。凡不可降解垃圾，一律自行带回处理；\n二. 单人骑行规则：   \n5. 骑行中严格遵守交通法律法规；严禁闯红灯、逆行、上快车道、上人行道；严禁酒后骑行；不提倡带病、带伤骑行；\n6. 骑行中要尊重行人、畏惧机动车辆；\n7. 骑行中无紧急状况，不得急刹车；\n8. 骑行中不得大幅度左右摆动车辆（画龙）；不得突然变线；\n9. 骑行中不得双手离把；  \n10. 骑行中不得随意抛撒物品、吐痰；',NULL,2112,'2019-02-22 00:00:00','2019-02-23 00:00:00','2019-02-26 00:00:00','2019-02-27 00:00:00',NULL,NULL,6,1,'/sports/8ec91a68-fed6-4237-850b-13fc9c0d3182.jpeg',15,'张三');
/*!40000 ALTER TABLE `gameinformation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `goodreview`
--

DROP TABLE IF EXISTS `goodreview`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `goodreview` (
  `id` int NOT NULL AUTO_INCREMENT,
  `reviewtitle` varchar(255) DEFAULT NULL COMMENT '信息标题',
  `reviewdetailedinfo` varchar(255) DEFAULT NULL COMMENT '详细信息',
  `state` int DEFAULT NULL COMMENT '是否置顶状态',
  `reviewintro` varchar(255) DEFAULT NULL COMMENT '简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `goodreview`
--

LOCK TABLES `goodreview` WRITE;
/*!40000 ALTER TABLE `goodreview` DISABLE KEYS */;
INSERT INTO `goodreview` VALUES (1,'长跑马拉松','联发科拉圣诞节疯狂简单快乐撒娇多少卡减肥快乐撒打开飞机等等来看基拉可视对讲风口浪尖撒可富几十块拉动房价快速了解阿卡丽飞机撒开了点击付款啦就是开了房间啊拉克丝京东方科技萨洛克积分抗裂砂浆ad开了房家看来大家付款了撒娇地方看看撒浪费快乐撒地方快乐撒即可浪费撒',2,'即将举行长跑马拉松'),(2,'迷你乒乓','安静思考对方很快就会撒大口径复活甲肯定撒胡椒粉客户送达回复可见啊山东航空飞机哈萨克积分萨克的发挥空间撒大家好付款记录进来撒快递费上岛咖啡哈看时间',1,'1月20日将于郑州体育中心举行迷你乒乓比赛');
/*!40000 ALTER TABLE `goodreview` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groupfrom`
--

DROP TABLE IF EXISTS `groupfrom`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `groupfrom` (
  `id` int NOT NULL AUTO_INCREMENT,
  `gameinID` int DEFAULT NULL COMMENT '赛事id',
  `groupID` int DEFAULT NULL COMMENT '组类别id',
  `number` int DEFAULT NULL COMMENT '数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groupfrom`
--

LOCK TABLES `groupfrom` WRITE;
/*!40000 ALTER TABLE `groupfrom` DISABLE KEYS */;
INSERT INTO `groupfrom` VALUES (37,62,3,200),(38,63,6,1000),(39,63,1,2000),(44,67,1,5000),(46,67,4,4000),(47,67,1,3000),(48,62,1,300),(49,68,2,12121),(50,69,1,3000),(51,69,2,500),(54,62,2,400),(55,62,4,500),(56,69,3,1500),(57,70,4,100),(58,70,3,100),(59,70,1,200),(60,71,1,111),(61,71,2,111),(62,72,1,5000),(63,72,2,5000),(64,73,15,500),(65,73,13,500);
/*!40000 ALTER TABLE `groupfrom` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grouptype`
--

DROP TABLE IF EXISTS `grouptype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grouptype` (
  `id` int NOT NULL AUTO_INCREMENT,
  `gname` varchar(255) DEFAULT NULL COMMENT '组别名称',
  `minpeople` int DEFAULT NULL COMMENT '组别最低参赛人数',
  `maxpeople` int DEFAULT NULL,
  `cost` varchar(255) DEFAULT NULL COMMENT '组别参赛费用',
  `specialexplain` varchar(255) DEFAULT '' COMMENT '特别说明',
  `whethergroup` int DEFAULT NULL COMMENT '是否团体项目状态 0为否，1为是',
  `whetherpay` int DEFAULT NULL COMMENT '是否付费状态 0为否，1为是',
  `xxx` varchar(255) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grouptype`
--

LOCK TABLES `grouptype` WRITE;
/*!40000 ALTER TABLE `grouptype` DISABLE KEYS */;
INSERT INTO `grouptype` VALUES (1,'全程马拉松',1,2,'0','注意安全',1,0,NULL),(2,'半程马拉松',1,2,'100','特别说明',1,1,NULL),(3,'迷你赛跑',1,20,'0','注意安全',0,0,NULL),(4,'王雨薇长跑赛',1,1,'0','注意安全',0,0,NULL),(6,'王雨薇22短跑',3,3,'11111','注意安全',1,1,NULL),(13,'50跑步赛',1,1,'0','0',0,0,''),(15,'飞机花样式',1,2,'10','注意安全',0,1,'');
/*!40000 ALTER TABLE `grouptype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jin_applyindent`
--

DROP TABLE IF EXISTS `jin_applyindent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jin_applyindent` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '赛事报名订单信息表',
  `gamenames` varchar(255) DEFAULT NULL COMMENT '报名赛事',
  `applyname` varchar(255) DEFAULT NULL COMMENT '参赛人员姓名',
  `idcard` varchar(255) DEFAULT NULL COMMENT '身份证',
  `sex` varchar(11) DEFAULT NULL COMMENT '性别',
  `grouping` varchar(255) DEFAULT NULL COMMENT '赛事参赛组别',
  `teamnames` varchar(255) DEFAULT NULL COMMENT '队伍名称',
  `phone` varchar(255) DEFAULT NULL COMMENT '手机号',
  `applydate` datetime DEFAULT NULL COMMENT '报名日期',
  `paystate` varchar(255) DEFAULT NULL COMMENT '付款状态',
  `grade` varchar(255) DEFAULT NULL COMMENT '比赛成绩',
  `idcardphoto` varchar(255) DEFAULT NULL COMMENT '身份证照片',
  `teamid` varchar(255) DEFAULT NULL COMMENT '赛事报名参赛组id',
  `grouptypeid` varchar(255) DEFAULT NULL,
  `usetel` varchar(255) DEFAULT NULL COMMENT '登录账号',
  `jin` varchar(255) DEFAULT NULL COMMENT '订单编号',
  `jinx` varchar(255) DEFAULT NULL COMMENT '费用',
  `xx1` varchar(255) DEFAULT NULL,
  `xx2` varchar(255) DEFAULT NULL,
  `xx3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=153 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jin_applyindent`
--

LOCK TABLES `jin_applyindent` WRITE;
/*!40000 ALTER TABLE `jin_applyindent` DISABLE KEYS */;
INSERT INTO `jin_applyindent` VALUES (124,'69','222','哈哈哈','女','2','333','222','2019-01-19 17:19:34','未支付',NULL,NULL,NULL,NULL,'13525590264','20190119171933','100',NULL,NULL,NULL),(125,'69','111','444','女','2','444','222','2019-01-19 17:26:28','已支付',NULL,NULL,NULL,NULL,'13525590264','20190119172627','100',NULL,NULL,NULL),(126,'63','强锅锅','哈哈','女','6','谢谢','132','2019-01-21 15:16:13','未支付',NULL,NULL,NULL,NULL,'13525590264','20190121151613','11111',NULL,NULL,NULL),(128,'63','强强','676989','女','6','4447','135488','2019-01-21 15:59:50','未支付',NULL,NULL,NULL,NULL,'13525590264','20190121155950','11111',NULL,NULL,NULL),(129,'63','强强','36','女','6','447','135488','2019-01-21 16:01:26','未支付',NULL,NULL,NULL,NULL,'13525590264','20190121160125','11111',NULL,NULL,NULL),(130,'63','强强','36','女','6','447','135488','2019-01-21 16:01:30','已支付',NULL,NULL,NULL,NULL,'13525590264','20190121160129','11111',NULL,NULL,NULL),(131,'63','黄晶','411521199703050918','女','6','1885697','13273023452','2019-01-21 16:12:18','已支付',NULL,NULL,NULL,NULL,'13525590264','20190121161218','11111',NULL,NULL,NULL),(132,'63','我爱学习','5585','女','6','255','13273023451','2019-01-21 16:24:44','已支付',NULL,NULL,NULL,NULL,'13525590264','20190121162444','11111',NULL,NULL,NULL),(134,'62','黄晶','411521156454664','男','3','李队','13214612154','2019-01-21 19:28:05','已支付',NULL,'/sports/810e40df-7efd-4c37-9f1e-6f12ba81edd1.jpeg',NULL,NULL,NULL,'20190121192809',NULL,NULL,NULL,NULL),(139,'69','李总','4444','男','2','4444','18838020620','2019-02-22 09:58:42','已支付',NULL,NULL,NULL,NULL,'13525590264','20190222095841','100',NULL,NULL,NULL),(144,'69','来咯女','8898','男','2','8898','15093480990','2019-02-22 10:30:20','已支付',NULL,NULL,NULL,NULL,'13525590264','20190222103020','100',NULL,NULL,NULL),(145,'73','强','412727199609265437','男','15','我爱你','13525590264','2016-02-18 00:00:00','未支付','0','/sports/8f440b85-fda6-46e7-b408-b293943062c8.jpeg',NULL,NULL,NULL,'20190222153453',NULL,NULL,NULL,NULL),(146,'73','啊哈哈哈','1','男','15','snoring','17716275907','2019-02-22 16:28:58','已支付',NULL,NULL,NULL,NULL,'15978566537','20190222162858','10',NULL,NULL,NULL),(147,'72','1','1','女','2','1','17716275907','2019-02-23 10:06:21','未支付',NULL,NULL,NULL,NULL,'13525590264','20190223100620','100',NULL,NULL,NULL),(148,'63','王宇','411521199708020013','男','6','jin','15978566537','2019-02-23 10:33:25','已支付',NULL,NULL,NULL,NULL,'15978566537','20190223103324','11111',NULL,NULL,NULL),(149,'73','就是','46498','男','15','7','13525590263','2019-02-25 09:55:52','未支付',NULL,NULL,NULL,NULL,'13525590264','20190225095552','10',NULL,NULL,NULL),(150,'73','攻击力','45464','男','15','643434','13525598212','2019-02-25 09:56:43','未支付',NULL,NULL,NULL,NULL,'13525590264','20190225095643','10',NULL,NULL,NULL),(151,'63','来了','410','男','6','攻击力','15093480990','2019-02-26 10:28:01','已支付',NULL,NULL,NULL,NULL,'13525590264','20190226102801','11111',NULL,NULL,NULL),(152,'63','王祖贤','411521199708020013','男','6','啦啦啦','18838020620','2019-02-26 10:37:22','已支付',NULL,NULL,NULL,NULL,'18838020620','20190226103721','11111',NULL,NULL,NULL);
/*!40000 ALTER TABLE `jin_applyindent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jin_competingteaminfo`
--

DROP TABLE IF EXISTS `jin_competingteaminfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jin_competingteaminfo` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '赛事报名参赛组信息',
  `gamename` varchar(255) DEFAULT NULL COMMENT '赛事名称',
  `groupname` varchar(255) DEFAULT NULL COMMENT '组类别名称',
  `teamname` varchar(255) DEFAULT NULL COMMENT '队伍名称',
  `leadname` varchar(255) DEFAULT NULL COMMENT '领队姓名',
  `leadtel` varchar(255) DEFAULT NULL COMMENT '领队电话',
  `groupid` varchar(255) DEFAULT NULL COMMENT '组类别信息表关联',
  `gameinformationid` varchar(255) DEFAULT NULL,
  `jin` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jin_competingteaminfo`
--

LOCK TABLES `jin_competingteaminfo` WRITE;
/*!40000 ALTER TABLE `jin_competingteaminfo` DISABLE KEYS */;
INSERT INTO `jin_competingteaminfo` VALUES (3,'乒乓球赛','全程','李队','李建赟','74110',NULL,NULL,NULL),(4,'乒乓球赛','半程','敌敌畏战队','王谕威','74110',NULL,NULL,NULL),(5,'羽毛球','半程','中国队','china','88888888',NULL,NULL,NULL),(10,'乒乓球赛','全程','52524','sports',NULL,NULL,NULL,NULL),(11,'乒乓球赛','全程','uuyu','uu7','uuu',NULL,NULL,NULL),(12,NULL,NULL,'qwe',NULL,NULL,NULL,NULL,NULL),(15,'67','4','万里长跑队','asdfas','12345678912',NULL,NULL,NULL),(16,'67','4','312','qwe','13273023452',NULL,NULL,NULL),(17,'67','4','切勿',' 去','13273023452',NULL,NULL,NULL),(18,'63','1','1','1','13273023452',NULL,NULL,NULL),(19,'67','4','1','1','13273023452',NULL,NULL,NULL),(20,'63','1','1','1','13273023452',NULL,NULL,NULL),(21,'67','1','1','1','13273023452',NULL,NULL,NULL),(22,'67','1','王','王','13273023452',NULL,NULL,NULL),(23,'67','1','梦之队','黄晶','13273023452',NULL,NULL,NULL),(24,'67','1','梦战队','黄晶','13256949878',NULL,NULL,NULL),(25,'67','1','梦战队','宝华','13273023452',NULL,NULL,NULL),(26,'67','1','战神崛起','黄晶','13273023452',NULL,NULL,NULL),(27,'67','1','强强队','强强','13273023452',NULL,NULL,NULL),(28,'67','1','是是是','Jin','13273023452',NULL,NULL,NULL),(29,'67','1','王队','黄晶','132738234589',NULL,NULL,NULL),(30,'67','1','真实','好纠结','那你姐姐',NULL,NULL,NULL),(31,'63','1','1','1','1',NULL,NULL,NULL),(32,'67','1','得到','房东','的',NULL,NULL,NULL),(33,'67','1','额','去玩儿','去玩儿',NULL,NULL,NULL),(34,'67','1','撒地方','安抚','',NULL,NULL,NULL),(35,'67','1','啊啊','阿道夫','阿斯蒂芬',NULL,NULL,NULL),(36,'67','1','123','沙发','13273023452',NULL,NULL,NULL),(37,'67','1','梦之队','黄晶','13273023452',NULL,NULL,NULL),(38,'67','1','哈哈哈','黄晶','13273023452',NULL,NULL,NULL),(39,'67','1','快快快','黄晶','13273023452',NULL,NULL,NULL),(40,'67','1','哈哈哈','黄晶','13273023452',NULL,NULL,NULL),(41,'67','1','黄晶','我爱你','13273056498',NULL,NULL,NULL),(42,'63','1','我爱你','黄晶','13273412311',NULL,NULL,NULL),(43,'73','15','呵呵','呵呵呵','13525590264',NULL,NULL,NULL),(44,'63','6','啦啦啦','王雨薇','15978566537',NULL,NULL,NULL);
/*!40000 ALTER TABLE `jin_competingteaminfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jin_video`
--

DROP TABLE IF EXISTS `jin_video`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jin_video` (
  `id` int NOT NULL AUTO_INCREMENT,
  `videotitle` varchar(255) DEFAULT NULL COMMENT '标题',
  `videointroduce` varchar(255) DEFAULT NULL COMMENT '视屏简介',
  `video` varchar(255) DEFAULT NULL COMMENT '视屏',
  `videopicture` varchar(255) DEFAULT NULL COMMENT '视频图片',
  `showtime` varchar(255) DEFAULT NULL COMMENT '播放时间',
  `showstate` varchar(255) DEFAULT NULL COMMENT '是否展示状态',
  `videopath` varchar(255) DEFAULT NULL COMMENT '视频路径',
  `jinvideo` varchar(255) DEFAULT NULL,
  `begintime` datetime DEFAULT NULL,
  `endtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jin_video`
--

LOCK TABLES `jin_video` WRITE;
/*!40000 ALTER TABLE `jin_video` DISABLE KEYS */;
INSERT INTO `jin_video` VALUES (2,'假如我年少有为','为你千千万万遍','/sports/30e04d43-a25b-47d2-af7d-440b8ab8f8bb.mp4','/sports/9e7c2e34-ea7a-4b4e-b029-e71990a53963.jpeg','2019-01-05T11:43:08.000Z','是',NULL,NULL,'2019-01-08 14:05:24','2019-01-08 14:05:25'),(48,'去玩儿','人','/sports/daeb0a50-8460-47f6-8bf5-32489a4d4632.mp4','/sports/1617c15d-f886-4ca7-a8d9-a0e6e695cdd7.jpeg','2019-01-08T06:42:32.000Z','是',NULL,NULL,'2019-01-08 14:42:35','2019-01-08 14:42:36'),(51,'否','撒地方','/sports/2216b411-93e8-4f44-b37b-f5068cd0eb93.mp4','/sports/89f76ef8-2e21-43ea-9ccf-40743c9dcc29.jpeg','2019-01-08T03:30:40.000Z','是',NULL,NULL,'2019-02-25 15:38:00','2019-02-28 00:00:00'),(52,'未确认','人','/sports/543a7c05-60cb-46b3-8448-70bffdf947e5.mp4','/sports/3b7dc73f-7693-4fb8-a460-2edd477db45c.jpeg','2019-01-08T03:37:24.000Z','是',NULL,NULL,'2019-02-25 15:37:43','2019-02-28 00:00:00'),(55,'ASDF 嗯嗯','不思量，自难忘！','/sports/3c5463ae-d548-4ddd-8788-289c60f2fc1b.mp4','/sports/31a5a782-c5f1-40d8-a2f9-edf097acfed6.jpeg','2019-01-08T06:00:58.000Z','是',NULL,NULL,'2019-01-08 14:01:01','2019-01-08 14:01:02'),(58,'未确认群','不思量，自难忘！','/sports/9124e501-cd71-46ec-95c6-035afdf63f50.mp4','/sports/4843f0b9-f177-4836-a5c1-6c9ef60711c9.jpeg','2019-01-08T09:29:07.000Z','是',NULL,NULL,'2019-01-08 17:29:10','2019-01-08 17:29:13'),(65,'mis季中赛','玩儿去玩儿','/sports/a27a814d-7226-4695-8fdb-6e7a7c79f3a2.mp4','/sports/97cdb37a-f303-4978-9b80-b6b725c249c4.jpeg','2019-01-08T09:35:08.000Z','是',NULL,NULL,'2019-01-08 17:35:11','2024-01-12 17:35:12'),(67,'德玛西亚杯','不思量，自难忘！','/sports/9bcf0011-7a30-4e8b-a9f8-fee3c7fc70dc.mp4','/sports/b60de3ad-832f-4409-a9ad-a82023a37d7b.jpeg','2019-01-10T16:03:21.000Z','是',NULL,NULL,'2019-01-11 11:20:39','2022-01-07 11:20:40'),(72,'啊哈哈','啊哈哈哈','/sports/cd67c65d-1491-41d3-9a0f-65b10a19e42d.mp4','/sports/a94144d1-ad45-46ae-9ab0-81682207c94c.jpeg','2019-01-15T06:45:26.000Z','是',NULL,NULL,'2019-01-15 14:45:34','2020-03-13 14:45:37'),(74,'英雄联盟','啊哈哈啊哈哈','/sports/0ca26527-4e35-48f6-bc80-a7b4bd3dcb42.mp4','/sports/61b6b8d7-df1b-4618-a174-d67f22f33434.png','2019-01-15T09:21:51.000Z','是',NULL,NULL,'2019-02-22 19:02:50','2019-03-16 17:21:55'),(75,'2019国际飞机精彩赛','不思量，自难忘！','/sports/5c07749c-3083-4291-8876-ad152fa517d3.mp4','/sports/4c2de1ce-6e07-4109-8697-3f3e520b597f.jpeg','2019-02-21T16:03:33.000Z','是',NULL,NULL,'2019-02-22 00:00:00','2021-02-13 00:00:00');
/*!40000 ALTER TABLE `jin_video` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,'123','123'),(2,'456','456');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderlook`
--

DROP TABLE IF EXISTS `orderlook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orderlook` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ordernum` varchar(255) DEFAULT NULL COMMENT '订单编号',
  `code` varchar(255) DEFAULT NULL COMMENT '核销码',
  `state` int DEFAULT NULL COMMENT '状态',
  `name` varchar(255) DEFAULT NULL COMMENT '操作人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderlook`
--

LOCK TABLES `orderlook` WRITE;
/*!40000 ALTER TABLE `orderlook` DISABLE KEYS */;
INSERT INTO `orderlook` VALUES (1,'20190222161756','1235',1,'张三'),(2,'20190222200141','1234',0,'张三'),(3,'20190222201422','20190124164616',1,'张三'),(4,'20190223154504','20190124164702',1,'张三');
/*!40000 ALTER TABLE `orderlook` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permission`
--

DROP TABLE IF EXISTS `permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `permission` (
  `id` int NOT NULL AUTO_INCREMENT,
  `parentid` int DEFAULT NULL,
  `url` varchar(200) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `desc` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permission`
--

LOCK TABLES `permission` WRITE;
/*!40000 ALTER TABLE `permission` DISABLE KEYS */;
INSERT INTO `permission` VALUES (1,0,NULL,'赛事管理','赛事管理'),(2,1,'/sports/grouptype','组类别信息','组类别信息'),(3,1,'/sports/disclaimer','免责声明','免责声明'),(4,1,'/sports/videoInfo','云直播','云直播'),(5,1,'/sports/jincartogram','赛事统计图','赛事统计图'),(6,1,'/sports/teamInfo','赛事报名参赛组信息','赛事报名参赛组信息'),(7,1,'/sports/applyInfo','赛事报名订单信息','赛事报名订单信息'),(8,1,'/sports/opengame','开启关闭赛事','开启关闭赛事'),(9,1,'/sports/gameinfo','赛事基本信息管理','赛事基本信息管理'),(10,13,'/sports/sport','体育场信息管理','体育场信息管理'),(11,0,'','用户管理','用户管理'),(12,11,'/sports/user','用户信息管理','用户信息管理'),(13,0,NULL,'场馆管理','场馆管理'),(14,13,'/sports/orderlook','场馆票务订单核销','场馆票务订单核销'),(15,13,'/sports/stadiumticket','场馆票务订单查看','场馆票务订单查看'),(16,13,'/sports/ticket','场馆票务管理','场馆票务管理'),(17,13,'/sports/stadium','场馆信息管理','场馆信息管理'),(18,0,NULL,'信息发布管理','信息发布管理'),(19,18,'/sports/review','精彩回顾','精彩回顾'),(20,18,'/sports/dynamic','最新动态','最新动态'),(21,0,NULL,'系统管理','系统管理'),(22,21,'/sports/emp','角色管理','角色管理'),(23,13,'/sports/ticketsome','票务统计图','票务统计图');
/*!40000 ALTER TABLE `permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `desc` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'超级管理员','系统所有的操作都行'),(2,'员工管理员','管理公司员工'),(3,'业务管理员','公司业务操作');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_per`
--

DROP TABLE IF EXISTS `role_per`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role_per` (
  `id` int NOT NULL AUTO_INCREMENT,
  `rid` int DEFAULT NULL,
  `pid` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_per`
--

LOCK TABLES `role_per` WRITE;
/*!40000 ALTER TABLE `role_per` DISABLE KEYS */;
INSERT INTO `role_per` VALUES (1,2,2),(2,2,3),(3,2,4),(4,3,6),(5,3,7),(6,3,8),(7,2,6),(8,1,2),(9,1,3),(10,1,4),(11,1,5),(12,1,6),(13,1,7),(14,1,8),(15,1,9),(16,1,10),(18,1,12),(20,1,14),(21,1,15),(22,1,16),(23,1,17),(25,1,19),(26,1,20),(27,1,22),(28,1,23);
/*!40000 ALTER TABLE `role_per` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sportadd`
--

DROP TABLE IF EXISTS `sportadd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sportadd` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sportname` varchar(255) DEFAULT NULL COMMENT '体育场姓名',
  `sportintro` varchar(255) DEFAULT NULL COMMENT '体育场介绍',
  `sportinfo` varchar(255) DEFAULT NULL COMMENT '体育场详情',
  `sportaddress` varchar(255) DEFAULT NULL COMMENT '地址',
  `sportone` varchar(255) DEFAULT NULL COMMENT '轮播图',
  `sporttwo` varchar(255) DEFAULT NULL,
  `sportthree` varchar(255) DEFAULT NULL,
  `sportfour` varchar(255) DEFAULT NULL,
  `lon` varchar(255) DEFAULT NULL COMMENT '经度',
  `lat` varchar(255) DEFAULT NULL COMMENT '纬度',
  `stateid` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sportadd`
--

LOCK TABLES `sportadd` WRITE;
/*!40000 ALTER TABLE `sportadd` DISABLE KEYS */;
INSERT INTO `sportadd` VALUES (4,'郑州市体育中心','123','123','1231','/sports/61da0b4c-ee18-4863-99af-5be826e18db2.jpeg','/sports/65f5231c-d96c-4f65-834a-36e3e015acd5.jpeg','/sports/71ca3540-8e4e-4d76-a7a1-2c79535b32cb.jpeg','/sports/b1d48e5e-d592-480f-afa4-f6303be22536.jpeg','113.635457','34.841929',1),(5,'河南艺术中心','31','31','biubiubiu','/sports/61da0b4c-ee18-4863-99af-5be826e18db2.jpeg',NULL,NULL,NULL,'113.730723','34.776484',1),(6,'河南省体育馆','1231','1231','遥远的地方','/sports/107b044e-5962-46c0-b4a4-b79b44e668d7.jpeg',NULL,NULL,NULL,'113.671927','34.774096',1),(8,'郑州航海体育场','为人民服务','为人民服务','只要有你的地方','/sports/6ecabaa8-dce0-4369-9fd4-1ae1a6b268b4.jpeg',NULL,NULL,NULL,'113.738075','34.721847',1),(12,'hahaha',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(15,'黄科大体育场','体育场简介','体育场简介','南三环','/sports/dd6be27d-50ae-4298-b414-263e7f55638a.jpeg',NULL,NULL,NULL,'113.5423583900','34.8234048343',1);
/*!40000 ALTER TABLE `sportadd` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stadium`
--

DROP TABLE IF EXISTS `stadium`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stadium` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sportname` varchar(255) DEFAULT NULL COMMENT '体育场名称',
  `stadiumname` varchar(255) NOT NULL COMMENT '场馆名称',
  `stadiumintro` varchar(255) DEFAULT NULL COMMENT '场馆介绍',
  `stadiuminfo` varchar(255) DEFAULT NULL COMMENT '场馆详情',
  `address` varchar(255) DEFAULT NULL COMMENT '场馆地址',
  `showone` varchar(255) DEFAULT NULL COMMENT '轮播图',
  `showtwo` varchar(255) DEFAULT NULL,
  `showthree` varchar(255) DEFAULT NULL,
  `showfour` varchar(255) DEFAULT NULL,
  `lon` varchar(255) DEFAULT NULL COMMENT '经度',
  `lat` varchar(255) DEFAULT NULL COMMENT '纬度',
  `state` int DEFAULT NULL,
  `sportid` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stadium`
--

LOCK TABLES `stadium` WRITE;
/*!40000 ALTER TABLE `stadium` DISABLE KEYS */;
INSERT INTO `stadium` VALUES (1,'南城体育场','羽毛球馆','1','好嗨哟','感觉人生已经到达了高潮','/sports/77b60d20-669a-4bc1-a9e1-3c33d030ede4.jpeg','/sports/7c1a80cc-f557-4ee9-8073-f002242d80d4.jpeg','/sports/38262808-453a-45e4-bc32-55715d4e7c8c.jpeg','/sports/bb633cea-d58a-42f2-805d-e86907214763.jpeg','113.671927','34.774096',0,5),(2,'南城体育场','平常馆','2','2141414151513413131','为你千千万万遍','/sports/2a861abd-c77a-4e3a-aa8b-588ccc3bc973.jpeg',NULL,NULL,NULL,NULL,NULL,1,6),(4,'南城体育场','啊哈哈馆','q','qa','为你千千万万遍','/sports/e17b90b3-1470-4e7e-ba0f-9f40aebdb45c.jpeg',NULL,NULL,NULL,'123','123',1,6),(5,'马11111','乒乓球场馆',NULL,NULL,'为你千千万万遍',NULL,NULL,NULL,NULL,NULL,NULL,1,5),(6,NULL,'乐运动羽毛球馆','开心一天','阿斯顿发的法律框架打发lkjdlkajdk ','南三环','/sports/813d5a24-a262-48fa-9c5f-91fecc56da48.jpeg','/sports/22d787ad-a88b-4d18-8ff0-673b0b273e07.jpeg','/sports/0c2ff519-55c1-4ae6-8b66-a6980ba7934c.jpeg','/sports/83c0ba3d-94c2-4ccd-b127-5df99f4dc5ac.jpeg',NULL,NULL,1,15);
/*!40000 ALTER TABLE `stadium` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stadiumticket`
--

DROP TABLE IF EXISTS `stadiumticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stadiumticket` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ordernum` varchar(255) DEFAULT NULL COMMENT '订单编号',
  `orderdate` timestamp(6) NULL DEFAULT NULL COMMENT '订单时间',
  `price` varchar(255) DEFAULT NULL COMMENT '价格',
  `state` varchar(11) DEFAULT NULL COMMENT '订单状态',
  `paymenttype` varchar(255) DEFAULT NULL COMMENT '支付类型',
  `ticketid` int DEFAULT NULL COMMENT ' 票务id',
  `loginid` varchar(255) DEFAULT NULL COMMENT '登录手机号',
  `number` int DEFAULT NULL COMMENT '数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stadiumticket`
--

LOCK TABLES `stadiumticket` WRITE;
/*!40000 ALTER TABLE `stadiumticket` DISABLE KEYS */;
INSERT INTO `stadiumticket` VALUES (14,'20190122152308','2019-01-22 07:23:08.694000','100','未支付','支付宝支付',4,'13525590264',2),(18,'20190124100158','2019-01-24 02:01:58.010000','50','未支付','支付宝支付',5,'13525590264',1),(19,'20190124112616','2019-01-24 03:26:16.215000','50','未支付','支付宝支付',5,'13525590264',2),(20,'20190124112629','2019-01-24 03:26:29.681000','50','未支付','支付宝支付',5,'13525590264',2),(41,'20190124164612','2019-01-24 08:46:12.291000','50','未支付','支付宝支付',5,'13525590264',1),(42,'20190124175612','2019-01-24 09:56:12.962000','50','未支付','支付宝支付',5,'13525590264',1),(54,'20190222104957','2019-02-22 02:49:57.351000','50','未支付','支付宝支付',5,'13525590264',1),(55,'20190222105120','2019-02-22 02:51:20.535000','50','已支付','支付宝支付',5,'13525590264',1),(56,'20190222105502','2019-02-22 02:55:02.153000','50','已支付','支付宝支付',5,'13525590264',1),(57,'20190222161627','2019-02-22 08:16:27.040000','400','已支付','支付宝支付',8,'13525590264',2),(58,'20190222161756','2019-02-22 08:17:56.572000','200','已支付','支付宝支付',8,'13525590264',1),(63,'20190222200141','2019-02-22 12:01:41.077000','200','未支付','支付宝支付',8,'13525590264',1),(64,'20190222201422','2019-02-22 12:14:22.843000','400','已支付','支付宝支付',8,'13525590264',2),(74,'20190223154504','2019-02-23 07:45:04.063000','800','未支付','支付宝支付',8,'13525590264',4),(75,'20190225085546','2019-02-25 00:55:46.997000','','未支付','支付宝支付',6,'13525590264',NULL),(76,'20190225085650','2019-02-25 00:56:50.679000','200','未支付','支付宝支付',6,'13525590264',1),(77,'20190225095821','2019-02-25 01:58:21.496000','400','未支付','支付宝支付',6,'13525590264',2),(78,'20190225095924','2019-02-25 01:59:24.245000','200','未支付','支付宝支付',6,'13525590264',1),(79,'20190225100736','2019-02-25 02:07:36.518000','','未支付','支付宝支付',6,'13525590264',NULL),(80,'20190225100807','2019-02-25 02:08:07.815000','200','未支付','支付宝支付',6,'13525590264',1),(81,'20190225161644','2019-02-25 08:16:44.533000','','未支付','支付宝支付',6,'13525590264',NULL),(82,'20190226102610','2019-02-26 02:26:10.683000','200','未支付','支付宝支付',6,'13525590264',1),(83,'20190226102644','2019-02-26 02:26:44.820000','200','未支付','支付宝支付',6,'13525590264',1),(84,'20190226102721','2019-02-26 02:27:21.632000','400','未支付','支付宝支付',6,'13525590264',2),(85,'20190226102858','2019-02-26 02:28:58.494000','400','已支付','支付宝支付',6,'13525590264',2),(86,'20190226104920','2019-02-26 02:49:20.911000','1800','已支付','支付宝支付',6,'18838020620',9);
/*!40000 ALTER TABLE `stadiumticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stadiumticketadd`
--

DROP TABLE IF EXISTS `stadiumticketadd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stadiumticketadd` (
  `id` int NOT NULL AUTO_INCREMENT,
  `stadiumid` int DEFAULT NULL COMMENT '场馆名称',
  `sportsid` int DEFAULT NULL COMMENT '体育场名称',
  `ticketname` varchar(255) DEFAULT NULL COMMENT '票务名称',
  `ticketprice` varchar(255) DEFAULT NULL COMMENT '票务价位',
  `beginbusiness` varchar(255) DEFAULT NULL COMMENT '场馆预定时间',
  `endbusiness` varchar(255) DEFAULT NULL COMMENT '场馆预定结束时间',
  `ticketnumber` int DEFAULT NULL COMMENT '票数量',
  `buynotice` varchar(255) DEFAULT NULL COMMENT '购买须知',
  `ticketone` varchar(255) DEFAULT NULL COMMENT '场馆票务添加轮播图',
  `tickettwo` varchar(255) DEFAULT NULL,
  `ticketthree` varchar(255) DEFAULT NULL,
  `ticketfour` varchar(255) DEFAULT NULL,
  `state` int DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stadiumticketadd`
--

LOCK TABLES `stadiumticketadd` WRITE;
/*!40000 ALTER TABLE `stadiumticketadd` DISABLE KEYS */;
INSERT INTO `stadiumticketadd` VALUES (1,1,5,'上午羽毛球半场','15','2019-01-10 08:00:00','2019-01-10 12:00:00',10,'本票只限',NULL,NULL,NULL,NULL,1),(4,2,6,'下午羽毛球全场','100','2019-01-11 13:00:00','2019-01-11 18:00:00',10,'本票只限1月11日上午8：00到12：00有效sad ','/sports/1a304226-72f8-4c48-9304-3076df394ff0.jpeg','/sports/087eb9d3-39f5-4f77-a49c-50dbbad8f58e.jpeg','/sports/2fc789f8-b93c-499f-ad54-3ce60c23d996.jpeg','/sports/2c567e0f-e5e0-470c-aec9-3b023e3870fd.jpeg',1),(5,4,6,'1111','50',NULL,NULL,10,NULL,NULL,NULL,NULL,NULL,1),(6,6,15,'下午场','200','2019-02-01 00:00:00','2019-03-08 15:17:47',20,'\nas哦多尅if汇缴；拉开京东方；老师宽带缴费离开家','/sports/eab91f92-9bcb-46a0-9369-f17124e30eea.jpeg','/sports/77793e0a-1411-4269-b244-59a5bcde4552.jpeg',NULL,NULL,1),(8,5,5,'上午场','200','2019-02-22T05:00:00.000Z','2019-02-28T14:00:00.000Z',10,'注意安全','/sports/16036318-5ecd-4bf9-9999-3874f948a64c.jpeg',NULL,NULL,NULL,1);
/*!40000 ALTER TABLE `stadiumticketadd` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `state`
--

DROP TABLE IF EXISTS `state`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `state` (
  `id` int NOT NULL AUTO_INCREMENT,
  `state` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `state`
--

LOCK TABLES `state` WRITE;
/*!40000 ALTER TABLE `state` DISABLE KEYS */;
INSERT INTO `state` VALUES (1,'正常'),(2,'失效'),(3,'不正常');
/*!40000 ALTER TABLE `state` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userpeople`
--

DROP TABLE IF EXISTS `userpeople`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userpeople` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '昵称',
  `tel` varchar(255) DEFAULT NULL COMMENT '手机号',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `head` varchar(255) DEFAULT NULL COMMENT '头像',
  `registerdate` datetime(6) DEFAULT NULL COMMENT '注册时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userpeople`
--

LOCK TABLES `userpeople` WRITE;
/*!40000 ALTER TABLE `userpeople` DISABLE KEYS */;
INSERT INTO `userpeople` VALUES (1,'张三','15138053327','123456','/sports/49729d8d-b971-4ba4-915e-755cc96db423.jpeg','2019-01-01 16:00:00.000000'),(2,'李四','15099462416','123654','/sports/efa1cddd-881f-4d8a-a0ff-0061fc40a9ec.jpeg','2018-12-11 16:00:00.000000'),(4,'sdsad','13525590221','111112222222','/sports/30ab0a8a-9930-4c0a-a129-11d5e4fdd378.jpeg','2019-01-09 00:00:00.000000'),(21,'王五',' ','123123','/sports/cc472831-4714-4ef1-a96d-f6ecdee47b65.jpeg','2019-01-05 10:55:55.000000'),(26,'六的呃呃呃','13525590264','123456','/sports/27fbba53-fa16-4066-84b9-6ad5168b54fe.jpeg','2019-01-24 15:59:22.000000'),(27,'a','15093480990','123456','/sports/62e7576a-d4d3-4773-bd97-29a150a2da44.jpeg','2019-01-25 01:01:02.000000'),(35,'你好世界','17716275907','123456',NULL,'2019-02-25 08:17:41.000000'),(36,'王宇','15978566537','123456','/sports/36190dd5-6415-438e-a212-e1c61d1c0b58.jpeg','2019-02-25 08:17:25.000000'),(37,'王雨薇','18838020620','123456','/sports/f53cdacb-2cf6-4827-9819-2df394656327.jpeg',NULL);
/*!40000 ALTER TABLE `userpeople` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-18 11:15:51
