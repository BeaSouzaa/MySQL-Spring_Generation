package org.generation.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



//Anotações são parametros onde definimos o comportamento que acontece dentro da classe.


@Entity  								//Uma entidade do JPA que mostra que a classe será mapeada como tabela	
@Table (name = "postagem")				//A entidade vai virar uma tabela 
public class Postagem {
		
	    @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)	//Primary key	
		
		private long id;
		
		
		//Não consigo colocar o NotNull e nem o Size
	
		
		private String titulo;
				
		
		private String texto;
		
				
		@Temporal(TemporalType.TIMESTAMP)
		
		private Date date = new java.sql.Date(System.currentTimeMillis());
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
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		
		
		
}
