package com.example.demo.business.dto;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Domicilio {
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE)
    private long id;
    
    @ManyToOne
    private Portada portada;

    private String ciudad;
    private String calle;
    private String numero;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Portada getPortada() {
        return portada;
    }
    public void setPortada(Portada portada) {
        this.portada = portada;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
}
