create database db_escola;

use db_escola;

create table tb_alunos(
id bigint auto_increment,
nome varchar(255) not null,
nota float not null,
materia varchar(255) not null,
ano int not null,
turma int not null,
primary key(id)
);

select * from tb_alunos;

select nome, nota from tb_alunos where nota > 7;
select nome, nota from tb_alunos where nota <= 7;

alter table tb_alunos change nota nota_alunos decimal;


insert into tb_alunos (nome, nota, materia, ano, turma) values ("Ana",10,"Português",9,3);
insert into tb_alunos (nome, nota, materia, ano, turma) values ("Beatriz",7,"Português",9,3);
insert into tb_alunos (nome, nota, materia, ano, turma) values ("Caio",9,"Português",9,3);
insert into tb_alunos (nome, nota, materia, ano, turma) values ("João",5,"Português",9,3);
insert into tb_alunos (nome, nota, materia, ano, turma) values ("André",3,"Português",9,3);
insert into tb_alunos (nome, nota, materia, ano, turma) values ("Giovana",5,"Português",9,3);
insert into tb_alunos (nome, nota, materia, ano, turma) values ("Júlia",8,"Português",9,3);
insert into tb_alunos (nome, nota, materia, ano, turma) values ("Luiza",10,"Português",9,3);


update tb_alunos set nota = 7 where id = 4;

