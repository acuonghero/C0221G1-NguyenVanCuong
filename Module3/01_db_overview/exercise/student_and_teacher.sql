create schema if not exists `student-management`;
use `student-management`;
create table Student(
`id`  int auto_increment not null primary key,
`name` varchar(45) null,
`age` int null,
`country` varchar(45) null);
select *
from `student`;

create table Teacher(
`id` int auto_increment not null primary key,
`name` varchar(45) null,
`age` int null,
`country` varchar(45) null);
