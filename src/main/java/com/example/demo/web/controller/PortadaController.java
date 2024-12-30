package com.example.demo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.dto.Portada;
import com.example.demo.business.service.PortadaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/portada")
public class PortadaController {

    @Autowired
    private PortadaService portadaService;

    // Generamos las operaciones CRUD
    @PostMapping
    public void create(@RequestBody Portada portada) {
        portadaService.create(portada);
    }

    @GetMapping("/{id}")
    public Portada read(@PathVariable("id") long id) {
        return portadaService.read(id);
    }

    @PutMapping
    public void update(@Valid @RequestBody Portada portada) {
        portadaService.update(portada);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        portadaService.delete(id);
    }

    @GetMapping
    public List<Portada> list() {
        return portadaService.list();
    }
}
