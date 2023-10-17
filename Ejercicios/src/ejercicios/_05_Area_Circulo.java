
package ejercicios;
import java.util.Locale;
import java.util.Scanner;

public class _05_Area_Circulo {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un radio: ");
        teclado.useLocale(Locale.US);
        double radio=teclado.nextDouble();
  
        // FORMULA PARA HALLAR EL AREA DEL CIRCULO, USANDO ALGUNAS FUNCIONES DE MATCH
        double area=Math.PI*Math.pow(radio, 2);
  
        System.out.println("El area del circulo es: "+area);
    }
}
