show databases;

create table member(
	id varchar(50) not null primary key,
	passwd varchar(16) not null,
	name varchar(10) not null,
	reg_date datetime not null
);

create table test(
	num_id int not null primary key auto_increment,
	title varchar(50) not null,
	content text not null
);

create table member(
	id varchar(50) not null primary key,
	passwd varchar(16) not null,
	name varchar(10) not null,
	reg_date datetime not null
);

desc member;
desc test;

drop table test;
show tables;

insert into member values('kingdora@dragon.com','1234','김개동',now());
insert into member values('hongkd@dragon.com','1111','홍길동',now());
insert into member values('hongkd@aaa.com','1111','홍길동',now());
select * from member;
select id, passwd from member;

select id, passwd from member where id='hongkd@aaa.com';

update member set passwd='3579' where id='hongkd@aaa.com';

delete from member where id='hongkd@aaa.com';

delete from member;

insert into member(id, passwd, name, reg_date)
values('kingdora@dragon.com','1234','김제동',now());

insert into member(id, passwd, name, reg_date)
values('hongkd@aaa.com','1111','홍길동',now());






