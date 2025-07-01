/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author Usuario
 */
public abstract class Persona {
    protected String nombre;
    protected int id;
    protected String email;
    protected String telefono;
    
    public String getNombre(){
        return nombre;
    }
    public int getID(){
        return id;
    }
    public String getEmail(){
        return email;
    }
    public String getTelefono(){
        return telefono;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }

    public Persona(String nombre, int id, String email, String telefono){
        this.nombre=nombre;
        this.id=id;
        this.email=email;
        this.telefono=telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", id=" + id + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
}
