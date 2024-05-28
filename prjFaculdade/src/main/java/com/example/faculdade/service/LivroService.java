package com.example.faculdade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.faculdade.entities.Livro;
import com.example.faculdade.repository.LivroRepository;

@Service
public class LivroService {

	private final LivroRepository livroRepository;
	
	@Autowired
	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
		
	}
	
    public Livro saveLivro(Livro livro) {
        return livroRepository.save(livro);    }
	
    public Livro getLivroById(Long id) {
        return (Livro) livroRepository.findById(id).orElse(null);
    }

    public List<Livro> getAllLivro() {
        return livroRepository.findAll();
    }
    
    public List<Livro> buscarPorTitulo (String titulo){
    	return livroRepository.buscarPorTitulo(titulo);
    }
    
    public List<LivroRepository> buscarPorAutor(String autor){
    	return livroRepository.findByAutor(autor);
    	
    }
    
}
