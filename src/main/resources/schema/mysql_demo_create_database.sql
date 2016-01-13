-- 删除数据库
drop database if exists db_demo;
-- 创建数据库并设置字符集编码为utf8和字符排序为utf8
create database if not exists db_demo default character set utf8 collate utf8_general_ci;
-- 使用数据库
use db_demo;
-- 删除表
drop table if exists tb_operator;
-- 创建表并设置相关存储引擎和字符编码
create table if not exists tb_operator(
	id int auto_increment primary key comment '用户编号(主键)',
	username varchar(50) not null comment '用户名',
	password varchar(50) not null comment '密码',
	name varchar(50) not null comment '姓名',
	birthday date not null comment '生日',
	sex enum('男','女') not null default '男' comment '性别',
	sal decimal(10,2) comment '工资',
	address varchar(200) comment '地址'
)engine=InnoDB default charset = utf8;