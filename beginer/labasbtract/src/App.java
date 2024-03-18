public class App {
    public static void main(String[] args) throws Exception {
        StudentTech st = new StudentTech(10, 1);
        System.out.println("Diem sinh vien IT :" + st.getPoint());

        StudentMachine sm = new StudentMachine(11, 3);
        System.out.println("Diem sinh vien machine :" + sm.getPoint());
    }
}
