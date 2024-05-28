package com.example.faculdade.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.faculdade.entities.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long>{
	
	@Query(value = "SELECT * FROM Livro l WHERE lower(l.titulo) LIKE %:titulo%", nativeQuery = true )
	List<Autor> buscarPorTitulo(@Param("titulo")String titulo);
	
}