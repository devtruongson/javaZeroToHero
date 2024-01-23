import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name is");
        String fullName = scanner.nextLine();
        System.out.println("Your age is");
        int age = scanner.nextInt();
        System.out.printf("My name is %s and age is %d", fullName, age);
        scanner.close();
    }
}
