package muhammad.arif.martadinata.data;
import java.util.Objects;
public class Product {
    private String name;
    private int price;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return "Product name : " + this.name + " ,Price : " + price ;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return Objects.equals(name, product.name);
    }
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}

