create table subject (
	id varchar(10),
	title varchar(10),
	content varchar(30),
	location varchar(20)
);

desc subject;

insert into subject values ('id01', 'title01', 'content01', 'kg01');
insert into subject values ('id02', 'title02', 'content02', 'kg02');
insert into subject values ('id03', 'title03', 'content03', 'kg03');
insert into subject values ('id04', 'title04', 'content04', 'kg04');
insert into subject values ('id05', 'title05', 'content05', 'kg05');

select * from subject;