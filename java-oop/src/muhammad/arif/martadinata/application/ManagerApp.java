package muhammad.arif.martadinata.application;

import muhammad.arif.martadinata.data.Manager;
import muhammad.arif.martadinata.data.VicePresident;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Arif","PT Perindo");
        manager.sayHello("Faiz");

        var vp = new VicePresident("Nyoman");
        vp.sayHello("Raka");
    }
}
