
package com.fintech.service;
import com.fintech.model.*;
import java.util.*;

public class GastoService {
   private List<Gasto> gastos = new ArrayList<>();
   private int nextId = 1;
   
   public Gasto crear(String fecha, double monto, Categoria categoria, Descripcion descripcion){
       Gasto g = new Gasto(nextId++, fecha, monto, categoria, descripcion);
       gastos.add(g);
       return g;
   }
   public List<Gasto> listar() { return new ArrayList<>(gastos);}
   
   public double totalGastos() { double s=0; for (Gasto g: gastos) s += g.getMonto(); return s; }
}