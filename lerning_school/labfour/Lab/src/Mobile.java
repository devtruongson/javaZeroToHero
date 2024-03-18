import java.util.Scanner;

public class Mobile extends Engine {
    private String country;

    public Mobile() {
    }

    public Mobile(String country, String engineId, String engineName, String manufacturer, float price,
            int yearMaking) {
        super(engineId, engineName, manufacturer, yearMaking, price);
        this.country = country;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.print("Ban hay nhap quoc gia san xuat dien thoai");
        this.country = scanner.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.print("Quoc gia san xuat dien thoai la :" + this.country);
    }

}
