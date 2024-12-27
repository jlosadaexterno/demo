package com.example.demo.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.dto.Portada;

@RestController
@RequestMapping("/api/portada")
public class PortadaController {
    // Generamos las operaciones CRUD

    @PostMapping
    public void create(@RequestBody Portada portada) {
        // TODO Auto-generated method stub
    }

    @GetMapping("/{id}")
    public Portada read(@PathVariable("id") long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @PutMapping
    public void update(@RequestBody Portada portada) {
        // TODO Auto-generated method stub
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        // TODO Auto-generated method stub
    }   

    @GetMapping
    public List<Portada> list() {
        return null;
    }   


}
