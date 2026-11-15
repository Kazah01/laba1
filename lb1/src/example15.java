import java.util.Scanner;

public class example15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        double sum = a + b;
        double difference = a - b;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);

        scanner.close();
    }
}