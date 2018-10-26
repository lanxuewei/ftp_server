-- 创建数据库
CREATE DATABASE `ftp_server` CHARACTER SET utf8 COLLATE utf8_general_ci;

-- 使用数据库
USE ftp_server;

-- 创建user表
CREATE TABLE IF NOT EXISTS `user`(
  `id` BIGINT AUTO_INCREMENT COMMENT 'id',
  `user_name` VARCHAR(20) NOT NULL COMMENT '用户名',
  `password` VARCHAR(32) NOT NULL COMMENT '密码',
  `status` INT NOT NULL DEFAULT 1 COMMENT '权限默认普通用户 0表示管理员 1表示普通用户',
  `real_name` VARCHAR(20) NOT NULL COMMENT '姓名',
  `sex` INT NOT NULL DEFAULT 1 COMMENT '性别默认男生 0表示女 1表示男',
  `img` VARCHAR(120) COMMENT '头像',
  `des` TEXT COMMENT '个性语录',
  `create_time` timestamp(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
  `update_time` timestamp(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间',

  -- 主键
  PRIMARY KEY (`id`),
  -- 唯一索引
  UNIQUE KEY `uk_user`(`user_name`) COMMENT '用户名唯一索引',
  -- 索引
  KEY (status),
  KEY (sex)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT='用户表';


