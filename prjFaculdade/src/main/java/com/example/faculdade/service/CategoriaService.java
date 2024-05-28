package com.example.faculdade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.faculdade.entities.Categoria;
import com.example.faculdade.entities.Livro;
import com.example.faculdade.repository.CategoriaRepository;

@Service
public class CategoriaService {

	private final CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }
    
    public Categoria saveCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Categoria getCategoriaById(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    public List<Categoria> getAllCategoria() {
        return categoriaRepository.findAll();
    }
    
    
    public List<Livro> buscarPorNome(String nome){
    	return categoriaRepository.findByNome(nome);
    
}
    
    public List<Livro> buscarPorAutor(String autor){
    	return categoriaRepository.findByAutor(autor);
    	
    }
	
}
