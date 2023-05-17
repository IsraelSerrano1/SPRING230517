package com.softtek.spring;

import com.softtek.spring.modelo.accesos.Cliente;
import com.softtek.spring.modelo.accesos.ClienteDAO;
import com.softtek.spring.modelo.conductor.CocheV;
import com.softtek.spring.modelo.conductor.Conductor;
import com.softtek.spring.modelo.seguro.Coche;
import com.softtek.spring.modelo.seguro.SeguroCoche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Spring1Application implements CommandLineRunner {
    @Autowired
    private SeguroCoche s1;
    @Autowired
    private Conductor con1;
    @Autowired
    private ClienteDAO cli1;
    public static void main(String[] args) {
        SpringApplication.run(Spring1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ejercicioDAO();
        ejercicioConductor();
        ejercicioSeguro();


    }

    private void ejercicioDAO() {
        System.out.println("\n********Prueba Ejercicio DAO******");
        Cliente c1 = new Cliente("Israel","32141324143Y");
        System.out.println("El cliente " + c1.getNombre() + " tiene " + cli1.insertar(c1));
    }

    private void ejercicioConductor() {
        System.out.println("\n********Prueba Ejercicio Conductor******");
        ((CocheV)con1.getVehiculo()).setDeposito(20);
        System.out.println(" El coche " + con1.conducir());
    }

    private void ejercicioSeguro() {
        System.out.println("\n*********Prueba Ejercicio Seguro******");
        Coche c1 = new Coche("1234565HDP", "Scenic");
        System.out.println("El coche modelo " + c1.getModelo() +
                " con matricula: " + c1.getMatricula() + " " + s1.reparar(c1));
    }
}
