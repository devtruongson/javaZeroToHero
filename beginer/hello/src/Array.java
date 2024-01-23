import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] a = { 1, 3, 2, 6, 4, 5, 10, 12 };
        Arrays.sort(a);
        System.out.printf(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tam = a[i];
                    a[i] = a[j];
                    a[j] = tam;
                }
            }
        }
        System.err.println("Mang sau khi sap xep : " + Arrays.toString(a));
    }
}
