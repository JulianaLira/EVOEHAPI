drop database if exists evoeh;
create database evoeh;
use evoeh;

create table itemlibrary(
	codigo int auto_increment primary key,
	titulo varchar(100),
	autor varchar(50),
	assunto varchar(200)
);

desc itemlibrary;





