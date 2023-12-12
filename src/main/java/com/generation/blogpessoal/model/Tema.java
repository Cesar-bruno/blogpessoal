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
@Table(name = "tb_tema") // defini o nome da tabela 
public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // configura que vai auto incremento
	private long id ;
	
	@NotBlank(message = " O atributo Descrição é obrigatório.") // defini que o titulo n pode ficar vazia, e msg que vai ser visualizada
	private String descricao;
	
	@UpdateTimestamp
	private LocalDateTime data;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
}
