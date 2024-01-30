public class Student {
    protected int id;
    protected String name;
    protected double price;
    protected double tax;

    public double getPriceTax() {
        return price * tax;
    }

    public void getInfo() {
        System.out.println("Welcome to the Student");
    }
}
