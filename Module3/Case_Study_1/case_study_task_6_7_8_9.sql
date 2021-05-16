-- Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
select s.service_id,s.service_name,s.area,s.rental_costs,st.service_type_name
from service s
join service_type st on s.service_type_id = st.service_type_id
join contract c on c.service_id = s.service_id
where s.service_id not in (
select c.service_id 
from contract
where (year (start_contract_date)=2019) 
and (month(start_contract_date) in (1,2,3))
);
-- Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 
-- nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
select s.service_id,s.service_name,s.area,s.maximum_people,s.rental_costs,
c.start_contract_date,st.service_type_name
from service s
join service_type st on s.service_type_id= st.service_type_id
join contract c on c.service_id=s.service_id
where year(start_contract_date)=2018 
and not exists (
select c.start_contract_date
from contract
where year(start_contract_date) = 2019
and c.service_id= s.service_id)
group by s.service_id;  
-- Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
-- cách 1
select distinct c.customer_name
from customer c;
-- cách 2
select c.customer_name 
from customer c
group by c.customer_name;           
-- cách 3
select c.customer_name
from customer c
union select c.customer_name
from customer c;
-- Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019
-- thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(co.start_contract_date) as 'Month', count(co.customer_id) as total_customer_id,
sum(s.rental_costs + dc.amount*ac.price) as total_price
from customer cu 
left join customer_type ct on cu.customer_type_id = ct.customer_type_id
left join contract co  on cu.customer_id = co.customer_id
left join service s on co.service_id = s.service_id
left join detailed_contract dc on co.contract_id = dc.contract_id
left join accompanied_service ac on dc.accompanied_service_id = ac.accompanied_service_id
group by month(co.start_contract_date);

select month(co.start_contract_date) as 'month' , count(co.customer_id) as 'customer_amount',
sum(s.rental_costs + dc.amount*ac.price) as 'total_money'
from contract co 
join service s on co.service_id = s.service_id
join detailed_contract dc on co.contract_id = dc.contract_id
join accompanied_service ac on dc.accompanied_service_id = ac.accompanied_service_id
where year(start_contract_date)=2019
group by 'month';
