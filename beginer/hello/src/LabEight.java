/*
 * Bài 1: Viết chương trình nhập vào 1 số nguyên từ bàn phím. Hiển thị kết quả
 * số đấy là số
 * nguyên tố hay không ?
 * Gợi ý:
 * - Số nguyên tố là số chỉ chia hết cho 1 và chính nó (tối đa 2 ước)
 * - Dùng vòng lặp (2, Số nguyên -1). Nếu số nguyên chia hết cho i => ko là số
 * nguyên tố
 * - Sử dụng toán tử % để biết có chia hết hay không ?
 */

import java.util.Scanner;

/**
 * LabEight
 */
public class LabEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Nhap so nguyen tu ban phim");
        int a = scanner.nextInt();
        while (a <= 1) {
            System.err.println("Nhap so nguyen tu ban phim");
            a = scanner.nextInt();
        }
        int uoc = 1;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                uoc += 1;
            }
        }

        if (uoc == 2) {
            System.err.println("a la so nguyen to " + a);
        } else {
            System.err.println("a khong phai la so nguyen to " + a);
        }
        scanner.close();
    }

}