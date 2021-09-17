package lesson2_interface;

public class MainClass {
    public static void main(String[] args) {
        /*
         * Class Bird thực thi interface Flyable,
         * nên đối tượng của lớp Bird
         * cũng có kiểu Flyable
         *
         * 
         * Class Bird kế thừa Class Animal, nên đối tượng của lớp Bird
         * cũng có kiểu Animal
         *
         */
        Flyable b = new Bird();
        b.fly();
    }
}
