
package ejercicios;
import java.util.Scanner;

public class _02_Mayor_Que {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = teclado.nextInt();

        teclado.close();

    if (numero1 >= numero2) {
        if (numero1 == numero2) {
            System.out.println("Los numeros son iguales.");
        }
        else {
            System.out.println("El numero " + numero1 + " es mayor que el numero " + numero2 + ".");
        }
    }
    else {
        System.out.println("El numero " + numero2 + " es mayor que el numero " + numero1 + ".");
    }
    }
}
