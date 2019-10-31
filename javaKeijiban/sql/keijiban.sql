set names utf8;
set foreign_key_checks = 0;
drop database if exists keijiban;

create database if not exists keijiban;
use keijiban;

drop table if exists comment_info;

create table comment_info(
	id int auto_increment not null primary key ,
	name varchar(30) default '名無し',
	title varchar(30) default 'No title',
	comments varchar(255),
	insert_date datetime,
	update_date datetime
	);

