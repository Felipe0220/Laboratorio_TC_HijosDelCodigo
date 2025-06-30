/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casos;

/**
 *
 * @author UTN
 */
public class Caso {
    private int id;
    private Victima id;
    private String Description;
    private String tipo;
    private Prioridad prioridad;

    public int getId() {
        return id;
    }

    public Victima getId() {
        return id;
    }

    public String getDescription() {
        return Description;
    }

    public String getTipo() {
        return tipo;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public Caso(int id, Victima id, String Description, String tipo, Prioridad prioridad) {
        this.id = id;
        this.id = id;
        this.Description = Description;
        this.tipo = tipo;
        this.prioridad = prioridad;
    }
    
    
}
