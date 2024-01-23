import java.util.Scanner;

public class MathJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Please enter first number");
        int a = scanner.nextInt();
        System.err.println("Please enter last number");
        int b = scanner.nextInt();

        int c = Math.max(a, b);
        System.err.println(c);
        scanner.close();
    }
}
