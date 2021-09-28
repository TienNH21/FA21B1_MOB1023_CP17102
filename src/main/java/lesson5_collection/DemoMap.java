package lesson5_collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> diemTP = new HashMap<>();
        diemTP.put("lab_1", 1);
        diemTP.put("lab_2", 5);
        diemTP.put("lab_3", 7);
        diemTP.put("lab_1", 9);
        
        System.out.println(diemTP);
        System.out.println("Điểm lab 1: " + diemTP.get("lab_1"));
        
        if ( diemTP.containsKey("lab_1") == true ) {
            System.out.println("Đã có điểm lab 1");
        } else {
            System.out.println("Chưa có điểm lab 1");
        }
        
        for (String key: diemTP.keySet()) {
            System.out.println( diemTP.get(key) );
        }
    }
}
