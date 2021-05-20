-- 19.	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 4 lần trong năm 2019 lên gấp đôi.
use furama;

update accompanied_service 
set price = price*2 
where accompanied_service_id in (
	select dc.accompanied_service_id
	from detailed_contract dc
	join contract co on co.contract_id = dc.contract_id
	where year(co.start_contract_date) = 2019
	group by dc.accompanied_service_id 
	having sum(dc.amount) >=4
);

-- 20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị bao gồm 
-- ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
select customer_id as ID,customer_name as `Name`,customer_email as Email,customer_phone_number as Phone_number,
customer_date_of_birth as date_of_birth,customer_address as address, 1 as `type`
from customer 
union all
select personnel_id, personnel_name,email,phone_number,date_of_birth,address, 0 as `type`
from personnel





