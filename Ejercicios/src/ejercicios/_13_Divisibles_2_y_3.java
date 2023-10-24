
package ejercicios;

public class _13_Divisibles_2_y_3 {
    public static void main(String[] args) {
        int num = 1;
        
        // BUCLE HASTA 100
        while (num <= 100) {
            if (num % 2 == 0 || num %  3 == 0) {
                System.out.println(num);
            }
            
            // SE INCREMENTA NUM
            num++;
        }
    }
}
