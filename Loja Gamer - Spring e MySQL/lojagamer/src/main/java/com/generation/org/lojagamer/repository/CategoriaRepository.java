package com.generation.org.lojagamer.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.org.lojagamer.model.CategoriaModel;



@Repository
public interface CategoriaRepository extends JpaRepository <CategoriaModel, Long> {
	public List <CategoriaModel> findAllByTituloContainingIgnoreCase (String Titulo);
}
