package muhammad.arif.martadinata.application;

import muhammad.arif.martadinata.data.Employee;
import muhammad.arif.martadinata.data.Manager;
import muhammad.arif.martadinata.data.VicePresident;

public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Arif");
        employee.sayHello("Faiz");

        employee  = new Manager("Arif");
        employee.sayHello("Faiz");

        employee = new VicePresident("Arif");
        employee.sayHello("Faiz");

        sayHello(new Employee("Faiz"));
        sayHello(new Manager("Faiz"));
        sayHello(new VicePresident("Faiz"));
    }
    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello  Employee " + employee.name);
        }
    }
}
