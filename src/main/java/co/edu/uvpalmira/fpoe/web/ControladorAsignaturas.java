/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.web;

import co.edu.uvpalmira.fpoe.logica.Ilogica;
import co.edu.uvpalmira.fpoe.modelo.Asignatura;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;



/**
 *
 * @author Sala Sistemas
 */
@Named(value = "asignaturaCtrl")
@SessionScoped
public class ControladorAsignaturas implements Serializable{
    
    @Inject
    private Ilogica ilogica;
    
    private Asignatura asignatura;
    
    public ControladorAsignaturas() {
        this.asignatura = new Asignatura();
    }

    public Asignatura getAsignatura() {
        return this.asignatura;
    }
    
    
    public void guardar() {
        try{
        this.ilogica.crearAsignatura(this.asignatura);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Proceso terminado"));
        this.asignatura = new Asignatura();
        }catch (Exception ex){
            
        }    
        // Aquí guardarías en BD
        // ejemplo:
        // sensorDAO.guardar(new Sensor(nombre, intensidad));
    }
    
    public void cancelar(){
        this.asignatura = new Asignatura();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Proceso terminado"));
    }
    
    public List<Asignatura> getAsignaturas(){
        System.out.println("Asignatura = " + asignatura);
        return this.ilogica.buscarAsignaturas();
        
    }

    
    
}
