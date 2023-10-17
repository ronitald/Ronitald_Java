
package ejercicios;
import java.util.Scanner;

public class _04_Saludo_Personalizado {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Bienvenido " + nombre);
    }
}
