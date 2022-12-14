/*
 Navicat Premium Data Transfer

 Source Server         : localMysql
 Source Server Type    : MySQL
 Source Server Version : 80031
 Source Host           : localhost:3306
 Source Schema         : proIncorruptibleAiliance

 Target Server Type    : MySQL
 Target Server Version : 80031
 File Encoding         : 65001

 Date: 03/11/2022 14:47:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for file
-- ----------------------------
DROP TABLE IF EXISTS `file`;
CREATE TABLE `file` (
  `file_name` varchar(255) DEFAULT NULL,
  `content` mediumblob,
  `file_id` varchar(255) NOT NULL,
  `belong_item_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`file_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of file
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `item_id` varchar(255) NOT NULL,
  `item_name` varchar(255) NOT NULL,
  `create_date` date DEFAULT NULL,
  `creator_name` varchar(255) DEFAULT NULL,
  `creator_id` varchar(128) DEFAULT NULL,
  `html_content` varchar(5000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `belong_type` int NOT NULL,
  `belong_modular` int NOT NULL,
  `serial_no` int DEFAULT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of item
-- ----------------------------
BEGIN;
INSERT INTO `item` VALUES ('001a1584-99ad-45ca-af7f-2daf0b2f2865', 'v都不如蜂蜜的味道为', '2022-10-29', 'zealous', '202210291', '<div class=\"w-e-text-container\"><div class=\"w-e-progress-bar\"></div><div class=\"w-e-max-length-info\"></div><div class=\"w-e-scroll\" style=\"overflow-y: auto;\"><div id=\"w-e-textarea-3\" data-slate-editor=\"\" data-slate-node=\"value\" suppresscontenteditablewarning=\"\" role=\"textarea\" spellcheck=\"true\" autocorrect=\"true\" autocapitalize=\"true\" contenteditable=\"true\"><p id=\"w-e-element-6\" data-slate-node=\"element\"><span id=\"w-e-text-7\" data-slate-node=\"text\"><span data-slate-leaf=\"true\"><span data-slate-string=\"true\">我的味道为的味道为的味道为</span></span></span></p></div></div><div class=\"w-e-text-placeholder\" style=\"display: none;\">请输入内容</div><div class=\"w-e-bar w-e-hover-bar w-e-bar-bottom w-e-bar-hidden\" style=\"left: 15px; top: 39.5px;\"></div></div>', 7, 2, 1);
INSERT INTO `item` VALUES ('0042d8bd-3977-41f6-8615-51a5f6cdd320', '的味道为u积极', '2022-10-29', 'zealous', '202210291', '<div class=\"w-e-text-container\"><div class=\"w-e-progress-bar\"></div><div class=\"w-e-max-length-info\"></div><div class=\"w-e-scroll\" style=\"overflow-y: auto;\"><div id=\"w-e-textarea-2\" data-slate-editor=\"\" data-slate-node=\"value\" suppresscontenteditablewarning=\"\" role=\"textarea\" spellcheck=\"true\" autocorrect=\"true\" autocapitalize=\"true\" contenteditable=\"true\"><p id=\"w-e-element-2\" data-slate-node=\"element\"><span id=\"w-e-text-3\" data-slate-node=\"text\"><span data-slate-leaf=\"true\"><span data-slate-string=\"true\">等我的味道为你今年</span></span></span></p></div></div><div class=\"w-e-text-placeholder\" style=\"display: none;\">请输入内容</div><div class=\"w-e-bar w-e-bar-hidden w-e-hover-bar\"></div></div>', 4, 1, 6);
INSERT INTO `item` VALUES ('227388b9-4715-4592-bbc8-672237639e08', '积极', '2022-10-29', 'zealous', '202210291', '<div class=\"w-e-text-container\"><div class=\"w-e-progress-bar\"></div><div class=\"w-e-max-length-info\"></div><div class=\"w-e-scroll\" style=\"overflow-y: auto;\"><div id=\"w-e-textarea-1\" data-slate-editor=\"\" data-slate-node=\"value\" suppresscontenteditablewarning=\"\" role=\"textarea\" spellcheck=\"true\" autocorrect=\"true\" autocapitalize=\"true\" contenteditable=\"true\"><p id=\"w-e-element-0\" data-slate-node=\"element\" data-slate-inline=\"false\"><span id=\"w-e-text-1\" data-slate-node=\"text\"><span data-slate-leaf=\"true\"><span data-slate-zero-width=\"n\" data-slate-length=\"0\">﻿<br></span></span></span></p></div></div><div class=\"w-e-text-placeholder\">请输入内容</div><div class=\"w-e-bar w-e-bar-hidden w-e-hover-bar\"></div></div>', 4, 1, 2);
INSERT INTO `item` VALUES ('24853246-3693-48ea-aa99-4f6766e7c652', '反而纷纷发的味道为', '2022-10-29', 'zealous', '202210291', '<div class=\"w-e-text-container\"><div class=\"w-e-progress-bar\"></div><div class=\"w-e-max-length-info\"></div><div class=\"w-e-scroll\" style=\"overflow-y: auto;\"><div id=\"w-e-textarea-3\" data-slate-editor=\"\" data-slate-node=\"value\" suppresscontenteditablewarning=\"\" role=\"textarea\" spellcheck=\"true\" autocorrect=\"true\" autocapitalize=\"true\" contenteditable=\"true\"><p id=\"w-e-element-6\" data-slate-node=\"element\"><span id=\"w-e-text-7\" data-slate-node=\"text\"><span data-slate-leaf=\"true\"><span data-slate-string=\"true\">的味道为</span></span></span></p></div></div><div class=\"w-e-text-placeholder\" style=\"display: none;\">请输入内容</div><div class=\"w-e-bar w-e-hover-bar w-e-bar-bottom w-e-bar-hidden\" style=\"left: 15px; top: 39.5px;\"></div></div>', 10, 3, 1);
INSERT INTO `item` VALUES ('2ef350bc-1dbd-493c-ab3a-5d87b60a208a', 'v都不如蜂蜜', '2022-10-29', 'zealous', '202210291', '<div class=\"w-e-text-container\"><div class=\"w-e-progress-bar\"></div><div class=\"w-e-max-length-info\"></div><div class=\"w-e-scroll\" style=\"overflow-y: auto;\"><div id=\"w-e-textarea-3\" data-slate-editor=\"\" data-slate-node=\"value\" suppresscontenteditablewarning=\"\" role=\"textarea\" spellcheck=\"true\" autocorrect=\"true\" autocapitalize=\"true\" contenteditable=\"true\"><p id=\"w-e-element-6\" data-slate-node=\"element\"><span id=\"w-e-text-7\" data-slate-node=\"text\"><span data-slate-leaf=\"true\"><span data-slate-string=\"true\">我的味道为的味道为</span></span></span></p></div></div><div class=\"w-e-text-placeholder\" style=\"display: none;\">请输入内容</div><div class=\"w-e-bar w-e-hover-bar w-e-bar-bottom w-e-bar-hidden\" style=\"left: 15px; top: 39.5px;\"></div></div>', 6, 2, 3);
INSERT INTO `item` VALUES ('34a50d72-e6cb-4d47-a1fb-284671705197', '反而纷纷发', '2022-10-29', 'zealous', '202210291', '<div class=\"w-e-text-container\"><div class=\"w-e-progress-bar\"></div><div class=\"w-e-max-length-info\"></div><div class=\"w-e-scroll\" style=\"overflow-y: auto;\"><div id=\"w-e-textarea-3\" data-slate-editor=\"\" data-slate-node=\"value\" suppresscontenteditablewarning=\"\" role=\"textarea\" spellcheck=\"true\" autocorrect=\"true\" autocapitalize=\"true\" contenteditable=\"true\"><p id=\"w-e-element-6\" data-slate-node=\"element\"><span id=\"w-e-text-7\" data-slate-node=\"text\"><span data-slate-leaf=\"true\"><span data-slate-string=\"true\">的味道为我的味道</span></span></span></p></div></div><div class=\"w-e-text-placeholder\" style=\"display: none;\">请输入内容</div><div class=\"w-e-bar w-e-hover-bar w-e-bar-bottom w-e-bar-hidden\" style=\"left: 15px; top: 39.5px;\"></div></div>', 9, 3, 1);
INSERT INTO `item` VALUES ('407af2f4-226c-4078-abbb-46a0bfe5e6e3', '测试新增修改', '2022-10-30', 'zealous', '202210291', '<p>测试新增修改</p>', 1, 1, 1);
INSERT INTO `item` VALUES ('5b16f2d1-bb78-4744-95f2-47e5cdba7ec0', '对我的我', '2022-10-29', 'zealous', '202210291', '<div class=\"w-e-text-container\"><div class=\"w-e-progress-bar\"></div><div class=\"w-e-max-length-info\"></div><div class=\"w-e-scroll\" style=\"overflow-y: auto;\"><div id=\"w-e-textarea-2\" data-slate-editor=\"\" data-slate-node=\"value\" suppresscontenteditablewarning=\"\" role=\"textarea\" spellcheck=\"true\" autocorrect=\"true\" autocapitalize=\"true\" contenteditable=\"true\"><p id=\"w-e-element-3\" data-slate-node=\"element\"><span id=\"w-e-text-4\" data-slate-node=\"text\"><span data-slate-leaf=\"true\"><span data-slate-string=\"true\">对我的味道</span></span></span></p></div></div><div class=\"w-e-text-placeholder\" style=\"display: none;\">请输入内容</div><div class=\"w-e-bar w-e-bar-hidden w-e-hover-bar\"></div></div>', 6, 2, 2);
INSERT INTO `item` VALUES ('83c29207-8145-41be-876f-1e6b62a58f30', '测试新增修改', '2022-10-30', 'zealous', '202210291', '<p>端午节的记得加我想你的就问你的</p>', 5, 2, 1);
INSERT INTO `item` VALUES ('97d4d5db-4f5c-451c-b467-bedb316a45dc', 'nnahu糊的味道为', '2022-10-29', 'zealous', '202210291', '<div class=\"w-e-text-container\"><div class=\"w-e-progress-bar\"></div><div class=\"w-e-max-length-info\"></div><div class=\"w-e-scroll\" style=\"overflow-y: auto;\"><div id=\"w-e-textarea-2\" data-slate-editor=\"\" data-slate-node=\"value\" suppresscontenteditablewarning=\"\" role=\"textarea\" spellcheck=\"true\" autocorrect=\"true\" autocapitalize=\"true\" contenteditable=\"true\"><p id=\"w-e-element-2\" data-slate-node=\"element\" data-slate-inline=\"false\"><span id=\"w-e-text-3\" data-slate-node=\"text\"><span data-slate-leaf=\"true\"><span data-slate-zero-width=\"n\" data-slate-length=\"0\">﻿<br></span></span></span></p></div></div><div class=\"w-e-text-placeholder\">请输入内容</div><div class=\"w-e-bar w-e-bar-hidden w-e-hover-bar\"></div></div>', 4, 1, 4);
INSERT INTO `item` VALUES ('99f7b660-1066-4170-95a1-7d655aa78936', 'v的份额', '2022-10-29', 'zealous', '202210291', '<div class=\"w-e-text-container\"><div class=\"w-e-progress-bar\"></div><div class=\"w-e-max-length-info\"></div><div class=\"w-e-scroll\" style=\"overflow-y: auto;\"><div id=\"w-e-textarea-3\" data-slate-editor=\"\" data-slate-node=\"value\" suppresscontenteditablewarning=\"\" role=\"textarea\" spellcheck=\"true\" autocorrect=\"true\" autocapitalize=\"true\" contenteditable=\"true\"><p id=\"w-e-element-6\" data-slate-node=\"element\"><span id=\"w-e-text-7\" data-slate-node=\"text\"><span data-slate-leaf=\"true\"><span data-slate-string=\"true\">dwdw的味道为</span></span></span></p></div></div><div class=\"w-e-text-placeholder\" style=\"display: none;\">请输入内容</div><div class=\"w-e-bar w-e-hover-bar w-e-bar-bottom w-e-bar-hidden\" style=\"left: 15px; top: 39.5px;\"></div></div>', 1, 1, 4);
INSERT INTO `item` VALUES ('a109f77f-2455-414b-b1cc-90f316eda987', 'huhuhugyg', '2022-10-29', 'zealous', '202210291', '<div class=\"w-e-text-container\"><div class=\"w-e-progress-bar\"></div><div class=\"w-e-max-length-info\"></div><div class=\"w-e-scroll\" style=\"overflow-y: auto;\"><div id=\"w-e-textarea-2\" data-slate-editor=\"\" data-slate-node=\"value\" suppresscontenteditablewarning=\"\" role=\"textarea\" spellcheck=\"true\" autocorrect=\"true\" autocapitalize=\"true\" contenteditable=\"true\"><p id=\"w-e-element-2\" data-slate-node=\"element\" data-slate-inline=\"false\"><span id=\"w-e-text-3\" data-slate-node=\"text\"><span data-slate-leaf=\"true\"><span data-slate-zero-width=\"n\" data-slate-length=\"0\">﻿<br></span></span></span></p></div></div><div class=\"w-e-text-placeholder\">请输入内容</div><div class=\"w-e-bar w-e-bar-hidden w-e-hover-bar\"></div></div>', 4, 1, 3);
INSERT INTO `item` VALUES ('a88eeb21-ee34-42bb-b24f-f351ed881cac', '的味道为', '2022-10-29', 'zealous', '202210291', '<div class=\"w-e-text-container\"><div class=\"w-e-progress-bar\"></div><div class=\"w-e-max-length-info\"></div><div class=\"w-e-scroll\" style=\"overflow-y: auto;\"><div id=\"w-e-textarea-2\" data-slate-editor=\"\" data-slate-node=\"value\" suppresscontenteditablewarning=\"\" role=\"textarea\" spellcheck=\"true\" autocorrect=\"true\" autocapitalize=\"true\" contenteditable=\"true\"><p id=\"w-e-element-2\" data-slate-node=\"element\"><span id=\"w-e-text-3\" data-slate-node=\"text\"><span data-slate-leaf=\"true\"><span data-slate-string=\"true\">等我的味道为</span></span></span></p></div></div><div class=\"w-e-text-placeholder\" style=\"display: none;\">请输入内容</div><div class=\"w-e-bar w-e-bar-hidden w-e-hover-bar\"></div></div>', 4, 1, 5);
INSERT INTO `item` VALUES ('ba6c199e-f699-4212-a845-6e8555bf10ef', 'dwdw的味道为', '2022-10-29', 'zealous', '202210291', '<div class=\"w-e-text-container\"><div class=\"w-e-progress-bar\"></div><div class=\"w-e-max-length-info\"></div><div class=\"w-e-scroll\" style=\"overflow-y: auto;\"><div id=\"w-e-textarea-1\" data-slate-editor=\"\" data-slate-node=\"value\" suppresscontenteditablewarning=\"\" role=\"textarea\" spellcheck=\"true\" autocorrect=\"true\" autocapitalize=\"true\" contenteditable=\"true\"><p id=\"w-e-element-0\" data-slate-node=\"element\"><span id=\"w-e-text-1\" data-slate-node=\"text\"><span data-slate-leaf=\"true\"><span data-slate-string=\"true\">等我的味道</span></span></span></p></div></div><div class=\"w-e-text-placeholder\" style=\"display: none;\">请输入内容</div><div class=\"w-e-bar w-e-bar-hidden w-e-hover-bar\"></div></div>', 9, 3, 2);
INSERT INTO `item` VALUES ('c0eafd48-f100-45d9-a267-352bdd8e12e8', '对我的味道', '2022-10-29', 'zealous', '202210291', '<div class=\"w-e-text-container\"><div class=\"w-e-progress-bar\"></div><div class=\"w-e-max-length-info\"></div><div class=\"w-e-scroll\" style=\"overflow-y: auto;\"><div id=\"w-e-textarea-3\" data-slate-editor=\"\" data-slate-node=\"value\" suppresscontenteditablewarning=\"\" role=\"textarea\" spellcheck=\"true\" autocorrect=\"true\" autocapitalize=\"true\" contenteditable=\"true\"><p id=\"w-e-element-6\" data-slate-node=\"element\"><span id=\"w-e-text-7\" data-slate-node=\"text\"><span data-slate-leaf=\"true\"><span data-slate-string=\"true\">电玩城</span></span></span></p></div></div><div class=\"w-e-text-placeholder\" style=\"display: none;\">请输入内容</div><div class=\"w-e-bar w-e-hover-bar w-e-bar-bottom w-e-bar-hidden\" style=\"left: 15px; top: 39.5px;\"></div></div>', 3, 1, 1);
INSERT INTO `item` VALUES ('cd40815a-3c4d-4132-902c-66c7141493fb', 'cdwddw', '2022-10-29', 'zealous', '202210291', '<div class=\"w-e-text-container\"><div class=\"w-e-progress-bar\"></div><div class=\"w-e-max-length-info\"></div><div class=\"w-e-scroll\" style=\"overflow-y: auto;\"><div id=\"w-e-textarea-11\" data-slate-editor=\"\" data-slate-node=\"value\" suppresscontenteditablewarning=\"\" role=\"textarea\" spellcheck=\"true\" autocorrect=\"true\" autocapitalize=\"true\" contenteditable=\"true\"><p id=\"w-e-element-36\" data-slate-node=\"element\"><span id=\"w-e-text-37\" data-slate-node=\"text\"><span data-slate-leaf=\"true\"><span data-slate-string=\"true\">dwdwdwdw</span></span></span></p></div></div><div class=\"w-e-text-placeholder\" style=\"display: none;\">请输入内容</div><div class=\"w-e-bar w-e-bar-hidden w-e-hover-bar\"></div></div>', 6, 2, 1);
INSERT INTO `item` VALUES ('d2a5e3d3-81b6-49c2-873d-12ab4bd28612', 'fifer', '2022-10-29', 'zealous', '202210291', '<div class=\"w-e-text-container\"><div class=\"w-e-progress-bar\"></div><div class=\"w-e-max-length-info\"></div><div class=\"w-e-scroll\" style=\"overflow-y: auto;\"><div id=\"w-e-textarea-3\" data-slate-editor=\"\" data-slate-node=\"value\" suppresscontenteditablewarning=\"\" role=\"textarea\" spellcheck=\"true\" autocorrect=\"true\" autocapitalize=\"true\" contenteditable=\"true\"><p id=\"w-e-element-6\" data-slate-node=\"element\"><span id=\"w-e-text-7\" data-slate-node=\"text\"><span data-slate-leaf=\"true\"><span data-slate-string=\"true\">电玩城我的味道为</span></span></span></p></div></div><div class=\"w-e-text-placeholder\" style=\"display: none;\">请输入内容</div><div class=\"w-e-bar w-e-hover-bar w-e-bar-bottom w-e-bar-hidden\" style=\"left: 15px; top: 39.5px;\"></div></div>', 4, 1, 1);
INSERT INTO `item` VALUES ('e6ac443b-39e2-48fb-8019-bbd5dce2a57a', 'dwdwdwdwdwfgrgr', '2022-10-29', 'zealous', '202210291', '<div class=\"w-e-text-container\"><div class=\"w-e-progress-bar\"></div><div class=\"w-e-max-length-info\"></div><div class=\"w-e-scroll\" style=\"overflow-y: auto;\"><div id=\"w-e-textarea-3\" data-slate-editor=\"\" data-slate-node=\"value\" suppresscontenteditablewarning=\"\" role=\"textarea\" spellcheck=\"true\" autocorrect=\"true\" autocapitalize=\"true\" contenteditable=\"true\"><p id=\"w-e-element-6\" data-slate-node=\"element\"><span id=\"w-e-text-7\" data-slate-node=\"text\"><span data-slate-leaf=\"true\"><span data-slate-string=\"true\">的味道为</span></span></span></p></div></div><div class=\"w-e-text-placeholder\" style=\"display: none;\">请输入内容</div><div class=\"w-e-bar w-e-hover-bar w-e-bar-bottom w-e-bar-hidden\" style=\"left: 15px; top: 39.5px;\"></div></div>', 1, 1, 3);
INSERT INTO `item` VALUES ('ed136d86-d2d4-4956-b694-721066688649', '果然个人', '2022-10-29', 'zealous', '202210291', '<div class=\"w-e-text-container\"><div class=\"w-e-progress-bar\"></div><div class=\"w-e-max-length-info\"></div><div class=\"w-e-scroll\" style=\"overflow-y: auto;\"><div id=\"w-e-textarea-3\" data-slate-editor=\"\" data-slate-node=\"value\" suppresscontenteditablewarning=\"\" role=\"textarea\" spellcheck=\"true\" autocorrect=\"true\" autocapitalize=\"true\" contenteditable=\"true\"><p id=\"w-e-element-6\" data-slate-node=\"element\"><span id=\"w-e-text-7\" data-slate-node=\"text\"><span data-slate-leaf=\"true\"><span data-slate-string=\"true\">我的味道</span></span></span></p></div></div><div class=\"w-e-text-placeholder\" style=\"display: none;\">请输入内容</div><div class=\"w-e-bar w-e-hover-bar w-e-bar-bottom w-e-bar-hidden\" style=\"left: 15px; top: 39.5px;\"></div></div>', 8, 2, 1);
INSERT INTO `item` VALUES ('f691a62f-2c85-4305-b44f-e140b4938631', '大户u好烦人', '2022-10-29', 'zealous', '202210291', '<div class=\"w-e-text-container\"><div class=\"w-e-progress-bar\"></div><div class=\"w-e-max-length-info\"></div><div class=\"w-e-scroll\" style=\"overflow-y: auto;\"><div id=\"w-e-textarea-11\" data-slate-editor=\"\" data-slate-node=\"value\" suppresscontenteditablewarning=\"\" role=\"textarea\" spellcheck=\"true\" autocorrect=\"true\" autocapitalize=\"true\" contenteditable=\"true\"><p id=\"w-e-element-25\" data-slate-node=\"element\"><span id=\"w-e-text-26\" data-slate-node=\"text\"><span data-slate-leaf=\"true\"><span data-slate-string=\"true\">swswd的读物呼呼</span></span></span></p></div></div><div class=\"w-e-bar w-e-bar-hidden w-e-hover-bar\"></div></div>', 1, 1, 2);
COMMIT;

-- ----------------------------
-- Table structure for lianmeng_type
-- ----------------------------
DROP TABLE IF EXISTS `lianmeng_type`;
CREATE TABLE `lianmeng_type` (
  `type_name` varchar(255) NOT NULL,
  `type_id` int NOT NULL,
  `belong_modular` int NOT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of lianmeng_type
-- ----------------------------
BEGIN;
INSERT INTO `lianmeng_type` VALUES ('各单位诉求及解决情况', 1, 1);
INSERT INTO `lianmeng_type` VALUES ('连队化+指导员服务机制', 2, 1);
INSERT INTO `lianmeng_type` VALUES ('施工现场服务', 3, 1);
INSERT INTO `lianmeng_type` VALUES ('督办工作', 4, 1);
INSERT INTO `lianmeng_type` VALUES ('廉防机制', 5, 2);
INSERT INTO `lianmeng_type` VALUES ('“啄木鸟”监督队工作开展情况', 6, 2);
INSERT INTO `lianmeng_type` VALUES ('“十不准”开展情况', 7, 2);
INSERT INTO `lianmeng_type` VALUES ('廉洁案例', 8, 2);
INSERT INTO `lianmeng_type` VALUES ('廉洁文化示范点', 9, 3);
INSERT INTO `lianmeng_type` VALUES ('警示教育开展情况', 10, 3);
COMMIT;

-- ----------------------------
-- Table structure for modular_dict
-- ----------------------------
DROP TABLE IF EXISTS `modular_dict`;
CREATE TABLE `modular_dict` (
  `modular_name` varchar(255) NOT NULL COMMENT '模块名字',
  `modular_id` int NOT NULL COMMENT '模块编码',
  PRIMARY KEY (`modular_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of modular_dict
-- ----------------------------
BEGIN;
INSERT INTO `modular_dict` VALUES ('服务联动', 1);
INSERT INTO `modular_dict` VALUES ('廉防联动', 2);
INSERT INTO `modular_dict` VALUES ('教育联动', 3);
COMMIT;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `user_type` int DEFAULT NULL COMMENT '1:普通用户；2:管理员',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user_info
-- ----------------------------
BEGIN;
INSERT INTO `user_info` VALUES ('111', '111', '111', 1);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
