/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_empleados;

/**
 *
 * @author user
 */
public abstract class Empleados {
    protected String nombre;
    protected double salario_base;

    public Empleados(String nombre, double salario_base) {
        this.nombre = nombre;
        this.salario_base = salario_base;
    }

    public abstract double calcular_salario();

    public String getNombre() {
        return nombre;
    }
}
