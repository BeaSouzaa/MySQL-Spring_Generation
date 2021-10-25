/*Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema
trabalhará com as informações dos funcionaries desta empresa.
Crie uma tabela de funcionaries e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionaries para se trabalhar com o serviço deste RH.
Popule esta tabela com até 5 dados;
Faça um select que retorne os funcionaries com o salário maior do que 2000.
Faça um select que retorne os funcionaries com o salário menor do que 2000.
Ao término atualize um dado desta tabela através de uma query de atualização.
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.*/



create table tb_funcionaries(
id_funcionarie bigint auto_increment,
nome varchar (100) not null,
email varchar(50) not null, 
cargo varchar(20) not null,
salário float(12),
primary key(id_funcionarie)
							 );
insert into tb_funcionaries (nome, email, cargo, salário) values ("Júlia" , "emaildajulia@gmail.com", "Gerente de RH", 3200.00);
insert into tb_funcionaries (nome, email, cargo, salário) values ("Mahalla", "emaildamahalla@gmail.com", "Diretora", 4500.00);
insert into tb_funcionaries (nome, email, cargo, salário) values ("Camila", "emaildacamila@gmail.com", "Auxiliar de RH", 2000.00);
insert into tb_funcionaries (nome, email, cargo, salário) values ("Boen", "emaildaboen@gmail,com", "Tester", 1710.00);
insert into tb_funcionaries (nome, email, cargo, salário) values ("Cláudia", "emaildaclaudia@gmail.com", "Estagiária", 1000.00);

select * from tb_funcionaries where salário > 2000.00;
select * from tb_funcionaries where salário < 2000.00;

update tb_funcionaries set salário = 3000.00 where id_funcionarie = 3; 
select * from tb_funcionaries;





                             
                             
                                          
                                  
        