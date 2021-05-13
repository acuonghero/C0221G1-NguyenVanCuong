create database if not exists Vat_tu_managements;
use Vat_tu_managements;
create table Phieu_xuat(
`SoPX` int not null primary key, 
 `Ngay_xuat` date null
 );
 create table Vat_tu(
 `Ma_VTU` int not null primary key,
 `Ten_VTU` varchar(50) null
 );
 create table Phieu_nhap(
 `So_PN` int not null primary key,
 `Ngay_nhap` date null
 );
 create table Chi_tiet_phieu_xuat(
 `DG_Xuat` varchar(50) not null,
 `SL_Xuat` int not null,
 `So_PX` int not null,
 `Ma_VTU` int not null,
 foreign key (`So_PX`) references Phieu_xuat(`SoPX`),
 foreign key (`Ma_VTU`) references Vat_tu(`Ma_VTU`),
 primary key(`So_PX`,`Ma_VTU`)
 );
 create table Chi_tiet_phieu_nhap(
 `Ma_VTU` int,
 `So_PN` int,
 `DG_nhap` int,
 `SL_nhap` int,
 foreign key (`Ma_VTU`) references Vat_tu(`Ma_VTU`),
 foreign key (`So_PN`) references Phieu_nhap(`So_PN`),
 primary key (`Ma_VTU`,`So_PN`)
 );
 create table Don_DH(
 `So_DH` int not null primary key,
 `Ngay_DH` date
 );
 create table Nha_CC(
 `Ma_NCC` int not null primary key,
`Ten_NCC` varchar(50) null,
`Dia_chi` varchar(100) null,
`So_dien_thoai` varchar(15) null
);
create table Chi_tiet_don_dat_hang(
`So_DH` int,
`Ma_VTU` int,
foreign key (`So_DH`) references Don_DH(`So_DH`),
foreign key (`Ma_VTU`) references Vat_tu(`Ma_VTU`)
);
 create table Cung_cap(
`So_DH` int,
`Ma_NCC` int not null primary key,
foreign key (`Ma_NCC`) references Nha_CC(`Ma_NCC`),
foreign key (`So_DH`) references Don_DH(`So_DH`)
);
 