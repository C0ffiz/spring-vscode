package com.coffee.springvscode.controller;

import java.io.IOException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.coffee.springvscode.dao.ClienteDao;
import com.coffee.springvscode.dao.PromosDao;
import com.coffee.springvscode.dao.SobreDao;
import com.coffee.springvscode.model.Clientes;
import com.coffee.springvscode.model.Promos;
import com.coffee.springvscode.model.Sobre;
import com.coffee.springvscode.model.Promos;

@Controller
public class ClientesController {

    @Autowired
    private ClienteDao clienterepositorio;

    @Autowired
    private PromosDao promosrepositorio;

    @Autowired
    private SobreDao sobrerepositorio;

    
    @GetMapping("/inserirClientes")
    public ModelAndView insertClientes(Clientes clientes) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("Clientes/formClientes");
        mv.addObject("clientes", new Clientes());
        return mv;
    }

    @PostMapping("insertClientes")
    public ModelAndView inserirCliente(Clientes cliente) {
        
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/dashboard");
        clienterepositorio.save(cliente);
        return mv;
    }

    @GetMapping("/inserirPromos")
    public ModelAndView insertPromos(Promos promos) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("/dashboard");
        mv.addObject("promos", new Promos());
        return mv;
    }

    @GetMapping("/dashboard")
    public ModelAndView showDashboard(Promos promos) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("Clientes/formDashboard");
        mv.addObject("clientesList", clienterepositorio.findAll());
        mv.addObject("promos", new Promos());
        return mv;
    }

    @PostMapping("insertPromos")
    public ModelAndView inserirPromos(Promos promos) throws IOException {
        
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/dashboard");
        promosrepositorio.save(promos);
        return mv;
    }

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home/index");
        mv.addObject("promodio", promosrepositorio.findAll());
        mv.addObject("sobreodio", sobrerepositorio.findAll());
        return mv;
    }

    @GetMapping("/insertSobre")
    public ModelAndView insertSobre(Sobre sobre) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/dashboard");
        mv.addObject("sobretxt", sobrerepositorio.findAll());
        return mv;
    }

    @PostMapping("inserirSobre")
    public ModelAndView inserirSobre(Sobre sobre) {
        
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/dashboard");
        sobrerepositorio.save(sobre);
        return mv;
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Integer id) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("Clientes/alterar");
        Clientes clientes = clienterepositorio.getReferenceById(id);
        mv.addObject("clientes", clientes);
        return mv;
    }

    @PostMapping("/alterar")
    public ModelAndView alterar(Clientes clientes) {

        ModelAndView mv = new ModelAndView();
        clienterepositorio.save(clientes);
        mv.setViewName("redirect:/dashboard");
        return mv;
    }

    @GetMapping("/excluir/{id}")
    public String excluirCliente(@PathVariable("id") Integer id) {

        clienterepositorio.deleteById(id);
        return "redirect:/dashboard";
    }

}