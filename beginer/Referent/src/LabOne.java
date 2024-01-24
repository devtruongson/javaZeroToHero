
/* // Bài 1:
//     - Tạo class với yêu cầu ở trên, đặt tên là Product.java
//     - khai báo các thuộc tính: name, price, tax
//     - Tạo thêm 2 method cho class trên:
//     + nhapThongTin(): void (dùng để nhập thông tin object)
//     + xuatThongTin(): void (in ra thông tin object đã tạo)
//     + getTaxPrice(): double
//     số tiền thuế = price * tax */

public class LabOne {
    public static void main(String[] args) {
        Product product = new Product();
        Product pro = product.enterYourInfo("Mycomputer", 15.4, 12.3);
        pro.getInfo();
        System.err.println("Thue san pham la : " + pro.getTaxPrice(pro.getPrice(), pro.getTax()));
    }
}
