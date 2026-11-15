import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine();

        System.out.print("Введите количество дней в этом месяце: ");
        int days = scanner.nextInt();

        System.out.println("Месяц " + month + " содержит " + days + " дней");

        scanner.close();
    }
}