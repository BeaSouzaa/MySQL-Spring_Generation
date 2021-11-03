package org.generation.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@ Anotações são parametros onde definimos o comportamento que acontece dentro da classe.

@Entity // Uma entidade do JPA que mostra que a classe será mapeada como tabela
@Table(name = "tb_postagem") // A entidade vai virar uma tabela
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Primary key
	private long id;

	@NotNull
	@Size(min = 5, max = 100, message = "O titulo deve ter ao menos 5 caracteres e menos de 100")
	private String titulo;

	@NotNull
	@Size(min = 10, max = 500, message = "O texto deve ter ao menos 10 caracteres e menos de 500")
	private String texto;

	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());

	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;

	public long getId() {
		return id;

	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
		
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

}