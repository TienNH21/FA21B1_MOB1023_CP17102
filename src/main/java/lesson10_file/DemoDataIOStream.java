package lesson10_file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoDataIOStream {
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
        try {
            FileOutputStream fos = new FileOutputStream("demo_data_io.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            
            int i = 20;
            char c = 'A';
            
            dos.writeInt(i);
            dos.writeChar(c);
            
            dos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }
    
    public static void docFile() {
        try {
            FileInputStream fis = new FileInputStream("demo_data_io.txt");
            DataInputStream dataInputStream = new DataInputStream(fis);
            int i = dataInputStream.readInt();
            char c = dataInputStream.readChar();
            
            System.out.println(i);
            System.out.println(c);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        }
    }
}
