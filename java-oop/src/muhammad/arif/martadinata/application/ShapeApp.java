package muhammad.arif.martadinata.application;

import muhammad.arif.martadinata.data.Shape;
import muhammad.arif.martadinata.data.Square;

import java.awt.*;

public class ShapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getCorner());

        var square = new Square();
        System.out.println(square.getCorner());
        System.out.println(square.getParentCorner());


    }
}
