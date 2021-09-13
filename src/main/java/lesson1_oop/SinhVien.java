package lesson1_oop;

public class SinhVien {
    private String hoTen;
    private String maSV;
    private String diaChi;
    private long soTienTrongVi;

    public SinhVien() {
    }

    /*
     * Hàm khởi tạo
     * dùng để khởi tạo đối tượng
     */
    public SinhVien(String hoTen, String maSV, String diaChi, long soTienTrongVi) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.diaChi = diaChi;
        this.soTienTrongVi = soTienTrongVi;
    }

    public String getHoten()
    {
        return this.hoTen;
    }

    public String getMaSV()
    {
        return this.maSV;
    }

    public String getDiaChi()
    {
        return this.diaChi;
    }
    
    public void napTienVaoVi(long tienNap) {
        this.soTienTrongVi = this.soTienTrongVi + tienNap;
    }
    
    public void truTienTrongVi(long tienTru) {
        this.soTienTrongVi = this.soTienTrongVi - tienTru;
    }
    
    public void xuatThongTinSoTien() {
        System.out.printf("Số dư: %ld\n", this.soTienTrongVi);
    }
    
    public void xuatThongTin()
    {
        // Shadowed Variables in Java
        String hoTen = "Không tồn tại";
        System.out.printf("%s - %s - %s - %d\n",
            this.hoTen, this.maSV, this.diaChi, this.soTienTrongVi);
    }
}
