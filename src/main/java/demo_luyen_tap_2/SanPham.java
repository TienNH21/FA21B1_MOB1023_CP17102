package demo_luyen_tap_2;

import java.io.Serializable;

public class SanPham implements Serializable {
    private String tenSP, maSP, danhMuc;
    private int donGia, tinhTrang;

    public SanPham(String tenSP, String maSP, String danhMuc, int donGia, int tinhTrang) {
        this.tenSP = tenSP;
        this.maSP = maSP;
        this.danhMuc = danhMuc;
        this.donGia = donGia;
        this.tinhTrang = tinhTrang;
    }

    public SanPham() {
    }

    public String getTenSP() {
        return tenSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public int getDonGia() {
        return donGia;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    
}
