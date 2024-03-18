import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Product> arr = new ArrayList<Product>();
        int k = 0, n;
        Scanner scanner = new Scanner(System.in);

        do {
            Menu();
            System.out.print("Nhap K :");
            k = scanner.nextInt();
            switch (k) {
                case 1:
                    System.out.println("Nhap so luong san pham");
                    n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        Product product = new Product();
                        product.Nhap();
                        arr.add(product);
                    }
                    break;

                case 2:
                    System.out.println("San pham ban vua nhap");
                    for (Product pr : arr) {
                        pr.Display();
                    }
                    break;

                case 4:
                    System.out.println("San pham co gia cao nhat la");
                    MaxDonGia(arr).Display();
                    break;

                case 5:
                    System.out.println("San pham giam dan theo gia: ");
                    SortDESC(arr);
                    for (Product pr : arr) {
                        pr.Display();
                    }
                    break;

                case 6:
                    System.out.println("San pham co ten la sua or SUA: ");
                    for (Product pr : arr) {
                        if (pr.getTenHH().equals("sua") || pr.getTenHH().equals("SUA")) {
                            pr.Display();
                        }
                    }
                    break;

                case 7:
                    break;
            }
        } while (k != 7);
        scanner.close();
    }

    private static void Menu() {
        System.out.println("1. Nhap thong tin cho n san pham");
        System.out.println("2. Hien thi thong tin vua nhap");
        System.out.println("4. San pham co gia cao nhat la");
        System.out.println("5. San pham giam dan theo gia:");
        System.out.println("6. San pham co ten la sua or SUA:");
        System.out.println("7. Thoat");
    }

    private static Product MaxDonGia(ArrayList<Product> arr) {
        Product pro = arr.get(0);
        int index = 0;
        for (Product pr : arr) {
            if (index == 0) {
                continue;
            } else {
                if (pr.getDonGia() > pro.getDonGia()) {
                    pro = pr;
                }
                index++;
            }
        }
        return pro;
    }

    private static void SortDESC(ArrayList<Product> arr) {
        Collections.sort(arr, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                if (p1.getDonGia() < p2.getDonGia()) {
                    return 1;
                } else if (p1.getDonGia() == p2.getDonGia()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
    }

}
