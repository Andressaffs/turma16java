create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
massa varchar(255) not null,
recheio boolean,
tamanho varchar(255) not null,
primary key(id)
);

select * from tb_categoria;

insert into tb_categoria (massa, recheio, tamanho) values ("Fina",false,"Grande");
insert into tb_categoria (massa, recheio, tamanho) values ("Grossa",true,"Grande");
insert into tb_categoria (massa, recheio, tamanho) values ("Grossa",false, "Pequena");
insert into tb_categoria (massa, recheio, tamanho) values ("Crocante",false,"Grande");
insert into tb_categoria (massa, recheio, tamanho) values ("Crocante",true,"Pequena");

create table tb_pizza(
id bigint(5) auto_increment,
nome varchar(255) not null,
vegetariana boolean not null,
gluten boolean not null,
lowCarb boolean not null,
azeitona boolean not null,
preco float not null,
categoria_id bigint,
primary key(id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

select * from tb_pizza;

insert into tb_pizza (nome, vegetariana, gluten, lowCarb, azeitona, categoria_id, preco) values ("Do Chefe", true, true,true,false,1,49);
insert into tb_pizza (nome, vegetariana, gluten, lowCarb, azeitona, categoria_id, preco) values ("Napolitana",true,false,true,true,2,35);
insert into tb_pizza (nome, vegetariana, gluten, lowCarb, azeitona, categoria_id, preco) values ("Marguerita",false,false,true,false,4,59);
insert into tb_pizza (nome, vegetariana, gluten, lowCarb, azeitona, categoria_id, preco) values ("4Queijos", false, false,false,false,3,70);
insert into tb_pizza (nome, vegetariana, gluten, lowCarb, azeitona, categoria_id, preco) values ("Frango", false, false,false,true,4,59);
insert into tb_pizza (nome, vegetariana, gluten, lowCarb, azeitona, categoria_id, preco) values ("Calabresa", false, true,true,true,2,55);
insert into tb_pizza (nome, vegetariana, gluten, lowCarb, azeitona, categoria_id, preco) values ("Brócolis", true, true,false,false,1,35);
insert into tb_pizza (nome, vegetariana, gluten, lowCarb, azeitona, categoria_id, preco) values ("Brasileira", false, true,true,false,5,50);

select nome, preco from tb_pizza where preco > 45;
select * from tb_pizza where preco between 29 and 60;
select * from tb_pizza where nome like "%C%";

select * from tb_pizza inner join tb_categoria on 
tb_categoria.id = tb_pizza.categoria_id;

-- somente pizzas com recheio
select nome, tb_categoria.recheio from tb_pizza inner join tb_categoria on
tb_categoria.id = tb_pizza.categoria_id where recheio = true;

-- somente pizzas sem recheio 
select nome, tb_categoria.recheio from tb_pizza inner join tb_categoria on
tb_categoria.id = tb_pizza.categoria_id where recheio = false;

