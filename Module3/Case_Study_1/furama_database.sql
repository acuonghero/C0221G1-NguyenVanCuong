-- Tạo bảng
drop database if exists furama;
create database furama;
use furama;
-- bảng vị trí  
create table levels(
levels_id int primary key,
levels_name varchar(45) null
);
-- bảng trình độ 
create table degree(
degree_id int primary key,
degree_name varchar(45) null
 );
 -- bảng bộ phận
 create table parts(
 parts_id int primary key,
 parts_name varchar(45) null
 );
  -- bảng nhân viên
 create table personnel(
 personnel_id int primary key,
 personnel_name varchar(45) null,
 levels_id int,
 degree_id int,
 parts_id int,
 date_of_birth date,
 identification varchar(45) null,
 salary varchar(45) null,
 phone_number varchar(45) null,
 email varchar(45) null,
 address varchar(45) null,
 foreign key (levels_id) references levels(levels_id),
foreign key (degree_id) references degree(degree_id),
foreign key (parts_id) references parts(parts_id)
);
 -- bảng loại khách hàng
 create table Customer_type(
 customer_type_id int primary key,
 customer_type_name varchar(45) null
 );
  -- bảng khách hàng
 create table customer(
 customer_id int primary key,
 customer_type_id int,
 customer_name varchar(45) ,
 customer_date_of_birth date,
 customer_identity varchar(45),
 customer_phone_number varchar(45),
 customer_email varchar(45),
 customer_address varchar(45),
 foreign key (customer_type_id) references Customer_type(customer_type_id)
 );
 -- bảng kiểu cho thuê 
create table rental_type(
rental_type_id int primary key,
price int,
rental_type_name varchar(45) null
);
-- bảng loại dịch vụ
create table service_type(
service_type_id int primary key,
service_type_name varchar(45) null
);
  -- bảng dịch vụ 
 create table service(
 service_id int primary key,
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
  -- bảng hợp đồng
 create table contract(
 contract_id int primary key,
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
 -- bảng dịch vụ đi kèm
 create table Accompanied_service(
 Accompanied_service_id int primary key,
Accompanied_service_name varchar(45) null,
price int,
currency_unit int,
available_status varchar(45) null
);
-- bảng hợp đồng chi tiết
create table detailed_contract(
detailed_contract_id int primary key,
contract_id int,
Accompanied_service_id int,
amount int,
foreign key (Accompanied_service_id) references Accompanied_service(Accompanied_service_id),
foreign key (contract_id) references contract(contract_id)
); 
