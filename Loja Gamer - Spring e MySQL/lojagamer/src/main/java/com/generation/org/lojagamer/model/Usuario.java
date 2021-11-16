package com.generation.org.lojagamer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuariosLojaGamer")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Ops! O campo nome não pode ficar vazio e nem conter espaço")
	@Size(min = 3, max = 50, message = " O número mínimo de caracteres no campo nome é 3 e o máximo 50")
	private String nome;

	@NotBlank(message = "Ops! O campo usuário não pode ficar vazio e nem conter espaço")
	@Size(min = 2, max = 50, message = " O número mínimo de caracteres no campo usuário é 2 e o máximo 50")
	private String usuario;

	@NotBlank(message = "Ops! O campo senha não pode ficar vazio e nem conter espaço")
	@Size(min = 6, max = 8, message = " O número mínimo de caracteres no campo senha é 6 e o máximo 8")
	private String senha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
