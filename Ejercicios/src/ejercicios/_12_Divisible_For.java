
package ejercicios;


public class _12_Divisible_For {
    public static void main(String[] args) {

        for (int num = 1; num <= 100; num++){
            if (num%2==0 || num%3==0){
                System.out.println(num);
            }
        }
    }
}
