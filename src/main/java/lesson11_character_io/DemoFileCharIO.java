package lesson11_character_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoFileCharIO {
    public static void main(String[] args) {
        String filename = "demo_character_file.txt";
        System.out.println("Bắt đầu ghi file");
        ghiFile(filename);
        System.out.println("Kết thúc ghi file");
        System.out.println("-----------------");
        System.out.println("Bắt đầu ghi file");
        docFile(filename);
        System.out.println("Kết thúc ghi file");
    }
    
    public static void ghiFile(String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            
            String[] list = {
                "Học Kỳ FALL 2021 - Block 1\n",
                "Lớp CP17102 - Môn MOB1023\n"
            };
            
            for (int i = 0; i < list.length; i++) {
                String txt = list[i];
                writer.write(txt);
            }
            
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }
    
    public static void docFile(String filename) {
        try {
            FileReader reader = new FileReader(filename);
            
            while (true) {
                int i = reader.read();
                if (i == -1) {
                    break;
                }

                char c = (char) i;
                System.out.print(c);
            }

            System.out.println("");
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        }
    }
}
