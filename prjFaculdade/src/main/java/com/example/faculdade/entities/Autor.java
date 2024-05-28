package com.example.faculdade.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "autor")
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "país")
	private String país;
	
	
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

	public String getpaís() {
		return país;

	}
	public void setpaís(String país) {
		this.país= país;
	}

	
}


