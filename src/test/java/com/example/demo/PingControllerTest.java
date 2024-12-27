package com.example.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.web.controller.PingController;

@SpringBootTest
@AutoConfigureMockMvc
public class PingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private PingController controller;

    @Value("${valor}")
    private int valor;


    @Test
    public void testPingEndpoint() throws Exception {
        mockMvc.perform(get("/ping"))
                .andDo(print())                    
                .andExpect(status().isOk())
                .andExpect(content().string("Llegaste"));
    }

    @Test
    public void testController() {
        assertNotNull(controller);
    }

    //  Testeo valor
    @Test
    public void testValor() {
        assertEquals(4, valor);
    }
}