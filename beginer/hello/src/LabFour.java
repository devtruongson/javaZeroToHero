/* 
    Bài tập: Viết chương trình tính thuế
    Viết chương trình cho phép nhập vào số tiền thuế (đơn vị là triệu đồng), và in ra kết quả:
        - dưới 10M: không đóng thuế
        - từ 10M tới 15M: thuế 10%
        - từ 15 tới 30M : thuế 20%
        - trên 30M: thuế 50%
        Ví dụ: nhập vào 25M -> in ra kết quả "thuế 20%"
 * 
 */

import java.util.Scanner;

public class LabFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Nhap tien thue cua cong ty");
        float tienthue = scanner.nextFloat();

        if (tienthue < 10) {
            System.err.println("Khong can dong thue : " + tienthue);
        } else if (tienthue <= 15) {
            System.err.println("Tien thue cua ban la 10% " + tienthue * 0.1);
        } else if (tienthue <= 30) {
            System.err.println("Tien thue cua ban la 20% " + tienthue * 0.2);
        } else {
            System.err.println("Tien thue cua ban la 30% " + tienthue * 0.3);
        }

        scanner.close();
    }
}