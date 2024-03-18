import java.util.ArrayList;
import java.util.Scanner;

public class OnTap {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);

        int lengthArr;
        System.out.println("Ban Hay Nhap Do Dai Mang");
        lengthArr = scanner.nextInt();
        for (int i = 0; i < lengthArr; i++) {
            System.out.println("Ban Dang Nhap Phan Tu Thu " + i);
            arr.add(scanner.nextDouble());

        }
        Double sum = 0.0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        System.out.println("Mang ban vua nhap la : " + arr.toString());
        System.out.println("Tong cac phan tu trong arr la : " + sum);
        String result = "Name";

        scanner.close();

    }
}
