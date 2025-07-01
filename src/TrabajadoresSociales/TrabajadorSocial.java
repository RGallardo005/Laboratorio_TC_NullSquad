/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajadoresSociales;
import Personas.Persona;
/**
 *
 * @author ccore
 */
public class TrabajadorSocial extends Persona {
    
    private String canton;
    
    public TrabajadorSocial(String nombre, int id, String email, String telefono, String canton){
        super(nombre, id, email, telefono);
        this.canton = canton; 
    }

    
    public String getCanton(){
        return canton; 
    }
   
    public void setCanton(String canton) {
        this.canton = canton;
    }

    
    @Override
    public String toString() {
        return "TrabajadorSocial{" + "canton=" + canton + '}';
    }
    
    
}



