-- Tạo bảng
drop database if exists furama_db;
create database furama_db;
use furama_db;
-- SET SQL_SAFE_UPDATES = 0;
-- bảng vị trí  
create table `position`(
position_id int auto_increment primary key,
position_name varchar(45) null
);


-- bảng trình độ 
create table education_degree(
education_degree_id int auto_increment primary key,
education_degree_name varchar(45) null
 );


 -- bảng bộ phận
 create table division(
 division_id int auto_increment primary key,
 division_name varchar(45) null
 );

 -- account
create table `user`(
username varchar(255) primary key,
`password` varchar(255)
);

create table `role`(
role_id int primary key ,
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




 -- bảng loại khách hàng
 create table Customer_type(
 customer_type_id int auto_increment primary key,
 customer_type_name varchar(45) null
 );


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

 
 -- bảng kiểu cho thuê 
create table rent_type(
rent_type_id int auto_increment primary key,
rent_type_cost int,
rent_type_name varchar(45) null
);

-- bảng loại dịch vụ
create table service_type(
service_type_id int auto_increment primary key,
service_type_name varchar(45) null
);


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


