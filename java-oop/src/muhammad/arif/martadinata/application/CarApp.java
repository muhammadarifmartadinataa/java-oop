package muhammad.arif.martadinata.application;

import muhammad.arif.martadinata.data.Avanza;
import muhammad.arif.martadinata.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
