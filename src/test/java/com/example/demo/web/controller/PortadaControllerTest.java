package com.example.demo.web.controller;

import com.example.demo.business.dto.Portada;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class PortadaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCreatePortada() throws Exception {
        Portada portada = new Portada();
        // Set properties of portada

        mockMvc.perform(post("/api/portada")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"property\": \"value\"}")) // Replace with actual JSON
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void testReadPortada() throws Exception {
        mockMvc.perform(get("/api/portada/{id}", 1))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.property").value("value")); // Replace with actual property
    }

    @Test
    public void testUpdatePortada() throws Exception {
        Portada portada = new Portada();
        // Set properties of portada

        mockMvc.perform(put("/api/portada")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"property\": \"value\"}")) // Replace with actual JSON
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void testDeletePortada() throws Exception {
        mockMvc.perform(delete("/api/portada/{id}", 1))
                .andDo(print())
                .andExpect(status().isOk());
    }

    // Falta el test de listar
    @Test
    public void testListPortada() throws Exception {
        mockMvc.perform(get("/api/portada"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.length()").value(2)); // Replace with actual property
    }   
}