public class Student {

    // Class attributes
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Class Methods
    void learn() {
        System.err.println("Hoc Java Co Ban");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // public String getName() {
    // return this.name;
    // }

    // public int getAge() {
    // return this.age;
    // }

    // public void setName(String name) {
    // this.name = name;
    // }

    // public void setAge(int age) {
    // this.age = age;
    // }

}
