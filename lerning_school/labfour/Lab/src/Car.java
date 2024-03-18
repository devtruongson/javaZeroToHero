import java.util.Scanner;

public class Car extends Engine {
    private int totalSeat;
    private float speed;

    public Car() {

    }

    public Car(int totalSeat, float speed, String engineId, String engineName, String manufacturer, int yearMaking,
            float price) {
        super(engineId, engineName, manufacturer, yearMaking, price);
        this.totalSeat = totalSeat;
        this.speed = speed;
        this.totalSeat = totalSeat;
        this.speed = speed;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so ghe cua xe :");
        this.totalSeat = scanner.nextInt();
        System.out.println("Nhap toc do cua xe :");
        this.speed = scanner.nextInt();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("So ghe cua xe la:" + this.totalSeat);
        System.out.println("Toc do cua xe la:" + this.speed);
    }
}
