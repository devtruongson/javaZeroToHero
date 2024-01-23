/* 
    Bài 1: Cho phương trình ax + b = 0
    Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương trình trên
 * 
 */

import java.util.Scanner;

public class LabFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Giai Phuong Trinh ax+b");
        System.err.println("Ban Hay Nhap So a: ");
        int a = scanner.nextInt();
        System.err.println("Ban Hay Nhap So b: ");
        int b = scanner.nextInt();

        if (a == 0 && b == 0 || a == 0 && b != 0) {
            System.err.println("Phuong trinh cua ban vo nghiem");
        } else {
            System.err.println("Nghiem cua phuong trinh la: " + (float) (-b / a));
        }
        scanner.close();
    }
}
