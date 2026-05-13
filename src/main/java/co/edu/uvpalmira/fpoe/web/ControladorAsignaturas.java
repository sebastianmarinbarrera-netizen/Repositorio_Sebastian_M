/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.web;

import co.edu.uvpalmira.fpoe.modelo.Asignatura;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;



/**
 *
 * @author Sala Sistemas
 */
@Named(value = "asignaturaCtrl")
@SessionScoped
public class ControladorAsignaturas implements Serializable{
    private Asignatura asignatura;

    public Asignatura getAsignatura() {
        return this.asignatura;
    }
    
    public void guardar() {

        System.out.println("Intensidad: " + asignatura.getIntensidad());
        System.out.println("Nombre: " + asignatura.getNombre());

        // Aquí guardarías en BD
        // ejemplo:
        // sensorDAO.guardar(new Sensor(nombre, intensidad));
    }

    
    
}
