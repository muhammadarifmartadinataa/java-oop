package muhammad.arif.martadinata.application;

import muhammad.arif.martadinata.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("ID");
        System.out.println(category.getId());
    }
}
