/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_empleados;

/**
 *
 * @author user
 */
public class Diseñador extends Empleados {
    public Diseñador(String nombre, double salario_base) {
        super(nombre, salario_base);
    }

    @Override
    public double calcular_salario() {
        return salario_base + 1000; 
    }
}