package com.coffee.springvscode.model;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.util.Base64Utils;
import org.springframework.web.multipart.MultipartFile;

import io.micrometer.core.instrument.util.IOUtils;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Promos {
   
    
    @Id
    @Column(name = "id")
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    
    @Column(name = "img")
    private String img;
    
    @Column(name = "produto")
    private String produto;
    
    @Column(name = "preco")
    private float preco;

    
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getImg() {

        return this.img;
    }

    public void setImg(String img) {
        
        this.img = img;
    }
    
    public String getProduto() {
        return this.produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
