/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fintech.service;
import java.util.*;
import com.fintech.model.*;

public class IngresoService {
    private List<Ingreso> ingresos = new ArrayList<>();
    private int nextId = 1;

    public Ingreso crear(String fecha, double monto, Categoria categoria, Descripcion descripcion) {
        Ingreso i = new Ingreso(nextId++, fecha, monto, categoria, descripcion);
        ingresos.add(i);
        return i;
    }

    public List<Ingreso> listar() {
        return new ArrayList<>(ingresos);
    }

    public double totalIngresos() {
        double total = 0;
        for (Ingreso i : ingresos) total += i.getMonto();
        return total;
    }
}


