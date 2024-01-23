import java.util.Scanner;

/* 
 * 
 * Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím.
    In ra màn hình với định dạng:
    <tên_sinh_viên> có điểm = <điểm>
 * 
 */

public class LabOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter your name");
        String name = scanner.nextLine();
        System.err.println("Enter your point one");
        int a = scanner.nextInt();
        System.err.println("Enter your point two");
        int b = scanner.nextInt();
        System.err.printf("Diem TB cua ban %s la %.2f ", name, (double) (a + b) / 2);

        scanner.close();
    }
}
