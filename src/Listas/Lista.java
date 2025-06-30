/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Listas;

/**
 *
 * @author Luisf
 */
public interface Lista <V> {
    public V buscar(Object id);
    
    public boolean eliminar(V v);
    
    public boolean agregar(V v);
}
