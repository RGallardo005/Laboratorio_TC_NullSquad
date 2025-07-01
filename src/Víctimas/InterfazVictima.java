/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Víctimas;

/**
 *
 * @author galla
 */
public interface InterfazVictima <T> {
    public void addvictima(T t);
    public void remotevictima(T t);
    public void showvictimas(T t);
    public T find(Object id);
}
