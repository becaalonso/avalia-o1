package com.example.faculdade.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "descricao")
	private String descricao;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getnome() {
		return nome;

	}
	public void setnome(String nome) {
		this.nome= nome;
	}

	public String getdescricao() {
		return descricao;

	}
	public void setdescricao(String descricao) {
		this.descricao= descricao;
	}

	
}

	
	

