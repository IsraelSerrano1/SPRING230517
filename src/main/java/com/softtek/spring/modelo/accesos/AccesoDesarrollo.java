package com.softtek.spring.modelo.accesos;

import org.springframework.stereotype.Component;

@Component("ad")
public class AccesoDesarrollo implements IDAO{
    public AccesoDesarrollo() {
    }

    @Override
    public String insertar(Cliente c1) {
        return "Acceso a desarrollo";
    }
}
