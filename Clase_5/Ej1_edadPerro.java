package Clase_5;
import java.util.Scanner;
public class Ej1_edadPerro {
    public static void main (String[] args) {

    /* 1) Calculadora de edad de perros:
    Pídele al usuario que ingrese la edad de su perro.
    Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
     */
        // Pedir (entrada de info por consola):
        Scanner sc = new Scanner(System.in);
        System.out.println("Intrduce la edad de tu perro:");

        // Almaceno lo introducido en un a variable:
        int edad = sc.nextInt();

        // Conversion de edad:
        int edadPerruna = edad * 7;

        // Mostrar por consola:
        System.out.println("La edad equivalente es = " + edadPerruna + " años perrunos");

    }

}

