create database db_ecommerce1;

use db_ecommerce1;

create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
quantidade int not null,
preco float not null,
cor varchar (255) not null,
marca varchar(255) not null,
acompanhaBrinde boolean not null,
primary key(id)
);

select * from tb_produtos;

select nome, preco from tb_produtos where preco > 500;
select nome, preco from tb_produtos where preco <= 500;

insert into tb_produtos (nome, quantidade, preco, cor, marca, acompanhaBrinde) values ("Casaco", 40, 649.90, "Cinza","Puma", true);
insert into tb_produtos (nome, quantidade, preco, cor, marca, acompanhaBrinde) values ("Jaqueta", 100, 249.90, "Jeans","Primark", true);
insert into tb_produtos (nome, quantidade, preco, cor, marca, acompanhaBrinde) values ("Vestido", 20, 5000, "Preto","Chanel", false);
insert into tb_produtos (nome, quantidade, preco, cor, marca, acompanhaBrinde) values ("Saia", 10, 10000, "Verde","Chanel", false);
insert into tb_produtos (nome, quantidade, preco, cor, marca, acompanhaBrinde) values ("Calça", 100, 100, "Verde","Forever21", true);
insert into tb_produtos (nome, quantidade, preco, cor, marca, acompanhaBrinde) values ("Camiseta", 200, 89.90, "Branca","Forever21", true);
insert into tb_produtos (nome, quantidade, preco, cor, marca, acompanhaBrinde) values ("Macacão", 30, 89.90, "Branca","Forever21", true);
insert into tb_produtos (nome, quantidade, preco, cor, marca, acompanhaBrinde) values ("Suéter", 100, 249.90, "Marrom","Adidas", false);

update tb_produtos set preco = 500 where id = 7;



