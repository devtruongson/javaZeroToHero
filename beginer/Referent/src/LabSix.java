/* 
 * Ví dụ 1: Nhập username và password từ bàn phím. Nếu username = "TruongSonSoftwareEngineer" và
    password > 6 ký tự thì hợp lệ
    gợi ý: sử dụng equals để so sánh; length để check chiều dài
    Ví dụ 2: Ứng dụng quản lý sinh viên
    - Tạo class Student với thuộc tính name, id
    - Tại hàm main, tạo 5 students với tên khác nhau (sử dụng constructor)
    eg: new Student("Nam", 1); new Student("Eric", 2);
    -tạo một biến boolean nếu họ nhập đúng thì mới cho nhập sinh viên và tìm kiếm
 */

import java.util.ArrayList;
import java.util.Scanner;

public class LabSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Nhap username cua ban : ");
        String username = scanner.nextLine();
        System.err.println("Nhap password cua ban : ");
        String password = scanner.nextLine();
        boolean isValid = false;

        if (username.trim().equals("TruongSonSoftwareEngineer") && password.length() >= 6) {
            System.err.println("Tai khoan cua ban da hop le");
            isValid = true;
        } else {
            System.err.println("Tai khoan khong hop le");
        }

        // nếu không nhập đúng ta dừng lại.
        if (!isValid)
            return;
        // bai 2
        ArrayList<StudentLab> stds = new ArrayList<StudentLab>();
        while (true) {
            System.out.println("Nhap hoc sinh thu " + stds.size());
            System.out.println("Hay nhap ten hoc sinh: ");
            String name = scanner.nextLine();
            System.out.println("Hay nhap ID hoc sinh: ");
            int idSt = scanner.nextInt();
            stds.add(new StudentLab(name.trim(), idSt));
            System.out.println("Ban co muon them hoc sinh khong? (Y/N)");
            scanner.nextLine();
            String option = scanner.nextLine();
            if (option.equals("n") || option.equals("N")) {
                break;
            }
        }

        // In ra các học sinh có tên bắt đầu bằng nguyễn
        System.out.println("Hoc sinh co ten bat dau voi nguyen la:");
        for (int i = 0; i < stds.size(); i++) {
            StudentLab student = stds.get(i);
            if (student.getName().toLowerCase().startsWith("nguyen")) {
                System.out.println("Ten hoc sinh la : " + student.getName());
                System.out.println("ID hoc sinh la: " + student.getId());
            }
        }
        scanner.close();
    }
}
