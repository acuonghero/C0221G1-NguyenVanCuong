create database if not exists `teacher-management`;
use `teacher-management`;
create table Class(
`id` int(1) auto_increment not null primary key,
`name` varchar(45) null);
insert into Class(`id`,`name`)
values(`id`,"1A"),
(`id`,"1B"),
(`id`,"1C");
select * from Class;
drop table Class;

create table Teacher(
`id` int auto_increment not null primary key,
`name` varchar(45) null,
`age` int null,
`country` varchar(45) null);
insert into Teacher(`name`,`age`,`country`)
values("Nhi",18,"Đà Nẵng"),
("Nam",19,"Huế"),("Huy",20,"Quảng Nam");
update Teacher 
set `name`="Nhung",`age`=18,`country`= "Quảng Bình"
where `id`=1 ;
select * from `Teacher`;
drop table Teacher;