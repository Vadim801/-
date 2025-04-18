import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите три целых числа:");
        
        System.out.print("Первое чиcло: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Второе число: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Третье число: ");
        int num3 = scanner.nextInt();
        
        double average = (num1 + num2 + num3) / 3.0;
        
        System.out.println("Итог средне-арифметический: " + average);
        
        scanner.close();
    }
}
