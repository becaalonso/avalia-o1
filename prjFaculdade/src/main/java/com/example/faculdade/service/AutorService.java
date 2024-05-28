package com.example.faculdade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.faculdade.entities.Autor;
import com.example.faculdade.entities.Categoria;
import com.example.faculdade.entities.Livro;
import com.example.faculdade.repository.AutorRepository;
import com.example.faculdade.repository.CategoriaRepository;

@Service
public class AutorService {
	
	   private AutorRepository autorRepository;

	public AutorService(AutorRepository autorRepository) {
	        this.autorRepository = autorRepository;
	    
	}
	    
	public Autor saveAutor(Autor autor) {
	    return autorRepository.save(autor);
	}

	    public Autor getAutorById(Long id) {
	        return (Autor) autorRepository.findById(id).orElse(null);
	    }

	    public List<Autor> getAllAutor() {
	        return autorRepository.findAll();
	    }
	    
	    public List<Autor> buscarPorTitulo (String titulo){
	    	return autorRepository.buscarPorTitulo(titulo);
	    }
	
	    public List<Autor> buscarPorNome(String nome){
	    	return autorRepository.buscarPorTitulo(nome);
	    
	}
	    
}

