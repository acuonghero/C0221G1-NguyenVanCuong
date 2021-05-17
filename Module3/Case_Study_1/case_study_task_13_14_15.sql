-- Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau.
use furama;
select ac.Accompanied_service_id, ac.Accompanied_service_name,
ac.price,ac.currency_unit,ac.available_status,
 sum(dc.amount)  as number_of_uses
from accompanied_service ac
join detailed_contract dc on ac.Accompanied_service_id = dc.Accompanied_service_id
group by ac.Accompanied_service_name,ac.Accompanied_service_name
having number_of_uses >= all (select  sum(dc.amount) 
				              from detailed_contract dc 
                              group by dc.Accompanied_service_id
				              );
                                        
-- Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.
select co.contract_id,st.service_type_name,ac.Accompanied_service_name,
count(AC.Accompanied_service_id) as number_of_uses
from accompanied_service ac
join detailed_contract dc on ac.accompanied_service_id = dc.accompanied_service_id
join contract co on dc.contract_id = co.contract_id
join service s on co.service_id = s.service_id
join service_type st on s.service_type_id = st.service_type_id
group by ac.Accompanied_service_name
having number_of_uses = 1;

-- Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi 
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
select pn.personnel_id,pn.personnel_name,d.degree_name,p.parts_name,pn.phone_number,
pn.address,count(co.contract_id) as number_of_contracts 
from personnel pn
join degree d on pn.degree_id = d.degree_id
join parts p on pn.parts_id = p.parts_id
join contract co on pn.personnel_id = co.personnel_id
where year(co.start_contract_date) between 2018 and 2019
group by pn.personnel_id
having number_of_contracts <= 3;