DROP DATABASE IF EXISTS `mybatis-study`;
CREATE DATABASE `mybatis-study` CHARACTER SET utf8;
USE `mybatis-study`;


DROP TABLE IF EXISTS `t_account`;
CREATE TABLE `t_account`(
    `a_id` INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    `a_user_name` VARCHAR(20) NOT NULL,
    `a_user_password` VARCHAR(20) NOT NULL,
    `a_age` INT NOT NULL,
    `a_sex` CHAR DEFAULT '男',
    `a_phone` CHAR(20),
    `a_register_date` DATETIME
);

