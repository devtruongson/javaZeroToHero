import java.util.Scanner;

/* 

    Bài 2: Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật.
    Tính toán và in ra console:
    - chu vi hình chữ nhật
    - diện tích hình chữ nhật
    - cạnh nhỏ nhất của hình chữ nhật

 * 
 */

public class LabTwo {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.err.println("Ban hay nhap chieu dai");
        double dai = scaner.nextFloat();
        System.err.println("Ban hay nhap chieu rong");
        double rong = scaner.nextFloat();
        System.err.println("Chu vi hinh chu nhat la:" + (dai + rong) / 2);
        System.err.println("Dien tich hinh chu nhat la:" + dai * rong);
        System.err.println("Canh nho nhat trong 2 canh la : " + Math.min(dai, rong));

        scaner.close();
    }
}
