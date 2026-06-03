/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.web;

import co.edu.uvpalmira.fpoe.logica.Ilogica;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 *
 * @author Sala Sistemas
 */
@Named(value="docenteCtrl")
@SessionScoped
public class ControladorDocentes implements Serializable{
    @Inject
    private Ilogica ilogica;
    
    
    
    
}
