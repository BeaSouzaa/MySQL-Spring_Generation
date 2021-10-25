create database db_generation_game_oline;

	create table tb_classe (
    id_classe bigint (5) auto_increment, 
    gênero varchar(10) not null unique, 
    ano float, 
       primary key (id_classe)
    ); 
    
    insert into tb_classe(gênero, ano, plataforma) 
    values ("Ação", "2021"), 
		   ("Esporte", "2018"),
           ("RPG", "2015");
           
select * from tb_classe; 


    
    create table tb_personagem (
    id_personagem bigint(5) auto_increment,
    nome varchar (18) not null,
    raridade varchar (12) not null, 
    estilo varchar(8) not null, 
    poder_principal varchar(15) not null,
    xp_tirado int not null, 
    primary key (id_personagens), 
    
insert into ( nome , raridade, estilo, poder_principal, xp_tirado)
	values ( 
    
        
select * from tb_personagem;



    
    
    
    
    
    
    