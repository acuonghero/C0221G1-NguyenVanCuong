use sell_management;
insert into Customer(c_id,c_name,c_age)
values (1,"Minh Quan",10),
(2,"Ngoc Oanh",20),
(3,"Hong Ha",50);
insert into orders(o_id,c_id,o_date,o_total_price)
values (1,1,'2006/03/21',null),
(2,2,'2006/03/23',null),
(3,1,'2006/03/16',null);
insert into product(p_id,p_name,p_price)
values(1,'may giat',3),
(2,'tu lanh',5),
(3,'dieu hoa',7),
(4,'quat',1),
(5,'bep dien',2);
insert into order_detail (o_id,p_id,od_qty)
values (1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select *
from Orders;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select customer.c_name,product.p_name,product.p_price
from customer join orders
on customer.c_id = orders.c_id
join order_detail on orders.o_id = order_detail.o_id
join product on order_detail.p_id= product.p_id;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select c.c_name 
from customer c left join orders o
on c.c_id=o.c_id
where o.o_id is null;

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
select o.o_id,o.o_date,sum(od.od_QTY*p.p_price) as price
from orders o,order_detail od,product p
where o.o_id = od.o_id and od.p_id = p.p_id
group by o.o_id;