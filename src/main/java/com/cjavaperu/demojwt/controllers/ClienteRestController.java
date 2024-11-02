package com.cjavaperu.demojwt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjavaperu.demojwt.models.service.IClienteService;
import com.cjavaperu.demojwt.views.ClienteList;


//@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api/clientes")
public class ClienteRestController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping(value = "/listar")
    public ClienteList listar() {
        return new ClienteList(clienteService.findAll());
    }
}
