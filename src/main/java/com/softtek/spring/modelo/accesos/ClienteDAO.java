package com.softtek.spring.modelo.accesos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClienteDAO {
    @Autowired
    @Qualifier("ad")
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
