DROP TABLE IF EXISTS item;

CREATE TABLE item (
  item_id INT AUTO_INCREMENT  PRIMARY KEY,
  item_code VARCHAR(250) NOT NULL,
  item_name VARCHAR(250) NOT NULL,
  price decimal,
  item_type VARCHAR(250)
);

insert into item(item_code,item_name, price, item_type)
VALUES('IC1','IN1',100,'IT1'),
('IC2','IN2',200,'IT2'),
('IC3','IN3',300,'IT3'),
('IC4','IN4',400,'IT1'),
('IC5','IN5',500,'IT2'),
('IC6','IN6',600,'IT3'),
('IC7','IN7',700,'IT1');