package sule.projects.houseWorkersSystem.controler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sule.projects.houseWorkersSystem.modal.Employee;
import sule.projects.houseWorkersSystem.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeContr {

    private final EmployeeService employeeService;

    public EmployeeContr(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employees=employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getGetEmployeeById(@PathVariable("id") Long id){
        Employee employees=employeeService.findEmployeeById (id);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    @GetMapping("/find/{email}")
    public ResponseEntity<Employee> findEmployeeByEmail(@PathVariable("email") String email){
        Employee employees=employeeService.findEmployeeByEmail (email);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee newEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee (@RequestBody Employee employee){
        Employee updateEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee (@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
