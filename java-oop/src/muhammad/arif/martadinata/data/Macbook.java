package muhammad.arif.martadinata.data;

public class Macbook implements Laptop {
    @Override
    public void laptop() {
        System.out.println("Macbook M2 Max");
    }
    @Override
    public int getPrice() {
        return 60000000;
    }
}
