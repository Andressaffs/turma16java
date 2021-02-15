create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
id bigint auto_increment,
povos varchar(255) not null,
cidade varchar(255) not null,
lingua varchar(255) not null,
primary key(id)
);

select * from tb_classe;

insert into tb_classe (povos, cidade, lingua) values ("Elfo","Valfenda","Sindarin");
insert into tb_classe (povos, cidade, lingua) values ("Hobbit","Condado","Novalingua");
insert into tb_classe (povos, cidade, lingua) values ("Mago","Alfea", "Novalingua");
insert into tb_classe (povos, cidade, lingua) values ("Humano","Manaus","Português Antigo");
insert into tb_classe (povos, cidade, lingua) values ("Orc","Trolburgo","Português Antigo");


create table tb_personagem(
id bigint(5) auto_increment,
nome varchar(255) not null,
forca int not null,
inteligencia int not null,
ataque int not null,
defesa int not null,
classe_id bigint,
primary key(id),
FOREIGN KEY (classe_id) REFERENCES tb_classe (id)
);

insert into tb_personagem (nome, forca, inteligencia, ataque, defesa, classe_id) values ("Orgonom",6000, 700,6000,4000,5);
insert into tb_personagem (nome, forca, inteligencia, ataque, defesa, classe_id) values ("Olaf", 900, 4000,1100,950,2);
insert into tb_personagem (nome, forca, inteligencia, ataque, defesa, classe_id) values ("Manjko", 5000, 6000, 5000, 6600,1);
insert into tb_personagem (nome, forca, inteligencia, ataque, defesa, classe_id) values ("Draco",3000, 4800, 2000,3000,3);
insert into tb_personagem (nome, forca, inteligencia, ataque, defesa, classe_id) values ("Babooshka",6000, 5000,6000,4000,1);
insert into tb_personagem (nome, forca, inteligencia, ataque, defesa, classe_id) values ("Rick", 1000, 2500, 1000, 1000,4);
insert into tb_personagem (nome, forca, inteligencia, ataque, defesa, classe_id) values ("Kaisa",1200, 900,2500,2500,2);
insert into tb_personagem (nome, forca, inteligencia, ataque, defesa, classe_id) values ("Crida",4000, 2500, 5000, 4000,5);

select * from tb_personagem;

select nome, ataque from tb_personagem where ataque > 2000;
select * from tb_personagem where ataque between 1000 and 2000;
select * from tb_personagem where nome like "%C%";

select * from tb_personagem inner join tb_classe on 
tb_classe.id = tb_personagem.classe_id;
