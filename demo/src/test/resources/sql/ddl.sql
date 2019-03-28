create table employee(
id int primary key auto_increment,
name varchar(20) not null,
sex char(4),
workno char(9) not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8;