
package ejercicios;

public class _12_Divisible_While {
    public static void main(String[] args) {
        
        int num = 1;
        
        while (num <= 100){
            if (num%2 == 0 || num%3 == 0){
                System.out.println(num);
            }
            
            num++;
        }
    }
}
