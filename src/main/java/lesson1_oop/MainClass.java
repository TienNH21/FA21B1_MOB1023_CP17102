package lesson1_oop;

public class MainClass {
    public static void main(String[] args) {
        // Tạo ra biến svKy3
        SinhVien svKy3;
        
        // Khởi tạo đối tượng của lớp SinhVienKy3 & gán đối tượng vào biến svKy3
        svKy3 = new SinhVienKy3("Ng Van A", "PH123", "HN", 100000);
        
        svKy3.xuatThongTin();
    }
}
