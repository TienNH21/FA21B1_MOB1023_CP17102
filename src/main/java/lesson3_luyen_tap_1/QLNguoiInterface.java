package lesson3_luyen_tap_1;

import java.util.ArrayList;

public interface QLNguoiInterface {
    public void add(Nguoi nguoi);
    public void edit(int viTri, Nguoi nguoi);
    public void delete(int viTri);
    public Nguoi get(int viTri);
    public ArrayList<Nguoi> getDanhSach();
    public void setDanhSach(ArrayList<Nguoi> ds);
}
