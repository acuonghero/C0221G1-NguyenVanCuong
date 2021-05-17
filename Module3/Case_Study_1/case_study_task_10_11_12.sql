-- Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm.
-- kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, 
-- soLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
select co.contract_id,co.start_contract_date,co.end_contract_date,co.deposits,dc.amount,count(dc.detailed_contract_id) as accompanied_service_amount
from contract co
join detailed_contract dc on co.contract_id = dc.contract_id
group by co.contract_id;

-- Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng
-- bởi những Khách hàng có TenLoaiKhachHang là “Diamond” 
-- và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select ac.Accompanied_service_id,ac.Accompanied_service_name,
ac.price,ac.currency_unit,ac.available_status,cu.customer_name,
cu.customer_address,ct.customer_type_name
from accompanied_service ac
join detailed_contract dc on ac.Accompanied_service_id = dc.Accompanied_service_id
join contract co on dc.contract_id = co.contract_id
join customer cu on co.customer_id = cu.customer_id
join customer_type ct on ct.customer_type_id = cu.customer_type_id
where (ct.customer_type_name = "diamond") and (cu.customer_address = "Vinh"  or  cu.customer_address = "Quang Ngai");

-- Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang,
-- SoDienThoaiKhachHang, TenDichVu, 
-- SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), 
-- TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 
-- nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
select co.contract_id,p.personnel_name,cu.customer_name,cu.customer_phone_number,
s.service_name,count(dc.detailed_contract_id) as 'detailed_contract_amount',
co.start_contract_date,co.deposits
from contract co
join personnel p on co.personnel_id = p.personnel_id
join customer cu on co.customer_id = cu.customer_id
join service s on co.service_id = s.service_id
join detailed_contract dc on co.contract_id = dc.contract_id
where ( 
(month(co.start_contract_date) in (10,11,12)) 
and  year(co.start_contract_date) = 2019 ) 
and not exists (select co.contract_id
				from contract co
				where (month(co.start_contract_date) between 1 and 6)  
				and year(co.start_contract_date) = 2019)
group by co.contract_id;