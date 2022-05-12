create database registration_form;
use registration_form;
create table users(Id int Auto_Increment,primary key(id),Name varchar(20) NOT NULL,
Email varchar(30) NOT NULL,userName varchar(30) NOT NULL,password varchar(20) NOT NULL, 
Unique key(userName));
create table user_credentials(userName varchar(30),password varchar(20) NOT NULL,Id int Auto_Increment,primary key(id),
userId int,
 foreign key(userId) references users(Id));
