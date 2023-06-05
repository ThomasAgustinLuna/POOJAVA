/*
 Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:

Método constructor con todos los atributos pasados por parámetro.

Método constructor sin los atributos pasados por parámetro.

Métodos get y set.

Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.

Método sumar(): calcular la suma de los números y devolver el resultado al main.

Método restar(): calcular la resta de los números y devolver el resultado al main

Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, 
se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package entidades;


public class Operación {
    
    private int num1;
    private int num2;
    private int suma;
    private int resta;
    private int multi;
    private int divi;
    

    public Operación() {
    }

    
    public Operación(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public void setResta(int resta) {
        this.resta = resta;
    }

    public void setMulti(int multi) {
        this.multi = multi;
    }

    public void setDivi(int divi) {
        this.divi = divi;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSuma() {
        return suma;
    }

    public int getResta() {
        return resta;
    }

    public int getMulti() {
        return multi;
    }

    public int getDivi() {
        return divi;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
    
    public int sumar(int num1,int num2){
        suma=num1+num2;
        
        return suma;
    }
    public int restar(int num1,int num2){
        resta=num1-num2;
        
        return resta;
    }
    public int multipli(int num1,int num2){
        if (num1>0 && num2 >0) {
            multi=num1*num2;
        }else{
            multi=0;
        }
        
        return multi;
    }
    public int dividir(int num1,int num2){
        if (num1>0 && num2 >0) {
            divi=num1/num2;
        }else{
            divi=0;
        }
        
        return divi;
    }

    @Override
    public String toString() {
        return "El resultado es: "+ num1 + " + " + num2 + " = " + suma + ", " +num1+" - "+num2+" = "+ resta + ", "+num1+" * "+num2+" = " + multi + ", "+num1+" / "+num2+" = " + divi;
    }
    
    
    
}
