public class StudentTech extends Student {
    private String language;

    public StudentTech(String language, int id, String name, double price, double tax) {
        super(id, name, price, tax);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void welCome() {
        System.out.println("Chay class StudentTech");
        super.getInfo();
    }
}
