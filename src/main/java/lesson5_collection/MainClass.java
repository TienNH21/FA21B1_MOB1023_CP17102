package lesson5_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        Set<Integer> mySet = new HashSet<>();
        
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(3);
        myList.add(2);
        myList.add(1);
        myList.add(4);
        myList.add(5);
        myList.add(6);

        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(3);
        mySet.add(2);
        mySet.add(1);
        mySet.add(6);
        mySet.add(7);
        mySet.add(8);
        

        System.out.println("myList: ");
        System.out.println(myList);
        System.out.println("--------------------");

        Collections.shuffle(myList);

        System.out.println("myList: ");
        System.out.println(myList);
        
        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = Integer.parseInt(o1.toString());
                int i2 = Integer.parseInt(o2.toString());
                if (i1 == i2) {
                    return 0;
                }

                return i1 > i2 ? 1 : -1;
            }
        };

        Collections.sort(myList, c);
        Collections.reverse(myList);
        System.out.println("--------------------");
        System.out.println("myList: ");
        System.out.println(myList);
        
//        System.out.println("--------------------");
//        System.out.println("mySet: ");
//        System.out.println(mySet);
        
//        System.out.println("--------------------");
//        mySet.addAll(myList);
//        System.out.println("Giao của 2 tập:");
//        System.out.println(myList);
//        System.out.println(mySet);
//        System.out.println("--------------------");
//        System.out.println("Vị trí đầu tiên của giá trị 1: " + myList.indexOf(1));
//        System.out.println("Vị trí cuối cùng của giá trị 1: " + myList.lastIndexOf(1));

//        for (int item : myList) {
//            System.out.println(item);
//        }
        
        // Lambda -> Java 8
//        myList.forEach(
//            (item) -> { System.out.println(2 * item); }
//        );
    }
}
