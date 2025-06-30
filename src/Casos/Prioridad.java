/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Casos;

/**
 *
 * @author Luisf
 */
public enum Prioridad {
   ALTA("Alta"),
   MEDIA("Media"),
   BAJA("Baja");
   
   private String prioridad;   
   
   private Prioridad(String prioridad){
       this.prioridad = prioridad;
    }
    public String getPrioridad() {
        return prioridad;
    }
    @Override
    public String toString() {
        return "Prioridad{" + "ordinal=" + ordinal() + ", name=" + name() + ", prioridad=" + prioridad + '}';
    }
}
