/* 
 * Bài 2: Cho phương trình: ax^2 + bx + c = 0
    Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương trình trên
    Gợi ý:
    - Nếu a = 0 => làm tương tự ví dụ bài 1
    - Nếu a # 0:
    - Tính delta = b^2 - 4ac.
    - Nếu delta < 0 => thông báo "phương trình vô nghiệm"
    - Nếu delta = 0 => thông báo "nghiệm kép x = -b/(2*a)
    - Nếu delta > 0 => thông báo có 2 nghiệm riêng biệt
    x1 = (-b + căn(delta))/(2*a)
    x2 = (-b - căn(delta))/(2*a)
 */

import java.util.Scanner;

public class LabSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Chuong trinh giai bai tap ax^2 + bx + c = 0");
        System.err.println("Moi ban nhap so a: ");
        int a = scanner.nextInt();
        System.err.println("Moi ban nhap so b: ");
        int b = scanner.nextInt();
        System.err.println("Moi ban nhap so c: ");
        int c = scanner.nextInt();
        if (a == 0) {
            System.err.println("Phuong trinh ban cho vo nghiem vi a = 0");
        } else {
            float delta = (float) (Math.pow(b, 2) - 4 * a * c);
            if (delta < 0) {
                System.err.println("Phuong trinh ban da cho vo nghiem vi delta <0");
            } else if (delta == 0) {
                System.err.println("Phuong trinh ban da cho co nghiem kep x = " + (-b / (2 * a)));
            } else {
                System.err.println("Phuong trinh co 2 nghiem x1 = " + (-b + Math.sqrt(delta) / 2 * a));
                System.err.println("Phuong trinh co 2 nghiem x2 = " + (-b - Math.sqrt(delta) / 2 * a));
            }
        }

        scanner.close();
    }
}
