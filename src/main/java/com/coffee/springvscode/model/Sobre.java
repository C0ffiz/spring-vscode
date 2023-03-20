package com.coffee.springvscode.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sobre {
    
    @Id
    @Column(name = "id")
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id = 1;
    
    @Column(name = "sobretxt")
    private String sobretxt;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSobretxt() {
        return this.sobretxt;
    }

    public void setSobretxt(String sobretxt) {
        this.sobretxt = sobretxt;
    }

    
}
