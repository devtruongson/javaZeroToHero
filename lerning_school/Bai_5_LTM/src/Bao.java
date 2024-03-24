import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Bao extends TaiLieu {
    private Date ngayPhatHanh;

    public Bao() {
    }

    public Bao(String maTaiLieu, String nhaXb, int soBanPhatHanh, Date ngayPhatHanh) {
        super(maTaiLieu, nhaXb, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void Input() {
        super.Input();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Vui lòng nhập ngày phát hành (dd/MM/yyyy): ");
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date time = dateFormat.parse(scanner.nextLine());
            this.setNgayPhatHanh(time);
        } catch (ParseException e) {
            System.out.println("Định dạng ngày không đúng. Vui lòng nhập lại!");
        }
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Ngay phat hanh bao la : " + this.getNgayPhatHanh());
    }

    public Date getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(Date ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

}
