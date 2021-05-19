use furama;
SET SQL_SAFE_UPDATES = 0; 
SET FOREIGN_KEY_CHECKS=0;
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
create view total_money_to_pay as

select cu.customer_name, ct.customer_type_name, month(start_contract_date) as months, co.start_contract_date, sum(s.rental_costs) as total_money 
from contract co 
join service s on s.service_id = co.service_id
join customer cu on cu.customer_id = co.customer_id
join customer_type ct on ct.customer_type_id = cu.customer_type_id
group by cu.customer_type_id

union all

select cu.customer_name, ct.customer_type_name, month(start_contract_date) as months, co.start_contract_date, sum(ac.price*dc.amount) as total_money
from contract co
join detailed_contract dc on dc.contract_id = co.contract_id
join accompanied_service ac on ac.accompanied_service_id = dc.accompanied_service_id
join customer cu on cu.customer_id = co.customer_id
join customer_type ct on ct.customer_type_id = cu.customer_type_id
group by cu.customer_id;

-- select customer_name, customer_type_name, sum(total_money) as total 
select *
from total_money_to_pay
where (
	year(start_contract_date) = 2019
)
group by months
having total > 10000000;


-- 18.	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràng buộc giữa các bảng).
delete from customer
where customer_id in (
	select customer_id
    from contract
    where year(start_contract_date) < 2016
);