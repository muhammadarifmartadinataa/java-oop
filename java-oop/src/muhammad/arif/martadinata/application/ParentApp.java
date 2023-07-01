package muhammad.arif.martadinata.application;

import muhammad.arif.martadinata.data.Child;
import muhammad.arif.martadinata.data.Parent;

public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name="Arif";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.doIt();
        System.out.println(parent.name);
    }
}
