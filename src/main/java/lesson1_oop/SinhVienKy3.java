package lesson1_oop;

/*
 * Class SinhVienKy3 kế thừa SinhVien, nên đối tượng được tạo từ SinhVienKy3
 * cũng sẽ có kiểu là SinhVien.
 */
public class SinhVienKy3 extends SinhVien
{

    /*
     * Khi extends, class SinhVienKy3 là lớp con của SinhVien
     * => class SinhVienKy3 được quyền truy xuất
     * tới những thuộc tính & phương thức <KHÔNG PRIVATE> của SinhVien
     */ 
    public SinhVienKy3() {
        // super();
    }

    public SinhVienKy3(String hoTen, String maSV, String diaChi, long soTienTrongVi) {
        // Sử dụng super để gọi tới hàm cùng tên của lớp cha
        super(hoTen, maSV, diaChi, soTienTrongVi);
    }
    
    @Override
    public void xuatThongTin()
    {
        super.xuatThongTin();
        System.out.println("Kỳ đang học: 3");
    }
    
    // Overloading
    public void xuatThongTin(String chuyenNganh)
    {
        System.out.println("Chuyên ngành: " + chuyenNganh);
    }
}
