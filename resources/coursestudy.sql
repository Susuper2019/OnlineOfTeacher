/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : coursestudy

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-01-02 18:47:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for applycourse
-- ----------------------------
DROP TABLE IF EXISTS `applycourse`;
CREATE TABLE `applycourse` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `tid` int(11) DEFAULT NULL,
  `acname` varchar(23) DEFAULT NULL,
  `actype` varchar(23) DEFAULT NULL,
  `accategory` varchar(23) DEFAULT NULL COMMENT '课程类别',
  `teachernum` int(11) DEFAULT NULL,
  `applytime` datetime DEFAULT NULL,
  `extreaTecName` varchar(23) DEFAULT NULL,
  `extreaTecUser` varchar(23) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of applycourse
-- ----------------------------
INSERT INTO `applycourse` VALUES ('35', '1', '数据库', '考试', '先修', '12', '2019-12-29 14:17:11', '张老师', '123');
INSERT INTO `applycourse` VALUES ('36', '1', '线性代数', '考试', '选修', '12', '2019-12-29 15:26:37', '张老师', '123');
INSERT INTO `applycourse` VALUES ('37', '1', '计算机网络', '考试', '后修', '312', '2019-12-29 19:10:57', '张老师', '123');
INSERT INTO `applycourse` VALUES ('38', '1', '操作系统', '考试', '先修', '231', '2019-12-29 22:11:12', '张老师', '123');
INSERT INTO `applycourse` VALUES ('39', '1', '数据库', '考试', '先修', '1', '2019-12-29 22:19:39', '张老师', '123');
INSERT INTO `applycourse` VALUES ('40', '1', '组成原理', '考试', '先修', '1', '2019-12-29 22:26:14', '张老师', '123');
INSERT INTO `applycourse` VALUES ('41', '2', '数据库2', '考试', '后修', '15', '2019-12-29 22:32:09', '郭老师啊', '076');
INSERT INTO `applycourse` VALUES ('42', '1', '软件工程', '考查', '后修', '2', '2019-12-30 08:37:33', '张老师', '123');
INSERT INTO `applycourse` VALUES ('44', '1', '数据结构', '考试', '先修', '2', '2020-01-02 10:45:55', '张老师', '123');
INSERT INTO `applycourse` VALUES ('45', '1', '计算机操作系统', '考试', '后修', '23', '2020-01-02 16:30:43', '张老师', '123');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `tid` int(11) DEFAULT NULL,
  `cname` varchar(23) DEFAULT NULL,
  `ctype` varchar(23) DEFAULT NULL COMMENT '课程性质考查考试',
  `semester` varchar(23) DEFAULT NULL COMMENT '开课学期',
  `starttime` datetime DEFAULT NULL,
  `endtime` datetime DEFAULT NULL,
  `stunum` int(11) DEFAULT NULL COMMENT '学生人数',
  `subtype` varchar(23) DEFAULT NULL COMMENT '学科类别',
  `courdesc` varchar(23) DEFAULT NULL COMMENT '课程描述',
  `earlystudy` varchar(23) DEFAULT NULL COMMENT '先修知识',
  `statue` int(11) DEFAULT NULL,
  `aid` int(11) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('9', '1', '数据库', '考试', '大一上学期', '2019-12-28 00:00:00', '2019-12-28 00:00:00', '12', '先修', '', '高等数学', '1', '35');
INSERT INTO `course` VALUES ('10', '1', '线性代数', '考试', '大一上学期', '2019-12-28 00:00:00', '2019-12-28 00:00:00', '12', '选修', '231', '高等数学', '1', '36');
INSERT INTO `course` VALUES ('11', '1', '计算机网络', '考试', '大一上学期', '2019-12-28 00:00:00', '2019-12-28 00:00:00', '312', '后修', 'aabc', '高等数学', '1', '37');
INSERT INTO `course` VALUES ('12', '1', '操作系统', '考试', '大一上学期', '2019-12-28 00:00:00', '2019-12-28 00:00:00', '231', '先修', '大学第一课', '高等数学', '1', '38');
INSERT INTO `course` VALUES ('13', '1', '数据库', '考试', '大一上学期', '2019-12-28 00:00:00', '2020-12-28 00:00:00', '1', '先修', '开学第二课', '高等数学', '1', '39');
INSERT INTO `course` VALUES ('14', '1', '组成原理', '考试', '大二上学期', '2019-12-28 00:00:00', '2020-12-28 00:00:00', '1', '先修', '大二第一节课', '高等数学', '1', '40');
INSERT INTO `course` VALUES ('15', '2', '数据库2', '考试', '大二上学期', '2019-12-28 00:00:00', '2019-12-28 00:00:00', '15', '后修', '第一课', '高等数学', '1', '41');
INSERT INTO `course` VALUES ('16', '1', '软件工程', '考查', null, null, null, '2', '后修', null, null, '0', '42');
INSERT INTO `course` VALUES ('18', '1', '数据结构', '考试', null, null, null, '2', '先修', null, null, '0', '44');
INSERT INTO `course` VALUES ('19', '1', '计算机操作系统', '考试', '大一上学期', '2019-12-10 00:00:00', '2019-12-31 00:00:00', '23', '后修', '这是一门好课', '高等数学', '1', '45');

