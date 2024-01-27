import java.util.Scanner;
import java.util.ArrayList;

/* 
    1.Nhập danh sách số thực với số lượng tùy ý từ bàn phím. Xuất ra danh sách vừa nhập và
    tính tổng của nó
*/

public class LabFive {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.err.println("Nhap phan tu thu :" + arr.size());
            double number = scanner.nextDouble();
            arr.add(number);
            System.err
                    .println("Ban co muon nhap phan tu tiep theo khong (Y or N)? neu nhap tiep no la phan tu thu "
                            + arr.size());
            scanner.nextLine(); // phím enter
            String option = scanner.nextLine();
            if (option.equals("N") || option.equals("n")) {
                break;
            }
        }
        System.err.println("Mang ban vua nhap la : " + arr.toString());
        double tong = 0;
        for (int i = 0; i < arr.size(); i++) {
            tong += arr.get(i);
        }
        System.err.println("Tong cac phan tu trong mang la : " + tong);
        scanner.close();
    }
}
