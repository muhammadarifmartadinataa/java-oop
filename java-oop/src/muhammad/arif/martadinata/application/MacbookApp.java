package muhammad.arif.martadinata.application;
import muhammad.arif.martadinata.data.Laptop;
import muhammad.arif.martadinata.data.Macbook;

public class MacbookApp {
    public static void main(String[] args) {
        Laptop laptop = new Macbook();
        System.out.println(laptop.getPrice());
        laptop.laptop();
    }
}
