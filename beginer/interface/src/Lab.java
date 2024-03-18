import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n :");
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double) (1 / Math.pow(i, 2));
        }
        System.err.println(sum);
        scanner.close();
    }
}
