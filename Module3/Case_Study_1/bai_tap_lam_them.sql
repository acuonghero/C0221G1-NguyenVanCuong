drop database if exists class;
create database class;
use class;
create table faculty(
faculty_id char(10) primary key,
faculty_name char(50),
phone char(50)
);
insert into faculty 
values
("a1","Dia ly","0934235464"),
("a2","QLTN","0934235464"),
("a3","Toan","0934235464"),
("a4","Cong nghe sinh hoc","0934235464")
;

create table project(
project_id char(10) primary key,
project_name char(30),
expense int,
place_of_intern char(30)
);
insert into project()
values ('p1','khao sat',200,'quang binh'),
('p2','do dien tich',200,'quang tri'),
('p3','tinh chu vi',200,'hue'),
('p4','do do ph',200,'da nang');


create table student(
student_id int primary key,
student_name char(40),
faculty_id char(10),
date_of_birth date,
place_of_birth char(30),
foreign key (faculty_id) references  faculty(faculty_id)
);
insert into student 
values (1,'nguyen van cuong','a1','1997/05/06','quang binh'),
(2,'phan gia khanh','a2','1990/05/21','da nang'),
(3,'nguyen phuong nam','a3','1999/03/08','hue');


create table instructor(
instructor_id int primary key,
instructor_name char(30),
salary decimal(5,2),
faculty_id char(10),
foreign key (faculty_id) references faculty(faculty_id)
);
insert into instructor
values (1,'Nguyen van hieu',600,'a1'),
 (2,'Nguyen van hau',700,'a2'),
 (3,'Nguyen van hai',800,'a3'),
 (4,'Nguyen van toan',900,'a4');

create table instructor_student(
student_id int,
project_id char(10),
instructor_id int,
grade decimal(5,2),
foreign key (student_id) references student(student_id),
foreign key (project_id) references project(project_id),
foreign key (instructor_id) references instructor(instructor_id)
);
insert into instructor_student
values (1,'p1',1,'8'),
 (2,'p2',2,'7'),
 (3,'p3',3,'6');
 