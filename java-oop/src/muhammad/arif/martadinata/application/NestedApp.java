package muhammad.arif.martadinata.application;

import muhammad.arif.martadinata.data.Company;

public class NestedApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Amarnath Studio");
        Company.Employee employee = company.new Employee();
        employee.setName("Muhammad Arif Martadinata");

        System.out.println(company.getName());
        System.out.println(employee.getName());
    }
}
