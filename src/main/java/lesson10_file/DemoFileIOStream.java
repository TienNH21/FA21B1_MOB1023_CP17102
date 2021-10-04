package lesson10_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileIOStream {
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
            FileOutputStream fos = new FileOutputStream("demo_fos.txt");
            String txt = "Hello CP17102";
            
            byte[] b = txt.getBytes();
            fos.write(b);
            
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }
    
    public static void docFile() {
        try {
            FileInputStream fis = new FileInputStream("demo_fos.txt");
            
            while ( fis.available() != 0 ) {
                int i = fis.read();
                char c = (char) i;
                System.out.print(c);
            }

            System.out.println("");
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        }
    }
}
