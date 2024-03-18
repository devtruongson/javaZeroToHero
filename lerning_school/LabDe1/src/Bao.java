import java.util.Scanner;

public class Bao extends Document {
    private int ngayPhatHanh;

    public Bao() {
    }

    public Bao(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void Input() {
        super.Input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ngay phat hanh : ");
        this.setNgayPhatHanh(scanner.nextInt());
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("So ngay phat hanh bao la : " + this.getNgayPhatHanh());
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

}
