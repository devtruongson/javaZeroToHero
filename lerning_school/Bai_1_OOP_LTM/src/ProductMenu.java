import java.util.Scanner;

public class ProductMenu {
    public static void main(String[] args) {
        HangHoa[] hangHoas = null;
        int option;
        Scanner scanner = new Scanner(System.in);
        do {
            Menu();
            System.out.print("Moi ban nhap lua chon: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Moi ban nhap so luong san pham: ");
                    int n = scanner.nextInt();
                    hangHoas = new HangHoa[n];
                    for (int i = 0; i < n; i++) {
                        HangHoa h = new HangHoa();
                        h.Input();
                        hangHoas[i] = h;
                    }
                    break;

                case 2:
                    if (hangHoas == null) {
                        System.out.println("Danh sach hang hoa cua bang dang trong vui long nhap san pham truoc");
                    } else {
                        System.out.println("San pham ban vua nhap la: ");
                        for (int i = 0; i < hangHoas.length; i++) {
                            hangHoas[i].Output();
                        }
                    }
                    break;
                case 3:
                    if (hangHoas == null) {
                        System.out.println("Danh sach hang hoa cua bang dang trong vui long nhap san pham truoc");
                    } else {
                        SortArray(hangHoas);
                        System.out.println("San pham ban vua sap xep la: ");
                        for (int i = 0; i < hangHoas.length; i++) {
                            hangHoas[i].Output();
                        }
                    }

                    break;

            }
        } while (option != 4);

        scanner.close();
    }

    private static void Menu() {
        System.out.println("1. Nhap thong tin cho n san pham");
        System.out.println("2. Hien thi thong tin san pham vua nhap");
        System.out.println("3. Xap xep thong tin giam dan theo gia");
        System.out.println("4. Thoat");
    }

    private static void SortArray(HangHoa[] h) {
        for (int i = 0; i < h.length; i++) {
            int index = i;
            for (int j = i + 1; j < h.length; j++) {
                if (h[index].getGia() < h[j].getGia()) {
                    index = j;
                }
            }
            if (index != i) {
                HangHoa tam = h[i];
                h[i] = h[index];
                h[index] = tam;
            }
        }
    }
}
