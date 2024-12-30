package com.example.demo.config;

import com.example.demo.business.dto.Portada;
import com.example.demo.business.repository.PortadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataInitializer {

    @Autowired
    private PortadaRepository portadaRepository;

    @Profile("test")
    @Bean
    public CommandLineRunner loadData() {
        return args -> {
            // Crear registros iniciales
            Portada portada1 = new Portada();
            portada1.setTitulo("Portada 1");
            portada1.setDescripcion("Descripción de la portada 1");
            portadaRepository.save(portada1);

            Portada portada2 = new Portada();
            portada2.setTitulo("Portada 2");
            portada2.setDescripcion("Descripción de la portada 2");
            portadaRepository.save(portada2);

            // Agrega más registros según sea necesario
        };
    }
}