package main;

import model.Employee;
import persistence.RepositoryEmployee;

public class Main {
    public static void main(String[] args) {
        RepositoryEmployee repo = new RepositoryEmployee();
        Employee employee = new Employee();
        employee.setFirstName("Valentin");
        employee.setLastName("Jev");
        employee.setEmail("valentin@gmail.com");
        employee.setPhoneNumber("9877-0021");
        employee.setDateOfBirth("1987-05-01");
        employee.setSalary(8000);

        repo.saveEmployee(employee);
    }
}
