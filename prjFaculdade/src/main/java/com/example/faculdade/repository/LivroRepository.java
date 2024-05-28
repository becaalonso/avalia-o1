package com.example.faculdade.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.faculdade.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

	@Query("SELECT l FROM Livro l WHERE l.autor = ?1")
	List<LivroRepository> findByAutor(String autor);

	@Query(value = "SELECT * FROM Livro l WHERE lower(l.titulo) LIKE %:titulo%", nativeQuery = true )
	List<Livro> buscarPorTitulo(@Param("titulo")String titulo);
	
}