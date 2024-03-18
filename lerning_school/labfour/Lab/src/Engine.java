import java.text.StringCharacterIterator;
import java.util.Scanner;

public class Engine {
    private String engineId;
    private String engineName;
    private String manufacturer;
    private int yearMaking;
    private double price;

    public Engine() {

    }

    public Engine(String engineId, String engineName, String manufacturer, int yearMaking, double price) {
        this.engineId = engineId;
        this.engineName = engineName;
        this.manufacturer = manufacturer;
        this.yearMaking = yearMaking;
        this.price = price;
    }

    public String getEngineId() {
        return engineId;
    }

    public String getEngineName() {
        return engineName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearMaking() {
        return yearMaking;
    }

    public double getPrice() {
        return price;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYearMaking(int yearMaking) {
        this.yearMaking = yearMaking;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhap engineID :");
            this.engineId = scanner.nextLine();
            System.out.print("Nhap engineName :");
            this.engineName = scanner.nextLine();
            System.out.print("Nhap manufacturer ten nha sx :");
            this.manufacturer = scanner.nextLine();
            System.out.print("Nhap gia ban :");
            this.price = scanner.nextFloat();
        } catch (Exception e) {
            System.err.println("Ban da nhap sai kieu yeu cau vui long nhap lai tu dau");
            this.input();
        }
    }

    public void display() {
        System.out.println("EngineId :" + this.engineId);
        System.out.println("EngineName :" + this.engineName);
        System.out.println("manufacturer :" + this.manufacturer);
        System.out.println("Price :" + this.price);
    }
}
