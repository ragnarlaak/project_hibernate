package persistence;

import model.Employee;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryEmployee {
    private EntityManager entityManager;

    public RepositoryEmployee() {
        entityManager = DBUtil.getEntityManager();
    }

    public void saveEmployee(Employee employee) {
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(employee);
            entityManager.getTransaction().commit();
            System.out.println("Employee saved with success");
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
        }
    }

    public void updateEmployee(Employee employee) {

    }

    public void deleteEmployee(int employeeId) {

    }

    public List<Employee> listAllEmployees() {
      return null;
    }

    public Employee findEmployeeBy(int employee) {
        return null;
    }

    public List<Employee> listAllEmployeeByDepartment(int departmentId) {
        return null;
    }

//    public List<EmployeeDepartment> listEmp() {
//
//    }

}
