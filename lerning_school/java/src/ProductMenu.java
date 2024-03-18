import java.util.Scanner;

public class ProductMenu {
    public static void main(String[] args) {
        int k = 0, n = 0;
        Product[] pro = null;
        Scanner scanner = new Scanner(System.in);
        do {
            Menu();
            System.out.println("k: ");
            k = scanner.nextInt();
            switch (k) {
                case 1:
                    System.out.println("Nhap so luong san pham");
                    n = scanner.nextInt();
                    pro = new Product[n];
                    for (int i = 0; i < n; i++) {
                        Product p = new Product();
                        p.Nhap();
                        pro[i] = p;
                    }
                    break;

                case 2:
                    if (pro != null) {
                        for (int i = 0; i < n; i++) {
                            pro[i].Xuat();
                        }
                    } else {
                        System.out.println("Chua nhap thong tin san pham.");
                    }
                    break;
                case 3: {
                    if (pro != null) {
                        SortProduct(pro);
                        System.out.println("San pham sau khi xap xep theo gia ban");
                        for (int i = 0; i < n; i++) {
                            pro[i].Xuat();
                        }
                    } else {
                        System.out.println("Chua nhap thong tin san pham.");
                    }
                    break;
                }
                case 4: {
                    break;
                }
            }
        } while (k != 4);
        scanner.close(); // Close the scanner after the loop
    }

    private static void Menu() {
        System.out.println("1. Nhap thong tin cho n san pham");
        System.out.println("2. Hien thi thong tin vua nhap");
        System.out.println("3. Xap xep giam dan theo gia va hien thi");
        System.out.println("4. Thoat");
    }

    private static void SortProduct(Product[] pro) {
        for (int i = 0; i < pro.length; i++) {
            for (int j = i + 1; j < pro.length; j++) {
                if (pro[i].getGiaBan() > pro[j].getGiaBan()) {
                    Product tam = pro[i];
                    pro[i] = pro[j];
                    pro[j] = tam;
                }
            }
        }
    }
}
