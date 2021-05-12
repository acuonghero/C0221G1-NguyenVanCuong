create schema if not exists `student-management`;
use `student-management`;
create table Student(
`id`  int auto_increment not null primary key,
`name` varchar(45) null,
`age` int null,
`country` varchar(45) null);
insert into Student (`id`,`name`,`age`,`country`)
values ("1","Nam","18","Nha Trang");
select * from `Student`;