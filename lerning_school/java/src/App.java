import java.util.ArrayList;
import java.util.Scanner;

public class App {
    // helper function
    public static ArrayList<Double> arraySumDiagonal(double[][] arr) {
        double sum = 0.0;
        double sumPhu = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            sumPhu += arr[i][arr.length - i - 1];
        }
        ArrayList<Double> arrSum = new ArrayList<Double>();
        arrSum.add(sum);
        arrSum.add(sumPhu);
        return arrSum;
    }

    public static void main(String[] args) throws Exception {
        try {

            int length;
            System.out.println("Nhap so luong mang 2 chieu");
            Scanner scanner = new Scanner(System.in);
            length = scanner.nextInt();
            double[][] arr = new double[length][length];

            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    System.out.println("Nhap phan tu so [" + i + "," + j + "]");
                    arr[i][j] = scanner.nextDouble();
                }
            }

            System.out.println("Mang 2 chieu");
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    System.out.printf("%10f", arr[i][j]);
                }
                System.out.println();
            }

            double sum = 0.0;
            double sumPhu = 0.0;
            for (int i = 0; i < length; i++) {
                sum += arr[i][i];
                sumPhu += arr[i][length - i - 1];
            }
            System.out.println("Tong chieu dai duong cheo chinh la :" + sum);
            System.out.println("Tong chieu dai duong cheo phu la :" + sumPhu);

            scanner.close();
        } catch (Exception e) {
            System.err.println("Co loi xay ra :" + e);
        }
    }

}
