package muhammad.arif.martadinata.application;

import muhammad.arif.martadinata.data.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Macbook M2 Max",50000000);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product);
        Product product2 = new Product("Macbook M2 Max",50000000);
        System.out.println(product.equals(product2));
        System.out.println(product.hashCode()==product2.hashCode());

    }
}
