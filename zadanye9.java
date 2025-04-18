import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        
        String binary = Integer.toBinaryString(number);
        System.out.println("Двоичное представление: " + binary);
        
        scanner.close();
    }
}