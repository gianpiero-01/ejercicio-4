/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import gestion_empleados.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        List<Empleados> empleados = new ArrayList<>();

        empleados.add(new Gerente("Laura", 5000));
        empleados.add(new Desarrollador("Carlos", 4000));
        empleados.add(new Diseñador("Ana", 3500));

        Nomina.procesar_nomina(empleados);
    }
}
/*
 _________________________________________________
|        DIAGRAMA DE MEMORIA – STACK              |
|-------------------------------------------------|
| empleados (List<Empleado>)                      |
| → lista[0] → #G (Gerente)                        |
| → lista[1] → #D (Desarrollador)                  |
| → lista[2] → #DI (Diseñador)                     |
|_________________________________________________|

 _________________________________________________
|               DIAGRAMA DE MEMORIA – HEAP        |
|-------------------------------------------------|
| #G  → Gerente                                   |
|      nombre = "Laura"                           |
|      salario_base = 5000                         |
|      calcular_salario() → +2000                  |
|                                                 |
| #D  → Desarrollador                             |
|      nombre = "Carlos"                          |
|      salario_base = 4000                         |
|      calcular_salario() → *1.2                   |
|                                                 |
| #DI → Diseñador                                 |
|      nombre = "Ana"                             |
|      salario_base = 3500                         |
|      calcular_salario() → +1000                  |
|_________________________________________________|
*/
