package com.example.demo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {
    private String estoNo = "Mensaje de prueba otro";
    @GetMapping
    public String get() {
        return "Llegaste";
    }

}
