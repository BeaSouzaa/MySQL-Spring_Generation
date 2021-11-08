/* Atividade 2
||Crie um banco de dados para um e commerce, onde o sistema trabalhará com as informações dos produtos deste ecommerce.
||Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos relevantes dos produtos para se trabalhar com o serviço deste 
ecommerce.
||Popule esta tabela com até 8 dados;
||Faça um select que retorne os produtos com o valor maior do que 500.
||Faça um select que retorne os produtos com o valor menor do que 500.
||Ao término atualize um dado desta tabela através de uma query de atualização.
||salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
||coloque no seu GitHuB pessoal e compartilhe esta atividade. */

drop database db_ecommerce;
create database db_ecommerce;
use  db_ecommerce;

create table tb_produtos (
	id_produtos bigint auto_increment, 
    nome varchar(20) not null, 
    preco_unitario float,
    marca varchar(20) not null,
    quantidade_estoque int,
    primary key (id_produtos)
						 );
                         
    insert into tb_produtos (nome, preco_unitario, marca, quantidade_estoque)
		values ( "Celular", 2000.00, "Xiaomi", 21),
				("Notebook", 4500.00, "Dell", 12), 
                ("Camiseta", 70.00, "Nike", 32),
                ("Caneta", 1.75, "Bic", 17);
		
        select * from tb_produtos; 
        
        select * from tb_produtos where preco_unitario > 500.00;
        select * from tb_produtos where preco_unitario < 500.00;
        
		update tb_produtos set quantidade_estoque = 15 where id_produtos = 4;
		           
        
      
        
        
        
    
     
    
    
    

