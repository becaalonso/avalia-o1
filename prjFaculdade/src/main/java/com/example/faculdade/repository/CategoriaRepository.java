package com.example.faculdade.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.faculdade.entities.Categoria;
import com.example.faculdade.entities.Livro;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	@Query("SELECT l FROM Livro l WHERE l.nome = ?1")
	List<Livro> findByNome(String nome);
	
	@Query("SELECT l FROM Livro l WHERE l.autor = ?1")
	List<Livro> findByAutor(String autor);
	
	
}
