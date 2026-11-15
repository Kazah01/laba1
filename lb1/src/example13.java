import java.util.Scanner;

public class example13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        double sum = a + b;

        System.out.println("Сумма чисел: " + sum);

        scanner.close();
    }
}