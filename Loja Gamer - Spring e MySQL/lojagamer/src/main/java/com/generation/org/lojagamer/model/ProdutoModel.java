package com.generation.org.lojagamer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class ProdutoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "O campo nome é obrigatório!")
	@Size(min = 3, max = 40, message = "A quantidade mínima de caracteres são 5 e no máximo 40")
	private String nome_produto;

	@NotBlank(message = "O campo descrição é obrigatório")
	@Size(min = 10, max = 60, message = "A quantidade mínima de caracteres são 10 e no máximo 60")
	private String descricao_produto;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private CategoriaModel categoria;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public String getDescricao_produto() {
		return descricao_produto;
	}

	public void setDescricao_produto(String descricao_produto) {
		this.descricao_produto = descricao_produto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public CategoriaModel getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}

}
