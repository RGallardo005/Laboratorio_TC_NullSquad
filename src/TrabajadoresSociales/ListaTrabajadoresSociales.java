/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajadoresSociales;

/**
 *
 * @author Usuario
 */
public class ListaTrabajadoresSociales {
    private static final int maxtrabajadores=100;
    private static TrabajadorSocial[] trabajadores=new TrabajadorSocial[maxtrabajadores];
    private static int contar=0;
    
    public static boolean agregarTrabajador(TrabajadorSocial trabajador){
        if(contar<maxtrabajadores){
            trabajadores[contar++]=trabajador;
            return true;
        }
        return false;
    }
    
    public static TrabajadorSocial[] buscarporcanton(String canton){
        int cant=0;
        for(int i=0;i<contar;i++){
            if(trabajadores[i].getCanton().equalsIgnoreCase(canton)){
                cant++;
            }
        }
        TrabajadorSocial[] res=new TrabajadorSocial[cant];
        int j=0;
        for(int i=0;i<contar;i++){
            if(trabajadores[i].getCanton().equalsIgnoreCase(canton)){
                res[j++]=trabajadores[i];
            }
        }
        return res;
    }
    public static void mostrar(){
        for(int i=0;i<contar;i++){
            System.out.println(trabajadores[i]);
        }
    }
}
