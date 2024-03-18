import java.util.Scanner;

public class Learn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n :");
        int n = scanner.nextInt();
        int choose = 0;
        do {
            System.out.println("2. Tinh tong cac so tu 1 den n");
            System.out.println("3. Kiem tra n co la so nguyen to khong");
            System.out.println("4. Kiem tra n co la so hoan hao khong");
            System.out.println("5. Phan tich n thanh tich thua so nguyen to");
            System.out.println("6. Thoat");
            System.out.println("Nhap lua chon cua ban:");
            choose = scanner.nextInt();
            switch (choose) {
                case 2:
                    int tong = 0;
                    for (int i = 0; i <= n; i++) {
                        tong += i;
                    }
                    System.out.println("Tong cac so tu 1 den " + n + " la :" + tong);
                    break;
                case 3:
                    boolean isSnt = true;
                    for (int i = 2; i < n; i++) {
                        if (n % i == 0) {
                            isSnt = false;
                            break;
                        }
                    }
                    System.out.println(n + " la so " + (isSnt ? "so nguyen to" : " khong phai la so nguyen to"));
                    break;
                case 4:
                    int sumUoc = 0;
                    for (int i = 1; i < n; i++) {
                        if (n % i == 0) {
                            sumUoc += i;
                        }
                    }
                    System.out.println(n + " la so " + (sumUoc == n ? "so hoan hao" : " khong phai la so hoan hao"));
                    break;
                case 5:
                    System.out.print("Cac thua so nguyen to " + n + " la: ");
                    int i = 2;
                    while (n > 1) {
                        if (n % i == 0) {
                            System.out.print(i + " ");
                            n /= i;
                        } else {
                            i++;
                        }
                    }
                    break;

                default:
                    break;
            }
        } while (choose != 6);

        scanner.close();
    }
}
