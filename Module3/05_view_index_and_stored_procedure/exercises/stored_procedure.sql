use products;
SET SQL_SAFE_UPDATES = 0;      
-- Tạo stored procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
create procedure p_product()
BEGIN
select * from products;
END; //
delimiter ;

-- Tạo store procedure thêm một sản phẩm mới
delimiter // 
create procedure insert_products (
product_Code varchar(50),
product_Name varchar(50),
product_Price int,
product_Amount int,
product_Description varchar(50),
product_Status varchar(50))
begin 
insert into products(
product_Code,
product_Name,
product_Price,
product_Amount,
product_Description,
product_Status)
values (product_Code,
product_Name,
product_Price,
product_Amount,
product_Description,
product_Status);
end; //
delimiter ;

call insert_products("a4", "sua", 3500,30,"ngọt","ok") ;
select * from products;



-- Tạo store procedure sửa thông tin sản phẩm theo id
delimiter //
create procedure edit_products (p_id int, p_name varchar(45))
begin
	update products
    set product_name = p_name 
    where id = p_id;
end; //
delimiter ;

call edit_products (1, "nem");

-- Tạo store procedure xoá sản phẩm theo id
delimiter //
create procedure del_products (p_id int)
begin
	delete from products
    where p_id = id;
end; //
delimiter ;

call del_products (1);

