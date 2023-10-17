
package ejercicios;
import javax.swing.JOptionPane;

public class _09_Precio_Producto {
    public static void main(String[] args) {
    // DECLARAMOS LA CONSTANTE
    final double IVA = 0.21;
    String texto = JOptionPane.showInputDialog("Introduce el precio de un producto: ");
    // PASAMOS EL STRING A DOUBLE
    double precio = Double.parseDouble(texto);  
    
    // FORMULA PARA OBTENER EL PRECIO FINAL MAS EL IVA
    double precioFinal=precio+(precio*IVA);
    
    System.out.println("Precio final con IVA: " + precioFinal);
    }
}
