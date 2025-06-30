/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajo_sociales;

import Listas.Lista;

/**
 *
 * @author kevin
 */
public class Lista_TS implements Lista <Trabajador_social>{
private static Trabajador_social[] lista;
private int cantidad;

    @Override
    public Trabajador_social buscar(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(Trabajador_social v) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean agregar(Trabajador_social v) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public Trabajador_social[] buscarPorCanton(String canton) {
        int count = 0;
        for (int i = 0; i < cantidad; i++) {
            if (lista[i].getCanton().equalsIgnoreCase(canton)) {
                count++;
            }
        }
    return null;

    }