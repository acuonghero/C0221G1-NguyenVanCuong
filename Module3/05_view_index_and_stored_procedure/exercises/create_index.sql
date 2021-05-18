use products;
alter table products 
add index Unique_Index(product_Code);

alter table products
add index Composite_Index (product_Name,product_Price);

explain select * 
from products
where product_code = 1;

explain select * 
from products
where product_name = "bánh" or product_price =2000;
-- truy xuất nhanh hơn

ALTER TABLE products DROP INDEX idx_customer_name;
