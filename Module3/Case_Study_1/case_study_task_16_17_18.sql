use furama;
SET SQL_SAFE_UPDATES = 0; 

-- task 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.
delete from personnel
where personnel_id not in (
	select personnel_id
    from contract
    where year(start_contract_date) in ( 2017, 2018, 2019 )
);

-- Task 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond,
-- chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 
-- là lớn hơn 10.000.000 VNĐ
update customer
set customer_type_id = 1 
where (customer_type_id = 1)
and customer_id in (select c_id.customer_id from (
									select co.customer_id  , sum(s.rental_costs + dc.amount*ac.price) as total
									from contract co
									join detailed_contract dc on dc.contract_id = co.contract_id
									join accompanied_service ac on ac.accompanied_service_id = dc.accompanied_service_id
									join service s on s.service_id = co.service_id
									where year(co.start_contract_date) = 2019
									group by co.customer_id
									having total >500) as c_id
									);

-- 18.	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràng buộc giữa các bảng).
delete from customer
where customer_id in (
	select customer_id
    from contract
    where year(start_contract_date) < 2016
);