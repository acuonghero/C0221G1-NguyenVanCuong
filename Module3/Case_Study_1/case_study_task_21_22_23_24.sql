-- 21.	Tạo khung nhìn có tên là V_NHANVIEN để lấy được thông tin của tất cả các nhân viên có địa chỉ là “Hải Châu” 
-- và đã từng lập hợp đồng cho 1 hoặc nhiều Khách hàng bất kỳ  với ngày lập hợp đồng là “12/12/2019”

create view V_NHANVIEN as
select p.personnel_id,p.personnel_name,p.levels_id,p.degree_id,p.parts_id,p.address
from personnel p
join contract co on co.personnel_id = p.personnel_id
where p.address = "Hai Chau" 
and co.start_contract_date = "2019/12/12";
select * from V_NHANVIEN;


-- 22.	Thông qua khung nhìn V_NHANVIEN thực hiện cập nhật địa chỉ thành “Liên Chiểu” 
-- đối với tất cả các Nhân viên được nhìn thấy bởi khung nhìn này.

update V_NHANVIEN 
set address = "Lien Chieu";
select * from V_NHANVIEN;


-- 23.	Tạo Store procedure Sp_1 Dùng để xóa thông tin của một Khách hàng nào đó với 
-- Id Khách hàng được truyền vào như là 1 tham số của Sp_1

delimiter //
create procedure sp_1 (p_id int)
begin
	delete from customer
    where  p_id = customer_id;
end; //
delimiter ;

call sp_1(2);

-- 24.	Tạo Store procedure Sp_2 Dùng để thêm mới vào bảng HopDong với yêu cầu Sp_2 phải thực hiện kiểm tra tính hợp lệ của dữ liệu bổ sung,
-- với nguyên tắc không được trùng khóa chính và đảm bảo toàn vẹn tham chiếu đến các bảng liên quan.

delimiter // 
create procedure sp_2 (
 p_personnel_id int,
 p_customer_id int,
 p_service_id int,
 p_start_contract_date date,
 p_end_contract_date date,
 p_deposits int,
 p_total_money int)
begin 
if (p_personnel_id in (select personnel_id from personnel) 
and p_customer_id in (select customer_id from customer)
and p_service_id in (select service_id from service))
then 
insert into contract(
 personnel_id ,
 customer_id ,
 service_id ,
 start_contract_date ,
 end_contract_date ,
 deposits ,
 total_money)
values (p_personnel_id ,
 p_customer_id ,
 p_service_id ,
 p_start_contract_date ,
 p_end_contract_date ,
 p_deposits ,
 p_total_money);
else
SIGNAL SQLSTATE '02000' SET MESSAGE_TEXT = 'Không tìm thấy ID này';
 end if;
end; //
delimiter ;
call sp_2(6,3,4,"2017/11/10","2018/11/15",120,0);