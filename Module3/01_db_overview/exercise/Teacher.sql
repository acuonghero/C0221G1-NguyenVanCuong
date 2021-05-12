create database if not exists `teacher-management`;
use `teacher-management`;
create table Teacher(
`id` int auto_increment not null primary key,
`name` varchar(45) null,
`age` int null,
`country` varchar(45) null);
insert into Teacher(`id`,`name`,`age`,`country`)
values(1,"Nhi",18,"Đà Nẵng");
select * from `Teacher`;