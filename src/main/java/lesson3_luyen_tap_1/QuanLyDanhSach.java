package lesson3_luyen_tap_1;

import java.util.ArrayList;

public class QuanLyDanhSach implements QLNguoiInterface {
    private ArrayList<Nguoi> ds;
    
    public QuanLyDanhSach() {
        this.ds = new ArrayList<>();
    }

    @Override
    public void add(Nguoi nguoi) {
        this.ds.add(nguoi);
    }

    @Override
    public void edit(int viTri, Nguoi nguoi) {
        this.ds.set(viTri, nguoi);
    }

    @Override
    public void delete(int viTri) {
        this.ds.remove(viTri);
    }

    @Override
    public Nguoi get(int viTri) {
        return this.ds.get(viTri);
    }

    @Override
    public ArrayList<Nguoi> getDanhSach() {
        // Exception -> try/catch
        return this.ds;
    }

    @Override
    public void setDanhSach(ArrayList<Nguoi> ds) {
        this.ds = ds;
    }
}
