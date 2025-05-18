/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_empleados;

import java.util.List;
/**
 *
 * @author user
 */
public class Nomina {
    public static void procesar_nomina(List<Empleados> empleados) {
        double total = 0;
        for (Empleados e : empleados) {
            double salario = e.calcular_salario();
            System.out.println(e.getNombre() + ": $" + salario);
            total += salario;
        }
        System.out.println("Total a pagar: $" + total);
    }
}
