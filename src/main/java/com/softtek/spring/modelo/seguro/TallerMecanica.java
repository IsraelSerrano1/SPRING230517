package com.softtek.spring.modelo.seguro;

import org.springframework.stereotype.Component;

@Component("tm")
public class TallerMecanica implements ITaller{
    public TallerMecanica() {
    }

    @Override
    public String reparar(Coche c) {
        return "Está reparandose en el taller mecánica";
    }
}
