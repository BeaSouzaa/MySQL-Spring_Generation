package com.generation.org.lojagamer.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



	
	
@Entity									 //anotação para "chamar" tabelas
@Table (name = "tb_categorias")			 //anotação usada para definir o nome da tabela 
public class CategoriaModel {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id; 

	@NotBlank(message = "O campo nome é obrigatório!")
	@Size(min = 5, max = 50, message = "A quantidade mínima de caracteres são 5 e no máximo 50" )
	private String nome_cat;
	
	@NotBlank(message = "O campo descrição  é obrigatório")
	@Size(min = 5, max = 50, message = "A quantidade mínima de caracteres são 5 e no máximo 50 ")
	private String descricao_cat;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<ProdutoModel> produto;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome_cat() {
		return nome_cat;
	}

	public void setNome_cat(String nome_cat) {
		this.nome_cat = nome_cat;
	}

	public String getDescricao_cat() {
		return descricao_cat;
	}

	public void setDescricao_cat(String descricao_cat) {
		this.descricao_cat = descricao_cat;
	}

	public List<ProdutoModel> getProduto() {
		return produto;
	}

	public void setProduto(List<ProdutoModel> produto) {
		this.produto = produto;
	}
	
	
}

