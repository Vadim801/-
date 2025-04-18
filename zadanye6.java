import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите целое число для вычисления факториала числа: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Факториал отрицательного числа не определен.");
        } else {
            long factorial = calculateFactorial(number);
            System.out.println("Факториал числа " + number + " равен: " + factorial);
        }
        
        scanner.close();
    }
    
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}