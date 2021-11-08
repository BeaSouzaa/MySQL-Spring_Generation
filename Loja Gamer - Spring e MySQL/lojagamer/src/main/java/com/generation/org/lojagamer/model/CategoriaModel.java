package com.generation.org.lojagamer.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
public class CategoriaModel {

	
	
	
	
@Entity
@Table (name = "tb_categorias")
public class categoria {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id; 
	
	@NotBlank(message = "O campo nome é obrigatório!")
	@Size(min = 5, max = 30, message = "A quantidade mínima de caracteres são 5 e no máximo 30" )
	private String nome_cat;
	
	
	
	
}
}
