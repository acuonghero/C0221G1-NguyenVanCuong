-- Tạo bảng
drop database if exists furama;
create database furama;
use furama;
SET SQL_SAFE_UPDATES = 0;
-- bảng vị trí  
create table levels(
levels_id int auto_increment primary key,
levels_name varchar(45) null
);
insert into levels(levels_name)
values ("Le Tan"),
("Phuc Vu"),
("Chuyen Vien"),
("Giam Sat"),
("Quan Ly"),
("Giam Doc");
select * from levels;

-- bảng trình độ 
create table degree(
degree_id int auto_increment primary key,
degree_name varchar(45) null
 );
 insert into degree(degree_name)
values ("Trung Cap"),
("Cao Dang"),
("Dai Hoc"),
("Cao Hoc"),
("Thac Si"),
("Tien Si");
select * from degree;

 -- bảng bộ phận
 create table parts(
 parts_id int auto_increment primary key,
 parts_name varchar(45) null
 );
 insert into parts(parts_name)
values ("Sale-Marketing"),
("Hanh Chinh"),
("Phuc Vu"),
("Quan Ly");
select * from parts;
 
  -- bảng nhân viên
 create table personnel(
 personnel_id int auto_increment primary key,
 personnel_name varchar(45) null,
 levels_id int,
 degree_id int,
 parts_id int,
 date_of_birth date,
 identity_card varchar(45) null,
 salary varchar(45) null,
 phone_number varchar(45) null,
 email varchar(45) null,
 address varchar(45) null,
 foreign key (levels_id) references levels(levels_id),
foreign key (degree_id) references degree(degree_id),
foreign key (parts_id) references parts(parts_id)
);
insert into personnel(personnel_name,levels_id,parts_id,degree_id,date_of_birth,identity_card,salary,phone_number,email,address)
values ("Huynh Tan Khoa",1,1,1,"1999/12/05",345212345,800,0909111123,"dathuynh@gmail.com","Quang Tri"),
("Truong Cong Tuan",2,2,2,"1995/12/09",256765888,800,0909111123,"tuantruong@gmail.com","Da Nang"),
("Nguyen Quoc Huy",3,3,3,"1990/12/05",137564222,800,0909111123,"huynguyen@gmail.com","Hai Chau"),
("Duong Thanh Hau",4,4,4,"1990/12/05",534646242,800,0909111123,"haunguyen@gmail.com","Nghe An"),
("Nguyen Phuong Nam",5,4,5,"1990/12/05",435132665,800,0909111123,"namnguyen@gmail.com","Quang Binh"),
("Nguyen Cong Tin",6,4,6,"1990/12/05",435246345,800,0909111123,"tinnguyen@gmail.com","Hue");
select * from personnel;

 -- bảng loại khách hàng
 create table Customer_type(
 customer_type_id int auto_increment primary key,
 customer_type_name varchar(45) null
 );
 insert into customer_type(customer_type_name)
values ("Diamond"),
("Platinium"),
("Gold"),
("Silver"),
("Member");
select * from customer_type;

  -- bảng khách hàng
 create table customer(
 customer_id int auto_increment primary key,
 customer_type_id int,
 customer_name varchar(45) ,
 customer_date_of_birth date,
 customer_identity_card varchar(45),
 customer_phone_number varchar(45),
 customer_email varchar(45),
 customer_address varchar(45),
 foreign key (customer_type_id) references Customer_type(customer_type_id)
 );
 insert into customer (customer_type_id,customer_name,customer_date_of_birth,customer_identity_card,customer_phone_number,customer_email,customer_address)
values (1,"Nguyen Cuong","1997/09/18",222999887,0988333222,"nguyencuong@gmail.com","Quang Binh"),
(2,"Phan Khanh","1990/07/18",234876345,0222123854,"phankhanh@gmail.com","Da nang"),
(3,"Huynh Tan","1995/06/18",123098324,0333867534,"huynhtan@gmail.com","Hue"),
(4,"Tran Yen","1999/09/18",325654345,0575424234,"tranyen@gmail.com","Hoi An"),
(5,"Trinh Cong Son","1997/07/18",754253564,0122354642,"trinhson@gmail.com","Vinh"),
(4,"Nguyen Thang","1989/06/18",856345236,0333456234,"nguyenthang@gmail.com","Quang Binh");
 
 -- bảng kiểu cho thuê 
