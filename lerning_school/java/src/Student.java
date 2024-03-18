public class Student extends Person {
    private int mark;
    private String grade;

    public Student(int mark, String id, String name, int age) {
        super(id, name, age);
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        if (this.mark >= 8) {
            this.grade = "A";
        } else if (this.mark >= 7) {
            this.grade = "B";
        } else if (this.mark >= 6) {
            this.grade = "C";
        } else if (this.mark >= 5) {
            this.grade = "D";
        } else {
            this.grade = "Tạch rồi còn đâu";
        }
    }

}