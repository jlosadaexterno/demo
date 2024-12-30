package com.example.demo.business.service;

import com.example.demo.business.dto.Portada;
import com.example.demo.business.repository.PortadaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional()
public class PortadaService {

    @Autowired
    private PortadaRepository portadaRepository;

    public void create(Portada portada) {
        portadaRepository.save(portada);
    }

    //@Transactional(readOnly = true)
    public Portada read(long id) {
        Portada portada = portadaRepository.findById(id).orElse(null);


        return portada;
    }

    public void update(Portada portada) {
        if (portadaRepository.existsById(portada.getId())) {
            portadaRepository.save(portada);
        }
    }

    public void delete(long id) {
        portadaRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<Portada> list() {
        return portadaRepository.findAll();
    }
}
