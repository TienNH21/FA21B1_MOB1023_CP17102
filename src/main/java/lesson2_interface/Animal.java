package lesson2_interface;

public abstract class Animal {
    private String ten;
    private int soChan;
    
    public abstract void tiengKeu();

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
