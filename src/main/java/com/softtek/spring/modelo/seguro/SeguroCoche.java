package com.softtek.spring.modelo.seguro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SeguroCoche {
    @Autowired
    @Qualifier("tp")
    private ITaller taller;
    private String aseguradora;

    public SeguroCoche(ITaller taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }
    public SeguroCoche() {
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
