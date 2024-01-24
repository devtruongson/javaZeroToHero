public class App {

    public static void main(String[] args) {
        Student student = new Student("Nguyen Truong Son", 20);
        student.setName("Nguyen Truong Son Cap Nhat");
        student.setAge(21);
        System.err.println(student.getName());
        System.err.println(student.getAge());
    }
}
