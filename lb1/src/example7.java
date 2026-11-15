import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        System.out.println("Вас зовут " + name + ", вам " + age + " лет");

        scanner.close();
    }
}