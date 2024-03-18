public class App {
    public static void main(String[] args) throws Exception {
        StudentTech st1 = new StudentTech("Java", 123, "TruongSon", 20, 30);
        st1.welCome();
        System.out.println(st1.name);
        System.out.println(st1.getPriceTax());
    }
}
