package lesson2_interface;

public class Animal {
    private String ten;
    private int soChan;
    
    public void tiengKeu() {
        System.out.println("ABC");
    }

    public Animal() {
    }

    public Animal(String ten, int soChan) {
        this.ten = ten;
        this.soChan = soChan;
    }

    public String getTen() {
        return ten;
    }

    public int getSoChan() {
        return soChan;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSoChan(int soChan) {
        this.soChan = soChan;
    }
    
    
}
