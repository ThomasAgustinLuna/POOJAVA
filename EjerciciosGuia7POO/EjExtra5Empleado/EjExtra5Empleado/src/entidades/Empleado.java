/*
 Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual. 
El aumento salarial debe ser del 10% si el empleado tiene más de 30 años 
o del 5% si tiene menos de 30 años.

 */
package entidades;

import java.util.Date;


public class Empleado {
    
    private String nombre;
    private int edad;
    private double salario;
    private double aumento;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public double getAumento() {
        return aumento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }
    
    
    public double calcular_aumento(double salario,int edad){
        
        if (edad<30) {
            aumento=salario*0.05;
        }else{
            aumento=salario*0.10;
        }
        
        return aumento;
    }

    @Override
    public String toString() {
        return "El empleado "+nombre+" de "+edad+" años, recibe un aumento de: "+aumento+" su salario final es de: "+(salario+aumento);
    }
    
    
}
