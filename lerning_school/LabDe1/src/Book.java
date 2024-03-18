import java.util.Scanner;

public class Book extends Document {
    private String tenTacGia;
    private int soTrang;

    public Book() {
    }

    public Book(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    @Override
    public void Input() {
        super.Input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten tac gia : ");
        this.setTenTacGia(scanner.nextLine());
        System.out.print("Nhap tong so trang : ");
        this.setSoTrang(scanner.nextInt());
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Ten tac gia sach la: " + this.getTenTacGia());
        System.out.println("Tong so trang sach la: " + this.getSoTrang());
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

}
