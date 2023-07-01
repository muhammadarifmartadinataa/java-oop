package muhammad.arif.martadinata.data;
public class Buss implements Car{
    public void drive() {
        System.out.println("Bus Drive");
    }
    public int getTire() {
        return 4;
    }
    public String getBrand() {
        return "Hino";
    }
    public boolean isMaintenance() {
        return false;
    }
}
