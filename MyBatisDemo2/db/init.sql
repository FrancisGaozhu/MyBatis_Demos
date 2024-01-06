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

INSERT INTO `t_account`(a_user_name, a_user_password, a_age, a_sex, a_phone, a_register_date)
VALUES ('安琪拉', '0001', 15, '女', '18846457728', '3000-1-23'),
       ('瑶', '0002', 16, '女', '18846457728', '3001-2-12'),
       ('云中君', '0003', 20, '男', '18846457728', '2999-5-23');
