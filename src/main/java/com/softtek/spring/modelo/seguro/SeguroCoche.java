package com.softtek.spring.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeguroCoche {
    @Autowired
    private ITaller taller;
    private String aseguradora;

    public SeguroCoche(ITaller taller) {
        this.taller = taller;
    }
    public ITaller getTaller() {
        return taller;
    }
    public void setTaller(ITaller taller) {
        this.taller = taller;
    }
    public String getAseguradora() {
        return aseguradora;
    }
    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

    public String reparar(Coche c) {
        return taller.reparar(c);
    }
}
