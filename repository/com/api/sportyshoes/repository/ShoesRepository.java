package com.api.sportyshoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.api.sportyshoes.model.Shoes;

@Repository
public interface ShoesRepository extends JpaRepository<Shoes, Integer>{
	
}