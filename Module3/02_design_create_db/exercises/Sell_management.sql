create database if not exists Sell_management;
use Sell_management;
create table Customer(
`c_ID` int,
`c_Name` varchar(50),
`c_Age` int 
);
alter table Customer
add primary key(`c_ID`); 
create table Orders(
`o_ID` int primary key,
`c_ID` int,
`o_Date` date,
`o_Total_Price` int,
foreign key (`c_ID`) references Customer(`c_ID`)
);
create table Product(
`p_ID` int primary key,
`p_Name` varchar(50),
`p_Price` varchar(15)
);
create table Order_detail(
`o_ID` int,
`p_ID` int,
`od_QTY` varchar(50),
foreign key (`o_ID`) references Orders(`o_ID`),
foreign key (`p_ID`) references Product(`p_ID`),
primary key(`o_ID`,`p_ID`)
);