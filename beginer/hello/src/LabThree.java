/*
 * 
 * Bài 3: Viết chương trình nhập vào bàn phím cạnh của một khối lập phương.
 * Tính và xuất ra thể tích của hình lập phương.
 * 
 */

import java.util.Scanner;

public class LabThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Nhap canh cua khoi lap phuong");
        int canh = scanner.nextInt();
        System.err.println("the tich khoi lap phuong la: " + Math.pow(canh, 3));
        scanner.close();
    }
}