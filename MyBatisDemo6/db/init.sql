DROP DATABASE IF EXISTS `mybatis-study`;
CREATE DATABASE `mybatis-study` CHARACTER SET utf8;
USE `mybatis-study`;


DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`(
    `id` INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    `user_name` VARCHAR(20) NOT NULL,
    `password` VARCHAR(20) NOT NULL,
    `age` INT NOT NULL,
    `sex` CHAR DEFAULT '男',
    `phone` CHAR(20),
    `register_date` DATETIME
);

INSERT INTO account(user_name, password, age, sex, phone, register_date)
VALUES ('小明', '0000', 18, '男', '188xxxxxxxx', '1990-10-12 10:23:12'),
       ('小王', '0000', 18, '男', '188xxxxxxxx', '1990-10-12 10:23:12'),
       ('小红', '0000', 18, '女', '188xxxxxxxx', '1990-10-12 10:23:12');