import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день недели: ");
        String day = scanner.nextLine();

        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine();

        System.out.print("Введите дату (номер дня в месяце): ");
        int date = scanner.nextInt();

        System.out.println("Сегодня " + day + ", " + date + "-е число месяца " + month);

        scanner.close();
    }
}