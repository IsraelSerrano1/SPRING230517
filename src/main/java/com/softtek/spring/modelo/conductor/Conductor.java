package com.softtek.modelo.Ejercicio2;

public class Conductor {
    private IVehiculo vehiculo;

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
