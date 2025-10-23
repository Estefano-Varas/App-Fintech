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
        FinanzasService finSvc = new FinanzasService(ingSvc, gstSvc);
        
        System.out.println("=== FinTech - Gestión financiera personal ===");
        System.out.println("\nMenú:\n1) Registrar ingreso\n2) Registrar gasto\n3) Listar transacciones\n4) Gestionar categorías\n0) Salir");
        System.out.print("Elija opción: ");
        String opt = sc.nextLine();
        switch (opt) {
            case "1":
                System.out.print("Fecha (dd/MM/yyyy): "); String f1 = sc.nextLine();
                
            case "2":
                
            
            case "3":
        }
    }
}
