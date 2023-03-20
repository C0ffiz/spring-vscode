package com.coffee.springvscode.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffee.springvscode.model.Clientes;

public interface ClienteDao extends JpaRepository<Clientes, Integer> {
    
}
