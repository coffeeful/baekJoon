import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // A > 0 && A < 10 && B < 10 && B > 0;
        double num1 = scanner.nextInt();
        double num2 = scanner.nextInt();

        System.out.println(num1/num2);
    }
}
