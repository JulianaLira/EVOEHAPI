drop database if exists evoeh;
create database evoeh;
use evoeh;

create table itemlibrary(
	codigo int auto_increment primary key,
	titulo varchar(100),
	tipo varchar(100),
	dataP varchar(50),
	numeroEdicao varchar(200),
	autor varchar(200),
	editora varchar(200),
	descricao varchar(200)
	
);

desc itemlibrary;





