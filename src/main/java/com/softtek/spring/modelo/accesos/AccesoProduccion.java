package com.softtek.spring.modelo.accesos;

import org.springframework.stereotype.Component;

@Component("ap")
public class AccesoProduccion implements IDAO{
    public AccesoProduccion() {
    }

    @Override
    public String insertar(Cliente c1) {
        return "Acceso a producción";
    }
}
