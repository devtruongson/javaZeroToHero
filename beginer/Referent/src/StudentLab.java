public class StudentLab {
    private String name;
    private int id;

    StudentLab(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void getInfo(StudentLab st) {
        System.err.println(st.name);
        System.err.println(st.id);
    }

}
