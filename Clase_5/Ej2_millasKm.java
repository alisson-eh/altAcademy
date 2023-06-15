package Clase_5;

import java.util.Scanner;

public class Ej2_millasKm {
    public static void main (String[] args) {
    /* 2) Conversor de millas a kilómetros:
    Pídele al usuario que ingrese una distancia en millas.
    Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
    Muestra la distancia en kilómetros al usuario.
     */
        // Pedir(entrada de info por consola):
        Scanner sc = new Scanner(System.in);
        System.out.println("Intrduce una cantidad en millas:");

        // Almaceno lo introducido en un a variable:
        double millas = sc.nextInt();

        // Conversion a kilometros:
        double km = millas * 1.60934;

        // Mostrar por consola:
        System.out.println(millas +" millas = " + km + " km");

    }
}
