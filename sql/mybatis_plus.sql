/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : mybatis_plus

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 22/03/2022 17:06:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_product
-- ----------------------------
DROP TABLE IF EXISTS `t_product`;
CREATE TABLE `t_product`  (
  `id` bigint(0) NOT NULL COMMENT '主键ID',
  `NAME` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '商品名称',
  `price` int(0) NULL DEFAULT 0 COMMENT '价格',
  `VERSION` int(0) NULL DEFAULT 0 COMMENT '乐观锁版本号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_product
-- ----------------------------
INSERT INTO `t_product` VALUES (1, '外星人笔记本', 140, 9);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `sex` int(0) NULL DEFAULT 1 COMMENT '性别',
  `age` int(0) NULL DEFAULT NULL COMMENT '年龄',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `is_deleted` int(0) NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'Jone', 1, 18, 'test1@baomidou.com', 0);
INSERT INTO `t_user` VALUES (2, 'Jack', 1, 20, 'test2@baomidou.com', 0);
INSERT INTO `t_user` VALUES (3, 'Tom', 1, 28, 'test3@baomidou.com', 0);
INSERT INTO `t_user` VALUES (4, '小明', 1, 21, 'test@atguigu.com', 0);
INSERT INTO `t_user` VALUES (5, 'Billie', 1, 24, 'test5@baomidou.com', 0);
INSERT INTO `t_user` VALUES (6, '张三', 1, 23, 'zhangsan@atguigu.com', 0);
INSERT INTO `t_user` VALUES (7, '王五', 1, 23, 'wangwu@atguigu.com', 0);
INSERT INTO `t_user` VALUES (8, '王五', 1, 23, 'wangwu@atguigu.com', 0);
INSERT INTO `t_user` VALUES (9, 'Enum', 1, 23, 'oy@123.com', 0);

SET FOREIGN_KEY_CHECKS = 1;
