package demo_luyen_tap_2;

import java.util.List;

public interface QLSPInterface {
    public void them(SanPham sp);
    public void sua(int viTri, SanPham sp);
    public void xoa(int viTri);
    
    public List<SanPham> getList();
    public void setList(List<SanPham> list);
    
    public void ghiFile();
    public void docFile();
}
