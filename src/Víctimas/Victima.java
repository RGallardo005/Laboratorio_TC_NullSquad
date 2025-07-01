/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Víctimas;

import Personas.Persona;
import java.time.LocalDate;

/**
 *
 * @author galla
 */
public class Victima extends Persona{
    private LocalDate fechaNacimiento;
    private VictimaGenero genero;
    private String dierccion;

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public VictimaGenero getGenero() {
        return genero;
    }


    public void setDierccion(String dierccion) {
        this.dierccion = dierccion;
    }
    
    public int CAlcularEdad(LocalDate fechaNacimiento){
        return fechaNacimiento.getYear();
    }

    public Victima(LocalDate fechaNacimiento, VictimaGenero genero, String dierccion, String nombre, int id, String email, String telefono) {
        super(nombre, id, email, telefono);
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.dierccion = dierccion;
    }

    @Override
    public String toString() {
        return "Victima{" + "fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + '}';
    }

 
    
    
    
    
    
    
    
    
}
