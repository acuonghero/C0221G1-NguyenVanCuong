-- Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau.

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

-- Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi 
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
