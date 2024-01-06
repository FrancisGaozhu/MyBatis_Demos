DROP DATABASE IF EXISTS `mybatis-study`;
CREATE DATABASE `mybatis-study` CHARACTER SET utf8;
USE `mybatis-study`;


DROP TABLE IF EXISTS `t_account`;
CREATE TABLE `t_account`(
    `a_id` INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    `a_user_name` VARCHAR(20) NOT NULL,
    `a_password` VARCHAR(20) NOT NULL,
    `a_age` INT NOT NULL,
    `a_sex` CHAR DEFAULT '男',
    `a_phone` CHAR(20),
    `a_register_date` DATETIME
);

INSERT INTO t_account(a_user_name, a_password, a_age, a_sex, a_phone, a_register_date)
VALUES ('小明', '0000', 18, '男', '188xxxxxxxx', '1990-10-12 10:23:12'),
       ('小王', '0000', 18, '男', '188xxxxxxxx', '1990-10-12 10:23:12'),
       ('小红', '0000', 18, '女', '188xxxxxxxx', '1990-10-12 10:23:12');


DROP TABLE IF EXISTS `t_topic`;
CREATE TABLE `t_topic`(
    t_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    t_title VARCHAR(200) NOT NULL,
    t_content TEXT NOT NULL,
    t_time DATETIME DEFAULT NOW(),
    t_account_id INT NOT NULL
)CHARACTER SET utf8;
INSERT INTO t_topic(t_title, t_content, t_account_id)
VALUES ('今天心情好', '确实今天心情超级好', 1),
       ('今天还好么？', '应该还好', 1),
       ('啦啦啦', '我是卖报的小画家', 2);