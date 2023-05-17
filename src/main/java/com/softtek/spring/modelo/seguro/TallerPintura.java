package com.softtek.spring.modelo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TallerPintura implements ITaller{
    @Override
    public String reparar(Coche c) {
        return "Esta reparandose en el taller de pintura";
    }
}
