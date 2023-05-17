package com.softtek.spring.modelo.seguro;

import org.springframework.stereotype.Component;

@Component("tp")
public class TallerPintura implements ITaller{
    public TallerPintura() {
    }

    @Override
    public String reparar(Coche c) {
        return "Esta reparandose en el taller de pintura";
    }
}
