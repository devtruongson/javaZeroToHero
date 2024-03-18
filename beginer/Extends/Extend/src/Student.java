public class Student {
    protected int id;
    protected String name;
    protected double price;
    protected double tax;

    public Student(int id, String name, double price, double tax) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public double getPriceTax() {
        return price * tax;
    }

    public void getInfo() {
        System.out.println("Welcome to the Student");
    }
}
