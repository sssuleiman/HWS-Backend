package sule.projects.houseWorkersSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sule.projects.houseWorkersSystem.exception.UserNotFoundException;
import sule.projects.houseWorkersSystem.modal.Employee;
import sule.projects.houseWorkersSystem.repository.EmployeeRepo;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
//        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id){
        return employeeRepo.findEmployeeById(id).orElseThrow(()-> new UserNotFoundException("user with id = " + id + "not present"));
    }
    public Employee findEmployeeByEmail(String Email){
        return employeeRepo.findEmployeeByEmail(Email).orElseThrow(()-> new UserNotFoundException("user with id = " + Email + "not present"));
    }

    public void deleteEmployee(Long id){
        employeeRepo.deleteById(id);
    }


}
