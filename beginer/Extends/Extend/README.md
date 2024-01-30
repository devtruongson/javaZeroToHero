## KeyWord Supper

rất đặc biệt nó có thể giúp ta không cần phải sử dụng câu lệnh hàm tạo như

```bash
 Student st = new Student();
```

ta có thể truy cập vào class cha để lấy các method bằng cách

-   Code được viết tại class StudentTech or StudentMachine

```bash
    supper.getInfo()
```

method getInfo được viết tại hàm cha là class Student

-   Lưu ý khi ta khởi tạo StudentTech or StudentMachine ở một class khác thì khi ta khởi tạo bằng

```bash
    StudentTech st = new StudentTech()
```

nếu ở trong class StudentTech không có hàm tạo hoặc hàm tạo ta khởi tạo ta viết trong nó là

```bash
    public StudentTech(){

    }
```

thì nó vẫn sẽ khởi tạo thằng cha giống như khởi tạo thằng con và nó java nó tự động khởi tạo như sau:

```bash
    public StudentTech(){
        supper();
    }
```

supper(); ở đây giống như hàm tạo
