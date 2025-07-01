/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Víctimas;

/**
 *
 * @author galla
 */
public class ListVictima implements InterfazVictima<Victima>{
    
    private Victima ListVictima[];

  
    public void addvictima(Victima t) {
    
    }

   
    public void remotevictima(Victima t) {
      
    }

    
    public void showvictimas(Victima t) {
    
    }

    
    public Victima find(Object id) {
        for (int i = 0; i < 100; i++) {
            if(ListVictima[i].getID() == id){
                return ListVictima[i];
            }
        }
        return null;
    }

    public Victima[] getListVictima() {
        return ListVictima;
    }

    public ListVictima(Victima[] ListVictima) {
        this.ListVictima = new Victima[100];
    }

    public void setListVictima(Victima[] ListVictima) {
        this.ListVictima = ListVictima;
    }
    
    
    
    
    
    
    
}
