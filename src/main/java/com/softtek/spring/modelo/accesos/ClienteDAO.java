package com.softtek.modelo.Ejercicio4;

public class ClienteDAO {
    private IDAO conexion;

    public ClienteDAO(IDAO conexion) {
        this.conexion = conexion;
    }

    public ClienteDAO() {
    }

    public IDAO getConexion() {
        return conexion;
    }

    public void setConexion(IDAO conexion) {
        this.conexion = conexion;
    }

    public String insertar(Cliente c1){

       return this.conexion.insertar(c1);
    }
}
