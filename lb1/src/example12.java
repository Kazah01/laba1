import java.util.Scanner;

public class example12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        int currentYear = 2026;
        int birthYear = currentYear - age;

        System.out.println("Ваш год рождения: " + birthYear);

        scanner.close();
    }
}