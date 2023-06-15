package Clase_5;

import java.util.Scanner;

public class Ej3_descuento {
    public static void main(String[] args) {
    /*3) Calculadora de descuento:
    Pídele al usuario que ingrese el precio original de un producto.
    Pídele al usuario que ingrese el porcentaje de descuento.
    Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal =
    precioOriginal - (precioOriginal * descuento / 100).
    Muestra el precio final al usuario.
     */
        // Pedir(entrada de info por consola) y almaceno en variables:
        Scanner sc = new Scanner(System.in);
        System.out.println("Intrduce precio original del producto:");
        double precioOriginal = sc.nextDouble();

        System.out.println("Intrduce el % del descuento:");
        int  porcentaje = sc.nextInt();

        //Calcula el descuento:
        double descuento = precioOriginal * (double) porcentaje /100; // CAST: de int a double.

        //Precio final aplicando el descuento:
        double precioFinal = precioOriginal - descuento ;

        // Mostrar por consola:
        System.out.println("Precio total con descuento = " + precioFinal + " €");

    }
}
