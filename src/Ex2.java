import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        scanner.close();
        
        int fibo1 = 0;
        int fibo2 = 1;
        
        while (fibo2 < num) {
            int fibo3 = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibo3;
        }
        
        if (fibo2 == num) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }
}
