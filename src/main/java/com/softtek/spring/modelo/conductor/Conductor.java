package com.softtek.spring.modelo.conductor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Conductor {
    @Autowired
    private IVehiculo vehiculo;

    public Conductor() {
    }

    public Conductor(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public IVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public String conducir(){
        return vehiculo.moverse();
    }
}
