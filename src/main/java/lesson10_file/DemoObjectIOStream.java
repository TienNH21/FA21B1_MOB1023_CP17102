package lesson10_file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import lesson3_luyen_tap_1.Nguoi;

public class DemoObjectIOStream {
    public static void main(String[] args) {
        System.out.println("Bắt đầu ghi file");
        ghiFile();
        System.out.println("Ghi file thành công");
        System.out.println("-----------------------");
        System.out.println("Bắt đầu đọc file");
        docFile();
        System.out.println("Đọc file thành công");
    }
    
    public static void ghiFile() {
        Nguoi n = new Nguoi("Ng Van A", "HN", "HN", 1);
        try {
            FileOutputStream fos = new FileOutputStream("demo_object_io.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(n);
            oos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }
    
    public static void docFile() {
        try {
            FileInputStream fis = new FileInputStream("demo_object_io.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            Nguoi n = (Nguoi) ois.readObject();
            
            System.out.println(n.getHoTen());
            System.out.println(n.getGioiTinh());
            System.out.println(n.getDiaChi());
            System.out.println(n.getQueQuan());
            
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        }
    }
}
