drop database if exists products;
create database products;
use products;
create table products(
Id int auto_increment primary key,
productCode varchar(50),
productName varchar(50),
productPrice varchar(50),
productAmount varchar(50),
productDescription varchar(50),
productStatus varchar(50)
);

insert into products (productCode,
productName,
productPrice,
productAmount,
productDescription,
productStatus)
values ("a1","bánh",1000,50,"mềm,đẹp","ok"),
("a2","kẹo",2000,45,"mềm,dẻo","ok"),
("a3","kem",3000,60,"lạnh","ok");
 