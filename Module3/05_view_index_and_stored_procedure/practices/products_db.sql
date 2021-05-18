drop database if exists products;
create database products;
use products;
create table products(
Id int auto_increment primary key,
product_Code varchar(50),
product_Name varchar(50),
product_Price int,
product_Amount int,
product_Description varchar(50),
product_Status varchar(50)
);

insert into products (product_Code,
product_Name,
product_Price,
product_Amount,
product_Description,
product_Status)
values ("a1","banh",1000,50,"mềm,đẹp","ok"),
("a2","keo",2000,45,"mềm,dẻo","ok"),
("a3","kem",3000,60,"lạnh","ok");
 