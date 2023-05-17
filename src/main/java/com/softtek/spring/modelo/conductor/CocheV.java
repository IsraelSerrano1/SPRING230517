package com.softtek.spring.modelo.conductor;

import org.springframework.stereotype.Component;

@Component
public class CocheV implements IVehiculo {

    private int deposito;

    public CocheV(int deposito) {
        this.deposito = deposito;
    }

    public CocheV() {
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    @Override
    public String moverse() {
        if (this.deposito > 0) {
            return "Moviendose";
        }else
            return "No se puede moverse";
    }

}
