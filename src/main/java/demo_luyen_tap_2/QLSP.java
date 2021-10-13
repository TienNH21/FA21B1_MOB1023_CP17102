package demo_luyen_tap_2;

import java.util.ArrayList;
import java.util.List;

public class QLSP implements QLSPInterface{
    private ArrayList<SanPham> ds;

    public QLSP() {
        this.ds = new ArrayList<>();
    }

    public QLSP(ArrayList<SanPham> ds) {
        this.ds = ds;
    }
    
    @Override
    public void them(SanPham sp) {
        this.ds.add(sp);
    }

    @Override
    public void sua(int viTri, SanPham sp) {
        this.ds.set(viTri, sp);
    }

    @Override
    public void xoa(int viTri) {
        this.ds.remove(viTri);
    }

    @Override
    public List<SanPham> getList() {
        return this.ds;
    }

    @Override
    public void setList(List<SanPham> list) {
        this.ds = (ArrayList<SanPham>) list;
    }

    @Override
    public void ghiFile() {
    }

    @Override
    public void docFile() {
    }
}
