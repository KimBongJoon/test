create table book_info (
	name varchar(10),
	writer varchar(10),
	code varchar(10),
	location varchar(10)
);

create table user_info (
	name varchar(10),
	id varchar(10),
	pw varchar(10),
	addr varchar(20)
);

create table rental (
	rental_id varchar(10),
	rental_code varchar(10),
	date varchar(10)
);

insert into book_info values ('Java Swing', 'Loy', '100', 'A1');
insert into book_info values ('Java RMI', 'Grosso', '200', 'B1');
insert into book_info values ('Java NIO', 'Hitchens', '300', 'C1');

select * from book_info;

insert into user_info values ('Kim', 'Kim', '1234', 'aa');
insert into user_info values ('Lee', 'Lee', '5678', 'bb');
insert into user_info values ('Park', 'Park', '9012', 'cc');

select * from user_info;

insert into rental values ('Kim', '200', '2018-10-17');
insert into rental values ('Kim', '300', '2018-10-17');
insert into rental values ('Lee', '100', '2018-10-18');

select * from rental;

