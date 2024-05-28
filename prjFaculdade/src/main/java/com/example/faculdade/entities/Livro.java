package com.example.faculdade.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	@Column(name = "ano")
	private String ano;
	
	@Column(name = "titulo")
	private String titulo;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getano() {
		return ano;

	}
	public void setano(String ano) {
		this.ano= ano;
	}

	public String getTitulo() {
		return titulo;

	}
	public void settitulo(String titulo) {
		this.titulo= titulo;
	}

	
}
