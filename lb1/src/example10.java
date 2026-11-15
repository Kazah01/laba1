import java.util.Scanner;

public class example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год рождения: ");
        int birthYear = scanner.nextInt();

        int currentYear = 2026;
        int age = currentYear - birthYear;

        System.out.println("Ваш возраст: " + age + " лет");

        scanner.close();
    }
}