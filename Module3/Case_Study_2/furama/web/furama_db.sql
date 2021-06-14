
drop database if exists furama_db;
create database furama_db;
use furama_db;
-- SET SQL_SAFE_UPDATES = 0;
-- bảng vị trí  
create table `position`(
position_id int auto_increment primary key,
position_name varchar(45) null
);
insert into `position` (position_name) 
values  ("Le Tan"),
("Phuc Vu"),
("Chuyen Vien"),
("Giam Sat"),
("Quan Ly"),
("Giam Doc");

-- bảng trình độ 
create table education_degree(
education_degree_id int auto_increment primary key,
education_degree_name varchar(45) null
 );
 
 insert into education_degree(education_degree_name)
values ("Trung Cap"),
("Cao Dang"),
("Dai Hoc"),
("Cao Hoc"),
("Thac Si"),
("Tien Si");
select * from education_degree;

 -- bảng bộ phận
 create table division(
 division_id int auto_increment primary key,
 division_name varchar(45) null
 );

insert into division(division_name)
values ("Sale-Marketing"),
("Hanh Chinh"),
("Phuc Vu"),
("Quan Ly");
select * from division;
 -- account
create table `user`(
username varchar(255) primary key,
`password` varchar(255)
);

insert into `user` 
values ("Cuong1","cuong12345"),
("Cuong2","cuong12345"),
("Cuong3","cuong12345"),
("Cuong4","cuong12345"),
("Cuong5","cuong12345");
select * from `user`;

create table `role`(
role_id int auto_increment primary key ,
role_name varchar(255)
);

create table user_role(
role_id int ,
username varchar(255),
foreign key (role_id) references `role`(role_id),
foreign key (username) references `user`(username));
 
  -- bảng nhân viên
 create table employee(
 employee_id int auto_increment primary key,
 employee_name varchar(45) null,
 position_id int,
 education_degree_id int,
 division_id int,
 employee_birthday varchar(45),
 employee_id_card varchar(45) null,
 employee_salary varchar(45) null,
 employee_phone varchar(45) null,
 employee_email varchar(45) null,
 employee_address varchar(45) null,
 username varchar(255),
 foreign key (position_id) references `position`(position_id),
 foreign key (education_degree_id) references education_degree(education_degree_id),
 foreign key (division_id) references division(division_id),
 foreign key (username) references `user`(username)
);
insert into employee (employee_name,position_id,education_degree_id,division_id,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,username)
values("nguyen hoang",2,3,2,"1997/04/05","23876578123",800,"273659137957","askjfhd@gmail.com","quang binh","cuong2"),
("nguyen anh",4,3,2,"1997/04/05","23876578123",800,"273659137957","askjfhd@gmail.com","quang binh","cuong2"),
("nguyen nam",3,1,2,"1997/04/05","23876578123",800,"273659137957","askjfhd@gmail.com","quang binh","cuong2"),
("nguyen kim",1,3,3,"1997/04/05","23876578123",800,"273659137957","askjfhd@gmail.com","quang binh","cuong2"),
("nguyen huy",2,2,2,"1997/04/05","23876578123",800,"273659137957","askjfhd@gmail.com","quang binh","cuong2");

select * 
from employee
where employee_name like "%m%"; 

select * from employee;
update employee
set employee_name=?,
position_id=?,
education_degree_id=?,
division_id=?,
employee_birthday=?,
employee_id_card=?,
employee_salary=?,
employee_phone=?,
employee_email=?,
employee_address=?,
username=?
where employee_id=?;

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
 customer_day_of_birth varchar(45),
 customer_gender varchar(45),
 customer_identity_card varchar(45),
 customer_phone_number varchar(45),
 customer_email varchar(45),
 customer_address varchar(45),
 foreign key (customer_type_id) references Customer_type(customer_type_id)
 );
insert into customer (customer_type_id,customer_name,customer_day_of_birth,customer_gender,customer_identity_card,customer_phone_number,customer_email,customer_address)
values (1,"Nguyen Cuong","1997/09/18","male",222999887,0988333222,"nguyencuong@gmail.com","Quang Binh"),
(2,"Phan Khanh","1990/07/18","male",234876345,0222123854,"phankhanh@gmail.com","Da nang"),
(3,"Huynh Tan","1995/06/18","male",123098324,0333867534,"huynhtan@gmail.com","Hue"),
(4,"Tran Yen","1999/09/18","female",325654345,0575424234,"tranyen@gmail.com","Hoi An"),
(5,"Trinh Cong Son","1997/07/18","male",754253564,0122354642,"trinhson@gmail.com","Vinh"),
(4,"Nguyen Thang","1989/06/18","male",856345236,0333456234,"nguyenthang@gmail.com","Quang Binh");
 
 select * from customer;
 
 -- select * from customer where customer_id=1;
 
 
 -- bảng kiểu cho thuê 
create table rent_type(
rent_type_id int auto_increment primary key,
rent_type_cost double,
rent_type_name varchar(45) null
);
insert into rent_type(rent_type_cost,rent_type_name)
values (1200,"Nam"),
(150,"Thang"),
(10,"Ngay"),
(2,"Gio");
select * from rent_type;

-- bảng loại dịch vụ
create table service_type(
service_type_id int auto_increment primary key,
service_type_name varchar(45) null
);
insert into service_type(service_type_name)
values  ("Binh dan"),
("Trung cap"),
("Cao cap");
select * from service_type;
  -- bảng dịch vụ 
 create table service(
 service_id int auto_increment primary key,
 service_name varchar(45),
 service_area int,
 service_costs varchar(45),
 service_max_people int,
 rent_type_id int,
 service_type_id int,
 standard_room varchar(45),
 description_other_convernience varchar(45),
 pool_area double,
 number_of_floors int,
 foreign key (rent_type_id) references rent_type(rent_type_id) ,
 foreign key (service_type_id) references service_type(service_type_id)
 );

insert into service(service_name,service_area,number_of_floors,service_max_people,service_costs,rent_type_id,service_type_id,standard_room,description_other_convernience,pool_area)
values ("Villa",40,3,10,200,3,2,"binh dan","khong co",100),
("House",30,2,6,200,3,2,"binh dan","khong co",200),
("Room",20,0,4,100,1,2,"binh dan","khong co",300),
("Villa",40,4,14,250,3,1,"binh dan","khong co",350),
("House",30,2,6,200,3,2,"binh dan","khong co",250),
("Room",20,0,4,100,1,1,"binh dan","khong co",400);
 select * from service;
 
  -- bảng hợp đồng
 create table contract(
 contract_id int auto_increment primary key,
 contract_start_date date,
 contract_end_date date,
 contract_total_money double,
 contract_deposits double,
 employee_id int,
 customer_id int,
 service_id int,
 foreign key(employee_id) references employee(employee_id),
 foreign key(customer_id) references customer(customer_id),
 foreign key(service_id) references service(service_id)
 );
select * from contract;

 
 -- bảng dịch vụ đi kèm
 create table attach_service(
 attach_service_id int auto_increment primary key,
attach_service_name varchar(45) null,
attach_service_cost int,
attach_service_unit int,
attach_service_status varchar(45) null
);


-- bảng hợp đồng chi tiết
create table contract_detailed(
contract_detailed_id int auto_increment primary key,
contract_id int,
attach_service_id int,
quantily int,
foreign key (attach_service_id) references attach_service(attach_service_id),
foreign key (contract_id) references contract(contract_id)
); 


