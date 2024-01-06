DROP DATABASE IF EXISTS `mybatis-study`;
CREATE DATABASE `mybatis-study` CHARACTER SET utf8;
USE `mybatis-study`;


DROP TABLE IF EXISTS `t_goods`;
CREATE TABLE `t_goods`(
    `g_id` INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    `g_name` VARCHAR(200) NOT NULL,
    `g_price` DECIMAL(8, 2) NOT NULL,
    `g_brand` VARCHAR(20) NOT NULL,
    `g_product_date` DATE,
    `g_eff_time` VARCHAR(20)
)CHARACTER SET utf8;


INSERT INTO t_goods(g_name, g_price, g_brand, g_product_date, g_eff_time)
VALUES ('小熊饼干', 3.25, '旺旺', '2023-12-1', '2年'),
       ('可口可乐', 5, '可口可乐集团', '2023-1-12', '3年'),
       ('苏打饼', 10, '旺旺', '2023-5-2', '5年');