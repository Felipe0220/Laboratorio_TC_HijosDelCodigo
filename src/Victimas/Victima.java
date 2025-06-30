/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Victimas;

/**
 *
 * @author Sebastian
 */
public class Victima {
    
    private String direccion;
    private String fechaNaci;
    private String genero;

    public String getDireccion() {
        return direccion;
    }

    public String getFechaNaci() {
        return fechaNaci;
    }

    public String getGenero() {
        return genero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public int calcuEdad(){
       if (UtilDate.isNotFutureDate(fechaNaci))
            this.fechaNaci = fechaNaci;
        return UtilDate.calcuEdad(fechaNaci);
    }

    public Victima(String direccion, String fechaNaci, String genero) {
        this.direccion = direccion;
        this.fechaNaci = fechaNaci;
        this.genero = genero;
    }
    
    
}
