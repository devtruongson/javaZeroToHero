/* 
 * Bài 2: Viết bảng cửu chương của 1 số nguyên bất kỳ
    Gợi ý:
    - Dùng vòng lặp từ 1 tới 10
 */

import java.util.Scanner;

public class LabNight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Ban hay nhap so bat ky tu ban phim");
        int a = scanner.nextInt();
        System.err.println("Bang cuu chuong cua so " + a + "la: ");
        for (int i = 1; i <= 10; i++) {
            System.err.println(a + "x" + i + " = " + a * i);
        }
        scanner.close();
    }
}
