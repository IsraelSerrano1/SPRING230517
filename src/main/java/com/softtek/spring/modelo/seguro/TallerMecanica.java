package com.softtek.spring.modelo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TallerMecanica implements ITaller{
    @Override
    public String reparar(Coche c) {
        return "Está reparandose en el taller mecánica";
    }
}
