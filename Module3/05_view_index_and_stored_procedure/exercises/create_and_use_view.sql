use products;
-- Tạo view 
CREATE VIEW products_views AS
SELECT product_Code, product_Name, product_Price, product_Status
FROM  products;

select * from products_views;

-- Cập nhật view
update products_views
set product_Name = "gạo", productPrice = 5000
where product_Name = "kẹo";

select * 
from products_views;

-- Xóa view
drop view products_views;