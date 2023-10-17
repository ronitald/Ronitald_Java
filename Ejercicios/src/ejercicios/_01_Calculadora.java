
package ejercicios;

import java.util.Scanner;

public class _01_Calculadora {
    public static void main(String[] args) {
        // DEFINIMOS LAS VARIABLES
        int numero1 = 0;
        int numero2 = 0;
        int suma = 0;
        int resta = 0;
        int multiplicacion = 0;
        int division = 0;

        // LEER LA ENTRADA DEL USUARIO
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        numero1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = teclado.nextInt();

        teclado.close();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        division = numero1 / numero2;
        multiplicacion = numero1 * numero2;
        
        System.out.println("La suma de los dos números es: " + suma);
        System.out.println("La resta de los dos números es: " + resta);
        System.out.println("La division de los dos números es: " + division);
        System.out.println("La multiplicacion de los dos números es: " + multiplicacion);
    }
}