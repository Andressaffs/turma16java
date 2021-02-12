-- cria um banco de dados
create database db_rh;

-- acessa o banco de dados
use db_rh;

-- cria tabela 
create table tb_funcionarios(
id bigint auto_increment,
nome varchar(255) not null,
idade int not null,
salario float not null,
codigo int not null,
terceirizado boolean not null,
primary key(id)
);

-- busca das informações da tabela funcionario
select * from tb_funcionarios;

select nome, salario from tb_funcionarios where salario > 2000;
select nome, salario from tb_funcionarios where salario <= 2000;

insert into tb_funcionarios (nome, idade, salario, codigo, terceirizado) values ("Raphael", 00, 10000, 001, true);
insert into tb_funcionarios (nome, idade, salario, codigo, terceirizado) values ("Jane", 30, 3000, 012, false);
insert into tb_funcionarios (nome, idade, salario, codigo, terceirizado) values ("José", 36, 2500, 016, true);
insert into tb_funcionarios (nome, idade, salario, codigo, terceirizado) values ("Carla", 26, 1500, 007, true);
insert into tb_funcionarios (nome, idade, salario, codigo, terceirizado) values ("Gabriel", 26, 1000, 023, false);

update tb_funcionarios set salario = 8000 where id = 2;







