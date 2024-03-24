Bài 4.
Tạo class Engine gồm các thuộc tính:
- engineId (Mã máy)
- engineName (Tên máy)
- manufacturer (Tên nhà sản xuất)
- yearMaking (Năm sản xuất)
- price (Giá bán)
+ Tạo 2 constructors
+ Tạo các phương thức get/set
+ Cài đặt phương thức input(), display()
Tạo class Mobile kế thừa lớp Engine ở trên và bổ sung thêm các thuộc tính:
- country (Nước sản xuất)
+Tạo 2 constructors, trong đó constructor có tham số phải sử dụng từ khóa super để gọi
đến constructor có tham số của lớp cha
+ Cài đặt các phương thức get/set cho thuộc tính bổ sung
+ Override phương thức input() và display() của lớp cha.
Tạo class Car kế thừa class Engine và bổ sung thêm thuộc tính:
- totalSeat (Số chỗ ngồi)
- speed (Tốc độ)
+ Tạo 2 constructors, trong đó constructor có tham số phải sử dụng từ khóa super để gọi
đến constructor có tham số của lớp cha
+ Cài đặt các phương thức get/set cho thuộc tính bổ sung
+ Override phương thức input() và display() của lớp cha.
Tạo class Manager trong đó có phương thức main.
1. Nhập vào thông tin cho n điện thoại
2. Nhập vào thông tin cho n ô tô
3. Hiển thị thông tin cả điện thoại và ô tô
4. Tìm kiếm thông tin theo tên nhà sản xuất.
5. Thoát