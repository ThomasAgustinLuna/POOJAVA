/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1.servicios;

import ej1.entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class CuentaBancariaServicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuenta() {

        System.out.println("Ingresar numero de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingresar dni del usuario");
        long dniCliente = leer.nextLong();
        System.out.println("Ingresar saldo actual");
        double saldoActual = leer.nextDouble();

        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public void ingresar(CuentaBancaria cuenta) {

        System.out.println("ingrese el dinero que desea depositar");
        double ingreso = leer.nextDouble();
        cuenta.setSaldoActual(ingreso + cuenta.getSaldoActual());
        System.out.println("Su saldo actual es de $"+cuenta.getSaldoActual());

    }

    public void retirar(CuentaBancaria cuenta) {

        System.out.println("ingrese el dinero que desea retirar");
        double retiro = leer.nextDouble();
        if (retiro > cuenta.getSaldoActual()) {
            System.out.println("saldo insuficiente, se retirara $" + cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);

        } else {
            System.out.println("se retiró $" + retiro);
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            System.out.println("Su saldo actual es de $"+cuenta.getSaldoActual());

        }

    }

    // Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
    //Validar que el usuario no saque más del 20%.
    public void extraccionRapida(CuentaBancaria cuenta) {
        System.out.println("Se retirara el 20% del total de su cuenta, $" + cuenta.getSaldoActual() * 0.20);

        cuenta.setSaldoActual(cuenta.getSaldoActual() * 0.8);
        System.out.println("Su saldo actual es de $"+cuenta.getSaldoActual());
    }

    // Método consultarSaldo: permitirá consultar el saldo disponible en la
//cuenta.
    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("su saldo actual es de $" + cuenta.getSaldoActual());

    }

// Método consultarDatos: permitirá mostrar todos los datos de la
//cuenta.
    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("El numero de cuenta es " + cuenta.getNumeroCuenta());
        System.out.println("El dni del cliente es " + cuenta.getDniCliente());
       

    }

}
