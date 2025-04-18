import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите число для таблицы умножения: ");
        int number = scanner.nextInt();
        
        System.out.println("Таблица умножения для числа " + number + ":");
        
        // Выводим таблицу умножения от 1 до 10
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %2d = %2d\n", number, i, number * i);
        }

        scanner.close();
    }
}