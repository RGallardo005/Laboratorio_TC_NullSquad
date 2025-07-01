/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Víctimas;

/**
 *
 * @author galla
 */
public enum VictimaGenero {
    MASCULINO ("MASCULINO"),
    FEMENINO  ("FEMENINO");

private final String genero;

    private VictimaGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "V\u00edctimaGenero{" + "genero=" + genero + '}';
    }


    
}
