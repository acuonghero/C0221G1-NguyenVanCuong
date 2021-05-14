drop database if exists furama;
create database furama;
use furama;
create table levels(
levels_id int primary key,
levels_name varchar(45) null
);
create table degree(
degree_id int primary key,
degree_name varchar(45) null
 );
 create table parts(
 parts_id int primary key,
 parts_name varchar(45) null
 );
 create table Accompanied_service(
 Accompanied_service_id int primary key,
Accompanied_service_name varchar(45) null,
price int,
currency_unit int,
available_status varchar(45) null
);
create table service_type(
service_type_id int primary key,
service_type_name varchar(45) null
);
create table rental_type(
rental_type_id int primary key,
price int,
rental_type_name varchar(45) null
);
 create table Customer_type(
 customer_type_id int primary key,
 customer_type_name varchar(45) null
 );
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
create table detailed_contract(
detailed_contract_id int primary key,
contract_id int,
Accompanied_service_id int,
amount int,
foreign key (Accompanied_service_id) references Accompanied_service(Accompanied_service_id)
); 
 