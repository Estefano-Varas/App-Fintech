/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fintech;
import com.fintech.model.*;
import com.fintech.service.*;
import java.util.*;
public class AppFintech {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        CategoriaService catSvc = new CategoriaService();
        IngresoService ingSvc = new IngresoService();
        GastoService gstSvc = new GastoService();
        AlertaService altSvc = new AlertaService();
        ReporteService repSvc = new ReporteService();
        FinanzasService finSvc = new FinanzasService(ingSvc, gstSvc, repSvc, altSvc);
        
        catSvc.crear("Alimentación");
        catSvc.crear("Transporte");
        catSvc.crear("Estudios");
        
        
        System.out.println("=== FinTech - Gestion financiera personal ===");
        boolean running = true;
        
        while(running){
        System.out.println("\nMenu:\n1) Registrar ingreso\n2) Registrar gasto\n3) Listar transacciones\n4) Gestionar categorias\n0) Salir");
        System.out.print("Elija opcion: ");
        String opt = sc.nextLine();
        switch(opt) {
            case "1" -> {
                System.out.print("Fecha (dd/MM/yyyy): "); String f1 = sc.nextLine();
                System.out.print("Monto: "); double m1 = Double.parseDouble(sc.nextLine());
                System.out.println("Categorias:"); for (Categoria c: catSvc.listar()) System.out.println(c);
                System.out.print("Id categoria: "); int cid1 = Integer.parseInt(sc.nextLine());
                Categoria c1 = catSvc.buscarPorId(cid1);
                System.out.print("Descripcion: "); Descripcion d1 = new Descripcion(sc.nextLine());
                ingSvc.crear(f1, m1, c1, d1);
                System.out.println("Ingreso registrado.");
                }
            case "2" -> {
                System.out.print("Fecha (dd/MM/yyyy): "); String f2 = sc.nextLine();
                System.out.print("Monto: "); double m2 = Double.parseDouble(sc.nextLine());
                System.out.println("Categorias:"); for (Categoria c: catSvc.listar()) System.out.println(c);
                System.out.print("Id categoria: "); int cid2 = Integer.parseInt(sc.nextLine());
                Categoria c2 = catSvc.buscarPorId(cid2);
                System.out.print("Descripcion: "); Descripcion d2 = new Descripcion(sc.nextLine());
                gstSvc.crear(f2, m2, c2, d2);
                System.out.println("Gasto registrado.");
                }
            
            case "3" -> {
                System.out.println("-- Ingresos --"); 
                for (Ingreso i: ingSvc.listar()) System.out.println(i);
                System.out.println("-- Gastos --");
                for (Gasto g: gstSvc.listar()) System.out.println(g);
                }
                
            case "4" -> {
                System.out.println("Categorias existentes:");
                for (Categoria c: catSvc.listar()) System.out.println(c);
                System.out.println("a) Crear \nb) Eliminar \nc) Volver");
                String sub = sc.nextLine();
                if ("a".equalsIgnoreCase(sub)) { System.out.print("Nombre: "); catSvc.crear(sc.nextLine()); System.out.println("Categoria creada."); }
                else if ("b".equalsIgnoreCase(sub)) { System.out.print("Id a eliminar: "); int idd = Integer.parseInt(sc.nextLine());
                
                if (catSvc.eliminar(idd)) System.out.println("Eliminada."); else System.out.println("No encontrada."); }
                }
                
            case "0" -> { 
            System.out.println("Saliendo de la app");
                      running = false;}
            default -> System.out.println("Opcion invalida");
                }
        
        
        }
        sc.close();
    }
    }

