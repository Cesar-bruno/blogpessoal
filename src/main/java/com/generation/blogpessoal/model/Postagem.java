package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity // defini que vai ser uma tabela
@Table(name = "tb_postagem") // defini o nome da tabela 

public class Postagem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // configura que vai auto incremento
	private long id ;
	@Column(length=100)
	@NotBlank(message = " O atributo Titulo é obrigatório.") // defini que o titulo n pode ficar vazia, e msg que vai ser visualizada
	@Size(min = 5, max = 100, message = "O atributo Titulo precisa ter entre 5 e 100 caracteres.") // defini o tamanho do titulo
	private String titulo;
	@Column(length=1000)
	@NotBlank(message = " O atributo Texto é obrigatório.") // defini que o titulo n pode ficar vazia, e msg que vai ser visualizada
	@Size(min = 10, max = 1000, message = "O atributo texto precisa ter entre 10 e 1000 caracteres.") // defini o tamanho do titulo
	private String texto;
		
	@UpdateTimestamp
	private LocalDateTime data;
	
	
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
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
}