-- ----------------------------
-- Table structure for fileup
-- ----------------------------
DROP TABLE IF EXISTS `fileup`;
CREATE TABLE `fileup` (
  `fileid` int(11) NOT NULL AUTO_INCREMENT,
  `ufile` text,
  `uid` int(11) DEFAULT NULL,
  PRIMARY KEY (`fileid`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fileup
-- ----------------------------
INSERT INTO `fileup` VALUES ('32', 'E:\\code\\OnlineOfTeacher\\out\\artifacts\\OnlineOfTeacher_war_exploded\\img\\bd68efb441864b549b35f22e4bcd4214.xls', '35');
INSERT INTO `fileup` VALUES ('33', 'E:\\code\\OnlineOfTeacher\\out\\artifacts\\OnlineOfTeacher_war_exploded\\img\\40a055e1a410442abda13eea7eafb79f.txt', '37');

-- ----------------------------
-- Table structure for papertest
-- ----------------------------
DROP TABLE IF EXISTS `papertest`;
CREATE TABLE `papertest` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `cid` int(11) DEFAULT NULL,
  `cname` varchar(233) DEFAULT NULL,
  `title` varchar(233) DEFAULT NULL,
  `opta` varchar(233) DEFAULT NULL,
  `optb` varchar(255) DEFAULT NULL,
  `optc` varchar(255) DEFAULT NULL,
  `optd` varchar(255) DEFAULT NULL,
  `reallyopt` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of papertest
-- ----------------------------
INSERT INTO `papertest` VALUES ('1', '9', '数据库', 'test', 'a', 'b', 'c', 'd', '2');
INSERT INTO `papertest` VALUES ('2', '9', null, 'shangxi', 'aa', 'bb', 'cc', 'dd', '3');
INSERT INTO `papertest` VALUES ('3', '9', '数据库', 'nihao', 'ac', 'bc', 'cc', 'dc', '1');
INSERT INTO `papertest` VALUES ('4', '10', '操作系统', 'shangxi', 'qwe', 'ew', 'qwe', 're', '2');
INSERT INTO `papertest` VALUES ('5', '10', '操作系统', 'shangxi', '321', '23', '321', '32', '1');
INSERT INTO `papertest` VALUES ('6', '9', '数据库', '312', '231', '23132', '231', '1321', '1');
INSERT INTO `papertest` VALUES ('7', '11', '操作系统', 'test', 'testa', 'b', 'c', 'd', '1');
INSERT INTO `papertest` VALUES ('8', '14', '运筹学', '你为什么这么可爱', '嗯', '额外', '那', '而且', '4');
INSERT INTO `papertest` VALUES ('9', '9', '数据库', '', '', '', '', '', '1');
INSERT INTO `papertest` VALUES ('10', '9', '数据库', '', '', '', '', '', '1');
INSERT INTO `papertest` VALUES ('11', '9', '数据库', '随便发发', '而且为人', '热情', '认为', '', '2');
INSERT INTO `papertest` VALUES ('12', '9', '数据库', '', '', '', '', '', '1');
INSERT INTO `papertest` VALUES ('13', '9', '数据库', '', '', '', '', '', '1');
INSERT INTO `papertest` VALUES ('14', '19', '计算机操作系统', '1+1=？', '1', '2', '5', '3', '2');
INSERT INTO `papertest` VALUES ('15', '19', '计算机操作系统', '5*5=？', '1', '25', '2', '36', '2');

-- ----------------------------
-- Table structure for sonunit
-- ----------------------------
DROP TABLE IF EXISTS `sonunit`;
CREATE TABLE `sonunit` (
  `suid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `suarticle` varchar(255) DEFAULT NULL,
  `tid` int(11) DEFAULT NULL,
  `cid` int(11) DEFAULT NULL,
  PRIMARY KEY (`suid`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sonunit
-- ----------------------------
INSERT INTO `sonunit` VALUES ('5', '24', '第一章节的第一小节', '1', '9');
INSERT INTO `sonunit` VALUES ('6', '24', '132', '1', '9');
INSERT INTO `sonunit` VALUES ('7', '24', 'test', '1', '9');
INSERT INTO `sonunit` VALUES ('8', null, 'test', '1', '9');
INSERT INTO `sonunit` VALUES ('9', null, '321', '1', '9');
INSERT INTO `sonunit` VALUES ('10', null, 'tt', '1', '9');
INSERT INTO `sonunit` VALUES ('11', '24', 'hhh', '1', '9');
INSERT INTO `sonunit` VALUES ('12', '24', 'hhh312', '1', '9');
INSERT INTO `sonunit` VALUES ('13', '24', '真的测试', '1', '9');
INSERT INTO `sonunit` VALUES ('14', '24', '真的测试3', '1', '9');
INSERT INTO `sonunit` VALUES ('15', '24', 'ttt1', '1', '9');
INSERT INTO `sonunit` VALUES ('16', '24', 'really', '1', '9');
INSERT INTO `sonunit` VALUES ('17', '27', '第一小节', '1', '10');
INSERT INTO `sonunit` VALUES ('18', '27', '第二小节', '1', '10');
INSERT INTO `sonunit` VALUES ('19', '28', '2', '1', '9');
INSERT INTO `sonunit` VALUES ('20', '30', '第一张第一节', '1', '11');
INSERT INTO `sonunit` VALUES ('21', '31', '1', '1', '13');
INSERT INTO `sonunit` VALUES ('22', '32', '第一子单元', '1', '14');
INSERT INTO `sonunit` VALUES ('23', '33', '第一节', '1', '12');
INSERT INTO `sonunit` VALUES ('24', '34', '第一节', '1', '9');
INSERT INTO `sonunit` VALUES ('25', '34', '第二节', '1', '9');
INSERT INTO `sonunit` VALUES ('26', '35', '第一小节 操作系统的组成', '1', '19');
INSERT INTO `sonunit` VALUES ('27', '35', '第二小节 windows和linux操作系统', '1', '19');
INSERT INTO `sonunit` VALUES ('28', '35', '第三小节 讲什么呢', '1', '19');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `tuesr` varchar(23) NOT NULL,
  `tname` varchar(23) NOT NULL,
  `tpassword` varchar(23) NOT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '123', '张老师', '123');
INSERT INTO `teacher` VALUES ('2', '076', '郭老师啊', '123');

-- ----------------------------
-- Table structure for unit
-- ----------------------------
DROP TABLE IF EXISTS `unit`;
CREATE TABLE `unit` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uarticle` varchar(255) DEFAULT NULL,
  `cid` int(11) DEFAULT NULL,
  `tid` int(11) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of unit
-- ----------------------------
INSERT INTO `unit` VALUES ('24', '第一张', '9', '1');
INSERT INTO `unit` VALUES ('25', '第一张', '9', '1');
INSERT INTO `unit` VALUES ('26', '第一章', '10', '1');
INSERT INTO `unit` VALUES ('27', '第二章', '10', '1');
INSERT INTO `unit` VALUES ('28', '1', '9', '1');
INSERT INTO `unit` VALUES ('29', '321', '9', '1');
INSERT INTO `unit` VALUES ('30', '第一张', '11', '1');
INSERT INTO `unit` VALUES ('31', '第二节', '13', '1');
INSERT INTO `unit` VALUES ('32', '第一单元', '14', '1');
INSERT INTO `unit` VALUES ('33', '开学第一课', '12', '1');
INSERT INTO `unit` VALUES ('34', '第一章', '9', '1');
INSERT INTO `unit` VALUES ('35', '第一单元', '19', '1');
INSERT INTO `unit` VALUES ('36', '第二单元\r\n', '19', '1');
INSERT INTO `unit` VALUES ('37', '第三单元\r\n', '19', '1');

-- ----------------------------
-- Table structure for unitpapertest
-- ----------------------------
DROP TABLE IF EXISTS `unitpapertest`;
CREATE TABLE `unitpapertest` (
  `upid` int(11) NOT NULL AUTO_INCREMENT,
  `cid` int(11) DEFAULT NULL,
  `cname` varchar(233) DEFAULT NULL,
  `title` varchar(233) DEFAULT NULL,
  `opta` varchar(233) DEFAULT NULL,
  `optb` varchar(255) DEFAULT NULL,
  `optc` varchar(255) DEFAULT NULL,
  `optd` varchar(255) DEFAULT NULL,
  `reallyopt` varchar(255) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL COMMENT '单元的编号',
  PRIMARY KEY (`upid`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of unitpapertest
-- ----------------------------
INSERT INTO `unitpapertest` VALUES ('6', '1', '1', '11', '11', '1', '1', '1', '11', '24');
INSERT INTO `unitpapertest` VALUES ('7', null, 'test', '312', '231', '312', '321321', '321', '2', '24');
INSERT INTO `unitpapertest` VALUES ('8', null, 'test', '213', '321', '213', '213', '321', '2', '29');
INSERT INTO `unitpapertest` VALUES ('9', null, 'test', '', '', '', '', '', '1', '29');
INSERT INTO `unitpapertest` VALUES ('10', null, 'test', 'shangxi', '123', '231', '123', '321', '2', '29');
INSERT INTO `unitpapertest` VALUES ('11', null, 'test', '123', '123', '123', '123', '213', '1', '25');
INSERT INTO `unitpapertest` VALUES ('12', null, 'test', '第一张练习题', '1', '2', '3', '4', '2', '30');
INSERT INTO `unitpapertest` VALUES ('13', null, 'test', '选择题', '1', '2', '3', '4', '4', '31');
INSERT INTO `unitpapertest` VALUES ('14', null, 'test', '你为什么这么帅', '嗯', '那', '啊', '哈', '1', '32');
INSERT INTO `unitpapertest` VALUES ('16', null, 'test', '今天什么天', '晴天', '雾霾天', '阴天', '雨天', '2', '37');
INSERT INTO `unitpapertest` VALUES ('17', null, 'test', '1+1=？', '2', '3', '4', '5', '1', '37');
