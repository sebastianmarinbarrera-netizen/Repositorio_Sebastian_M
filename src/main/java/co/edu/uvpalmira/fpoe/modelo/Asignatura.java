/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 *
 * @author Sala Sistemas
 */
@Entity
public class Asignatura {
    @Id
    private String codigo;
    private String nombre;
    private byte creditos;
    private byte intensidad;

    public Asignatura(String codigo, String nombre, byte creditos, byte intensidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.intensidad = intensidad;
    }

    
    //METODOS GET
    public String getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public byte getCreditos() {
        return this.creditos;
    }

    public byte getIntensidad() {
        return this.intensidad;
    }

    //METODOS SET
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreditos(byte creditos) {
        this.creditos = creditos;
    }

    public void setIntensidad(byte intensidad) {
        this.intensidad = intensidad;
    }
    
    
    
    
}
