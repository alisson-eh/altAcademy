package Clase_5;

import java.util.Scanner;

public class Ej4_propina {
    public static void main(String[] args) {
    /* 4) Calculadora de propinas:
    Pídele al usuario que ingrese el total de la cuenta en un restaurante.
    Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
    Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
    - monoto = dinero.
     */

        // Pedir(entrada de info por consola) y almaceno en variables:
        Scanner sc = new Scanner(System.in);
        System.out.println("Intrduce el total de la cuenta:");
        double precioCuenta= sc.nextDouble();

        System.out.println("Intrduce el % de propina que desea dejar:");
        double porcentaje = sc.nextInt();

        //Calcula la cantidad de propina:
        double propina = precioCuenta * (porcentaje/100);


        // Mostrar por consola:
        System.out.println("La propina es de = " + propina +" €");
    }
}
