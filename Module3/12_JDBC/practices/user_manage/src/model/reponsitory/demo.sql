CREATE DATABASE demo;
USE demo;

create table users (
 id  int(3) NOT NULL AUTO_INCREMENT,
 name varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);

insert into users(name, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(name, email, country) values('Kante','kante@che.uk','Kenia');
select * from users;

select * 
from users
WHERE country LIKE "K%";

DELIMITER $$

CREATE PROCEDURE get_user_by_id(IN user_id INT)

BEGIN

    SELECT users.name, users.email, users.country

    FROM users

    where users.id = user_id;

    END$$

DELIMITER ;
call get_user_by_id(1);
  

DELIMITER $$

CREATE PROCEDURE insert_user(

IN user_name varchar(50),

IN user_email varchar(50),

IN user_country varchar(50)

)

BEGIN

    INSERT INTO users(name, email, country) VALUES(user_name, user_email, user_country);

    END$$

DELIMITER ;

DELIMITER ;
call get_user_by_id(1);
  

DELIMITER $$

CREATE PROCEDURE update_user_by_procedure(

IN user_name varchar(50),

IN user_email varchar(50),

IN user_country varchar(50)

)

BEGIN

    INSERT INTO users(name, email, country) VALUES(user_name, user_email, user_country);

    END$$

DELIMITER ;

DELIMITER $$

CREATE PROCEDURE update_user_by_id(
IN user_id int,

IN user_name varchar(50),

IN user_email varchar(50),

IN user_country varchar(50)
)

BEGIN
    update `users`
    set `name` = user_name , email = user_email, country = user_country
	where id = user_id;
    END$$

DELIMITER ;
call update_user_by_id(1,"toan","sajkfh@sjhfu","asfaf");
