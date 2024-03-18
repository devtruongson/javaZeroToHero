import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        Mobile[] mb = null;
        Car[] cars = null;

        do {
            Menu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Ban hay nhap so luong dien thoai:");
                    int sizeMb = scanner.nextInt();
                    mb = new Mobile[sizeMb];
                    for (int i = 0; i < sizeMb; i++) {
                        Mobile m = new Mobile();
                        m.input();
                        mb[i] = m;
                    }
                    break;

                case 2:
                    System.out.println("Nhap vao so luong o to");
                    int sizeCar = scanner.nextInt();
                    cars = new Car[sizeCar];
                    for (int i = 0; i < sizeCar; i++) {
                        Car car = new Car();
                        car.input();
                        cars[i] = car;
                    }
                case 3: {
                    if (mb == null || cars == null) {
                        System.out.println(
                                "Ban khong the in danh sach dien thoai hoac may tinh vi ban nhap thieu ca 2 hoac 1 trong 2");
                        return;
                    }
                    System.out.println("Danh sach dien thoai ban da nhap la:");
                    for (int i = 0; i < mb.length; i++) {
                        mb[i].display();
                    }
                    System.out.println("Danh sach oto ban da nhap la:");
                    for (int i = 0; i < cars.length; i++) {
                        cars[i].display();
                    }
                }
                case 4:
                    System.out.println("Nhap hang muon tim kiem");
                    String q = scanner.nextLine();
                    searchFollowManuFacturer(q, mb, cars);
                case 5:
                    break;
            }

        } while (option != 5);
        scanner.close();
    }

    public static void Menu() {
        System.err.println("1. Nhập vào thông tin cho n điện thoại");
        System.out.println("2. Nhập vào thông tin cho n ô tô");
        System.out.println("3. Hiển thị thông tin cả điện thoại và ô tô");
        System.out.println("4. Tìm kiếm thông tin theo tên nhà sản xuất.");
        System.out.println("5. Thoát");
    }

    public static void searchFollowManuFacturer(String query, Mobile[] mb, Car[] cars) {
        if (query == null)
            return;
        System.out.println("Dien thoai hang " + query + " la:");
        for (int i = 0; i < mb.length; i++) {
            if (mb[i].getManufacturer().equals(query)) {
                mb[i].display();
            }
        }
        System.out.println("Oto hang " + query + " la:");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getManufacturer().equals(query)) {
                cars[i].display();
            }
        }
    }
}
