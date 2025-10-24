/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fintech.service;
import java.util.ArrayList;
import java.util.List;

public class DescripcionService {
    private List<String> descripciones;

    public DescripcionService() {
        descripciones = new ArrayList<>();
    }

    
    public void agregarDescripcion(String descripcion) {
        if (descripcion != null && !descripcion.trim().isEmpty()) {
            descripciones.add(descripcion);
            System.out.println("Descripción agregada: " + descripcion);
        } else {
            System.out.println("Descripción inválida. No se agregó.");
        }
    }

    
    public void listarDescripciones() {
        if (descripciones.isEmpty()) {
            System.out.println("No hay descripciones registradas.");
        } else {
            System.out.println("=== LISTA DE DESCRIPCIONES ===");
            for (String d : descripciones) {
                System.out.println("- " + d);
            }
        }
    }

   
    public boolean existeDescripcion(String descripcion) {
        return descripciones.contains(descripcion);
    }

    
    public List<String> getDescripciones() {
        return descripciones;
    }
}
