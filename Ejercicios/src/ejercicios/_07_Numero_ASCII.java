
package ejercicios;
import javax.swing.JOptionPane;

public class _07_Numero_ASCII {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Introduce un codigo de la tabla ASCII: ");
        
        // PASAMOS EL STRING A INT
        int codigo=Integer.parseInt(texto);
 
        // PASAMOS EL CODIGO A CARACTER
        char caracter = (char)codigo;
 
        System.out.println(caracter);        
    }
}
