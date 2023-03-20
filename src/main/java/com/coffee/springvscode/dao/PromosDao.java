package com.coffee.springvscode.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffee.springvscode.model.Promos;

public interface PromosDao extends JpaRepository<Promos, Integer> {
    
}