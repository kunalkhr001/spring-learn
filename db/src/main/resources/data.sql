create table person
(
	id integer not null,
	name varchar(255) not null,
	birth_date timestamp,
	primary key(id)
);

CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 1 INCREMENT BY 1;

insert into person(id, name, birth_date) values (1001, 'kk', sysdate());
insert into person(id, name, birth_date) values (1002, 'kk2', sysdate());
insert into person(id, name, birth_date) values (1003, 'kk3', sysdate());