create table rental_type(
rental_type_id int auto_increment primary key,
price int,
rental_type_name varchar(45) null
);
insert into rental_type(rental_type_name,price)
values ("Nam",1200),
("Thang",150),
("Ngay",10),
("Gio",2);
select * from rental_type;

-- bảng loại dịch vụ
create table service_type(
service_type_id int auto_increment primary key,
service_type_name varchar(45) null
);
insert into service_type(service_type_name)
values ("Binh dan"),
("Trung cap"),
("Cao cap");
select * from service_type;

  -- bảng dịch vụ 
 create table service(
 service_id int auto_increment primary key,
 service_name varchar(45),
 area int,
 number_of_floors int,
 maximum_people varchar(45),
 rental_costs varchar(45),
 rental_type_id int,
 service_type_id int,
 service_status varchar(45),
 foreign key (rental_type_id) references rental_type(rental_type_id) ,
 foreign key (service_type_id) references service_type(service_type_id)
 );
 insert into service(service_name,area,number_of_floors,maximum_people,rental_costs,rental_type_id,service_type_id,service_status)
values ("Villa",40,3,10,200,3,2,"day"),
("House",30,2,6,200,3,2,"day"),
("Room",20,0,4,100,1,2,"day"),
("Villa",40,4,14,250,3,1,"trong"),
("House",30,2,6,200,3,2,"trong"),
("Room",20,0,4,100,1,1,"trong");
select * from service;
 
  -- bảng hợp đồng
 create table contract(
 contract_id int auto_increment primary key,
 personnel_id int,
 customer_id int,
 service_id int,
 start_contract_date date,
 end_contract_date date,
 deposits int,
 total_money int,
 foreign key(personnel_id) references personnel(personnel_id),
 foreign key(customer_id) references customer(customer_id),
 foreign key(service_id) references service(service_id)
 );
 insert into contract(personnel_id,customer_id,service_id,start_contract_date,end_contract_date,deposits,total_money)
values (1,1,1,"2020/10/12","2020/10/15",100,0),
(2,2,2,"2019/11/10","2020/11/15",120,0),
(2,2,2,"2019/11/10","2020/11/15",120,0),
(2,2,2,"2019/11/10","2020/11/15",120,0),
(2,2,2,"2019/11/10","2020/11/15",120,0),
(2,2,2,"2019/11/10","2020/11/15",120,0),
(2,2,2,"2019/11/10","2020/11/15",120,0),
(2,2,2,"2019/11/10","2020/11/15",120,0),
(2,2,2,"2019/11/10","2020/11/15",120,0),
(2,2,2,"2019/11/10","2020/11/15",120,0),
(2,2,2,"2019/11/10","2021/11/15",120,0),
(3,5,2,"2017/11/10","2018/11/15",120,0),
(2,3,2,"2018/11/10","2009/11/15",150,0),
(1,4,1,"2012/10/12","2013/10/15",100,0),
(1,4,1,"2019/10/12","2021/10/15",100,0),
(3,5,2,"2017/11/10","2018/11/15",120,0);
select * from contract;

 
 -- bảng dịch vụ đi kèm
 create table Accompanied_service(
 Accompanied_service_id int auto_increment primary key,
Accompanied_service_name varchar(45) null,
price int,
currency_unit int,
available_status varchar(45) null
);
insert into Accompanied_service(Accompanied_service_name,price)
values ("massage",50),
("karaoke",50),
("thuc an",10),
("thuc uong",5);
select * from Accompanied_service;

-- bảng hợp đồng chi tiết
create table detailed_contract(
detailed_contract_id int auto_increment primary key,
contract_id int,
Accompanied_service_id int,
amount int,
foreign key (Accompanied_service_id) references Accompanied_service(Accompanied_service_id),
foreign key (contract_id) references contract(contract_id)
); 
insert into detailed_contract(contract_id,Accompanied_service_id,amount)
values (1,1,1),
(2,2,3),
(2,2,3),
(3,3,2),
(4,4,3),
(5,2,2);
select * from detailed_contract;
