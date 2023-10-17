
package ejercicios;
import java.util.Scanner;

public class _08_Caracter_ASCII {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un caracter ASCII: ");
        char caracter = teclado.next().charAt(0);
 
        // PASAMOS EL CARACTER A CODIGO 
        int codigo = (int) caracter;
        
        System.out.println(codigo);        
    }
} 
