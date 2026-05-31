create database SerasaGames;

Create table jogo (
	id int auto_increment primary key,
    titulo varchar(100) not null,
    genero varchar(50) not null,
    plataforma varchar(50) not null,
    ano_lancamento int not null,
    nota_avaliacao decimal(3,1)
);

USE SerasaGames;
