package com.coffee.springvscode.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffee.springvscode.model.Sobre;

public interface SobreDao extends JpaRepository<Sobre, Integer> {
    
}