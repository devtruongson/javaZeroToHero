
/* 
 * Bài 3: Viết chương trình tính số tiền điện (in kết quả ra console)
    Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
    - Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
    - Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500

    Gợi ý:
    - Nếu số điện <= 100 => số tiền = số điện x 1000
    - Nếu số điện > 100
    => số tiền = 100 * 1000 + (số điện - 100) * 1500

 */
import java.util.Scanner;

public class LabSevent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Tinh tien dien cua gia dinh ban: ");
        System.err.println("Vui long nhap so dien cua gia dinh ban: ");
        int soDien = scanner.nextInt();
        if (soDien <= 100) {
            System.err.println("Tien dien cua ban la 1000d 1 so tuong duong voi : " + soDien * 1000);
        } else {
            System.err.println("Tien dien cua ban la 1000d voi 100 so va co " + (soDien - 100)
                    + "So gia 1500d so tien ban phai tra la : " + (100 * 1000 + (soDien - 100) * 1500));
        }

        scanner.close();
    }
}
