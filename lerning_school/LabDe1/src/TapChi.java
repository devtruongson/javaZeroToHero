import java.util.Scanner;

public class TapChi extends Document {
    private String soPhatHanh;
    private int thangPhatHanh;

    public TapChi() {
    }

    public TapChi(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, String soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void Input() {
        super.Input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phat hanh : ");
        this.setSoPhatHanh(scanner.nextLine());
        System.out.print("Nhap thang phat hanh : ");
        this.setThangPhatHanh(scanner.nextInt());
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("So phat hanh cua tap chi : " + this.getSoPhatHanh());
        System.out.println("Thang phat hanh cua tap chi : " + this.getThangPhatHanh());
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

}
