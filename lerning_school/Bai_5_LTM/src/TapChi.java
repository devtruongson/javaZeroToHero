import java.util.Scanner;

public class TapChi extends TaiLieu {
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi() {
    }

    public TapChi(String maTaiLieu, String nhaXb, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, nhaXb, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void Input() {
        super.Input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap so phat hanh tap chi: ");
        this.setSoBanPhatHanh(scanner.nextInt());
        System.out.print("Moi ban nhap thang phat hanh tap chi: ");
        this.setThangPhatHanh(scanner.nextInt());
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("So phat hanh tap chi: " + this.getSoPhatHanh());
        System.out.println("Thang phat hanh tap chi: " + this.getThangPhatHanh());
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

}
