/* Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as
informações dos estudantes deste registro dessa escola.
|| Crie uma tabela estudantes e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos estudantes para se trabalhar com o serviço dessa escola.
|| Popule esta tabela com até 8 dados;
|| Faça um select que retorne o/as estudantes com a nota maior do que 7.
|| Faça um select que retorne o/as estudantes com a nota menor do que 7.
|| Ao término atualize um dado desta tabela através de uma query de atualização.
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade. */

drop database db_escola;
create database db_escola;
use db_escola;

create table tb_estudante (
id_matricula bigint auto_increment,
nome varchar(30) not null,
ra int(6),
turma int (2),
periodo varchar (12) not null, 
nota real, 
primary key(id_matricula) );

insert into tb_estudante (nome, ra, turma, periodo, nota)
	 values("Josefina", 432155, 17, "noturno", 9.8),
		   ("Pedro", 231425, 17, "noturno", 8.7),
           ("Maria", 098765, 17, "noturno", 9.7),
           ("Marcelo", 203212, 17, "noturno", 6.3),
           ("Camila", 234526, 17, "noturno", 10.0);

select * from tb_estudante;

select * from tb_estudante where nota > 7.0;
select * from tb_estudante where nota < 7.0;

update tb_estudante set nota = 7.3 where id_matricula = 4;








