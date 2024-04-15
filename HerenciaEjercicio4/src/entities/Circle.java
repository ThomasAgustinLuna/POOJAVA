/*
 Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package entities;

import interfaces.calculosFormas;

/**
 *
 * @author Tomas
 */
public class Circle implements calculosFormas{
    
    protected double radius;
    protected double diameter;

    public Circle() {
        this.diameter=radius*2;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = this.radius*2;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public static double getPI() {
        return PI;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", diameter=" + diameter + '}';
    }
    
    @Override
    public double areaCalculator(){
        double area=PI*Math.pow(radius, 2);
        return area ; 
    }
    @Override
    public double perimeterCalculator(){
        double perimeter=PI*diameter;
        return perimeter ;
    }
}
