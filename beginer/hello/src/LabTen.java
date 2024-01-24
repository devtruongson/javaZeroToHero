/* 
 * Bài 3: Viết chương trình nhập vào 1 mảng số nguyên bất kỳ:
    - Sắp xếp và xuất mảng vừa nhập ra màn hình
    - Xuất phần tử có giá trị nhỏ nhất
    - Xuất phần tử có giá trị lớn nhất
    Gợi ý:
    - Sử dụng Arrays.sort
    - Sử dụng Math.min, Math.max
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

public class LabTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Nhap do dai cua mang");
        int sizeArr = scanner.nextInt();
        int[] arrayInteger = new int[sizeArr];
        for (int i = 0; i < sizeArr; i++) {
            System.err.println("Nhap phan tu thu " + i);
            arrayInteger[i] = scanner.nextInt();
        }

        // Xap xep cach 1 su dung ham co san
        // Arrays.sort(arrayInteger);
        // System.err.println("Mang sau khi xap xep la : " +
        // Arrays.toString(arrayInteger));

        // Xap xep cach 2
        for (int i = 0; i < sizeArr; i++) {
            for (int j = i + 1; j < sizeArr; j++) {
                if (arrayInteger[i] > arrayInteger[j]) {
                    int tam = arrayInteger[i];
                    arrayInteger[i] = arrayInteger[j];
                    arrayInteger[j] = tam;
                }
            }
        }
        System.err.println("Mang sau khi xap xep la : " + Arrays.toString(arrayInteger));

        scanner.close();
    }
}
