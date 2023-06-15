package Clase_5;

import java.util.Scanner;

public class Ej5_ramdom {
    public static void main(String[] args) {
    /* 5)Juego de adivinar el número:
    Genera un número aleatorio entre 1 y 100.
    Pídele al usuario que adivine el número.
     */
        // Generando un numero aleatorio:
        int numAleatotio =(int) (Math.random()*100+1); //CAST: de double a int (se pierde la información).

        System.out.println(numAleatotio);

        // Pedir(entrada de info por consola) y almaceno en variables:
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduce un numero , para adivinar el numero");
        int numero= sc.nextInt();

        // Comprovar lo introducido si es = numero aleatorio.
        if (numero == numAleatotio){
            System.out.println("el numero introducido es igual al numero aleatorio");
        } else {
            System.out.println("el numero introducido es incorrecto");
        }



    }
}
