/* 
 *  - Tạo 1 class hoàn chỉnh
    - Biết cách sử dụng object (instance từ class đã tạo)
        
        Yêu cầu:
        Tạo class Product gồm các thuộc tính:
        - name: String //tên sản phẩm
        - price: double //giá sản phẩm
        - tax : double //thuế sản phẩm
*/

public class Product {
    private String name;
    private double price;
    private double tax;

    Product() {
    }

    Product(String name, double price, double tax) {
        this.setName(name);
        this.setPrice(price);
        this.setTax(tax);
    }

    public Product enterYourInfo(String name, double price, double tax) {
        Product pro = new Product(name, price, tax);
        return pro;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return this.tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void getInfo() {
        System.err.println("Ten san pham la : " + this.getName());
        System.err.println("Gia san pham la : " + this.getPrice());
        System.err.println("Tax san pham la : " + this.getTax());
    }

    public double getTaxPrice(double price, double tax) {
        return price * tax;
    }
}
