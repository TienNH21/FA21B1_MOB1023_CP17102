package lesson3_luyen_tap_1;

import java.util.Scanner;

public class MainClass {
    public void printMenu() {
        System.out.println("/*******************/");
        System.out.println("Chọn:");
        System.out.println("\t1. Thêm người");
        System.out.println("\t2. Thêm sinh viên");
        System.out.println("\t3. Xuất danh sách");
        System.out.println("/*******************/");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QLNguoiInterface qlds = new QuanLyDanhSach();
    }
}
