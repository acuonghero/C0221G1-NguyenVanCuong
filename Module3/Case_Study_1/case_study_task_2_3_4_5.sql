-- Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự
select *
from personnel
where personnel_name like 'H%' or'K%' or 'T%' and length(personnel_name)<=15;
-- Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select *
from customer
where (year(curdate()) - year(customer_date_of_birth) between 18 and 50) and (customer_address in ("Da Nang","Quang Tri"));

-- Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select c.customer_id,c.customer_name,count(ct.contract_id)
from customer c 
join contract ct
on c.customer_id=ct.customer_id
where c.customer_type_id = 1
group by c.customer_name
order by count(ct.contract_id) ASC;


-- Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select c.customer_id,c.customer_name,ct.customer_type_name,
co.contract_id,s.service_name,co.start_contract_date,co.end_contract_date,
sum(s.rental_costs + dc.amount*ac.price) as total_money
from customer c 
left join customer_type ct on c.customer_type_id = ct.customer_type_id
left join contract co  on c.customer_id = co.customer_id
left join service s on co.service_id = s.service_id
left join detailed_contract dc on co.contract_id = dc.contract_id
left join accompanied_service ac on dc.Accompanied_service_id = ac.Accompanied_service_id
group by c.customer_id,co.contract_id,total_money;
