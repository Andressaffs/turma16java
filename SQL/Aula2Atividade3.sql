create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment,
tipo varchar(255) not null,
receitaMedica boolean not null,
generico boolean not null,
primary key(id)
);

select * from tb_categoria;

insert into tb_categoria (tipo, receitaMedica, generico) values ("Antibiótico",true,true);
insert into tb_categoria (tipo, receitaMedica, generico) values ("Antibiótico G.",true,false);
insert into tb_categoria (tipo, receitaMedica, generico) values ("Anti-inflamatório",false,true);
insert into tb_categoria (tipo, receitaMedica, generico) values ("Anti-inflamatório G.",false,false);
insert into tb_categoria (tipo, receitaMedica, generico) values ("Analgésico",false,false);

create table tb_produto(
id bigint(5) auto_increment,
nome varchar(255) not null,
preco float not null,
usoLivre boolean not null,
controlado boolean not null,
desconto boolean not null,
categoria_id bigint,
primary key(id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

select * from tb_produto;

insert into tb_produto (nome, preco, usoLivre, controlado, desconto,categoria_id) values ("Nimesulida",25.99,true,false,true,4);
insert into tb_produto (nome, preco, usoLivre, controlado, desconto,categoria_id) values ("Neosaldina",14.99,true,false,false,5);
insert into tb_produto (nome, preco, usoLivre, controlado, desconto,categoria_id) values ("Diprogenta",29.99,false,true,false,1);
insert into tb_produto (nome, preco, usoLivre, controlado, desconto,categoria_id) values ("Ibuprofeno",14.99,false,false,true,4);
insert into tb_produto (nome, preco, usoLivre, controlado, desconto,categoria_id) values ("Cataflan",10.99,false,false,true,4);
insert into tb_produto (nome, preco, usoLivre, controlado, desconto,categoria_id) values ("Amoxilina",20.99,true,false,false,2);
insert into tb_produto (nome, preco, usoLivre, controlado, desconto,categoria_id) values ("Advil",14.99,true,false,true,3);
insert into tb_produto (nome, preco, usoLivre, controlado, desconto,categoria_id) values ("Dipirona",14.99,true,false,true,3);

update tb_produto set preco = 55.99 where id = 3;

select nome, preco from tb_produto where preco > 50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like "%B%";

select * from tb_produto inner join tb_categoria on 
tb_categoria.id = tb_produto.categoria_id;




