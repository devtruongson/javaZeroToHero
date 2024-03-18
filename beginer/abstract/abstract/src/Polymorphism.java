public class Polymorphism {
    public static void main(String[] args) {
        Animals an = new Cat();
        an.speak();
    }
}

class Animals {
    void speak() {
        System.out.println("Animal speak");
    }
}

class Dog extends Animals {
    @Override
    void speak() {
        System.out.println("Dog speak");
    }
}

class Cat extends Animals {
    @Override
    void speak() {
        System.out.println("Cat speak");
    }
}