public class Car extends Vehicle {
    private String modelName = "CX5";

    public static void main(String[] args) {
        Car car = new Car();
        car.holk();
        System.out.println(car.brand + " --- " + car.modelName);

    }
}
