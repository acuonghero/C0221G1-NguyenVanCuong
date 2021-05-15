--  Task 1 : 1.	Thêm mới thông tin cho tất cả các bảng có trong CSDL để có thể thõa mãn các yêu cầu bên dưới.
use furama;
SET SQL_SAFE_UPDATES = 0;
truncate table  contract;
truncate table personnel;
truncate table levels;
truncate table degree;
truncate table parts;
truncate table customer;
truncate table customer_type;
truncate table service;
truncate table service_type;
truncate table rental_type;
truncate table detailed_contract;
truncate table accompanied_service;
insert into levels(levels_name)
values ("Le Tan"),
("Phuc Vu"),
("Chuyen Vien"),
("Giam Sat"),
("Quan Ly"),
("Giam Doc");
select * from levels;
insert into degree(degree_name)
values ("Trung Cap"),
("Cao Dang"),
("Dai Hoc");
select * from degree;

insert into parts(parts_name)
values ("Sale-Marketing"),
("Hanh Chinh"),
("Phuc Vu"),
("Quan Ly");
select * from parts;
insert into customer_type(customer_type_name)
values ("Diamond"),
("Platinium"),
("Gold"),
("Silver"),
("Member");
select * from customer_type;
insert into rental_type(rental_type_name,price)
values ("Nam",1200),
("Thang",150),
("Ngay",10),
("Gio",2);
select * from rental_type;
insert into personnel(personnel_name,levels_id,parts_id,degree_id,date_of_birth,identity_card,salary,phone_number,email,address)
values ("Huynh Tan Khoa",1,1,1,"1999/12/05",345212345,800,0909111123,"dathuynh@gmail.com","Quang Tri"),
("Truong Cong Tuan",2,2,2,"1995/12/09",256765888,800,0909111123,"tuantruong@gmail.com","Da Nang"),
("Nguyen Quoc Huy",3,3,3,"1990/12/05",137564222,800,0909111123,"huynguyen@gmail.com","Quang Tri");
select * from personnel;
-- massage, karaoke, thức ăn, nước uống
insert into Accompanied_service(Accompanied_service_name,price)
values ("massage",50),
("karaoke",50),
("thuc an",10),
("thuc uong",5);
select * from Accompanied_service;
insert into service_type(service_type_name)
values ("Binh dan"),
("Trung cap"),
("Cao cap");
select * from service_type;
update service
set service_type_id = 3
where service_id = 3;
select * from service;
insert into service(service_name,area,number_of_floors,maximum_people,rental_costs,rental_type_id,service_type_id,service_status)
values ("Villa",40,3,10,200,3,2,"day"),
("House",30,2,6,200,3,2,"day"),
("Room",20,0,4,100,1,2,"day"),
("Villa",40,4,14,250,3,1,"trong"),
("House",30,2,6,200,3,2,"trong"),
("Room",20,0,4,100,1,1,"trong");
select * from service;
insert into customer (customer_type_id,customer_name,customer_date_of_birth,customer_identity_card,customer_phone_number,customer_email,customer_address)
values (1,"Nguyen Cuong","1997/09/18",222999887,0988333222,"nguyencuong@gmail.com","Quang Binh"),
(2,"Phan Khanh","1990/07/18",234876345,0222123854,"phankhanh@gmail.com","Da nang");
select * from customer;
insert into contract(personnel_id,customer_id,service_id,start_contract_date,end_contract_date,deposits,total_money)
values (1,1,1,"2020/10/12","2020/10/15",100,0),
(2,2,2,"2020/11/10","2020/11/15",120,0),
(3,5,2,"2017/11/10","2018/11/15",120,0);
select * from contract;
insert into detailed_contract(contract_id,Accompanied_service_id,amount)
values (1,1,2),
(2,2,3),
(3,3,2),
(4,4,3),
(5,2,2);
select * from detailed_contract;