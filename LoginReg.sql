select * from user_register;
create database registration_form;
use registration_form;
create table user_register(Id int Auto_Increment,primary key(id),Name varchar(20) NOT NULL,
Email varchar(30) NOT NULL,userName varchar(30) NOT NULL,password varchar(20) NOT NULL, 
Unique key(userName));
select * from user_register;

