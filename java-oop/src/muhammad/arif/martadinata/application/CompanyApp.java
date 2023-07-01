package muhammad.arif.martadinata.application;

import muhammad.arif.martadinata.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company  company = new Company();
        company.setName("Muhammad Arif Martadinata");

        Company.Employee employee = company.new Employee();
        employee.setName("Arif");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2= new Company();
        company2.setName("Devi Ratnawati");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Devi");

        System.out.println(employee2.getCompany());
        System.out.println(employee2.getName());
    }
}
