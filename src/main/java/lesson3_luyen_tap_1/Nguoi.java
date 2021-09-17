package lesson3_luyen_tap_1;

public class Nguoi {
    public String hoTen, queQuan, diaChi;
    public int gioiTinh;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String queQuan, String diaChi, int gioiTinh) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public String xuatThongTin() {
        String gioiTinh = this.gioiTinh == 1 ? "Nam" : "Nữ";
        return this.hoTen + " - " + gioiTinh + " - " + this.queQuan + " - " + this.diaChi;
    }
}
