
import java.util.Scanner;

public class example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        int first = n - 1;
        int second = n;
        int third = n + 1;

        int fourth = (int) Math.pow(first + second + third, 2);

        System.out.println(first + " " + second + " " + third + " " + fourth);

        scanner.close();
    }
}