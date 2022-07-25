package sule.projects.houseWorkersSystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import sule.projects.houseWorkersSystem.modal.Employee;

import java.util.Optional;


public interface EmployeeRepo extends JpaRepository<Employee, Long>{
    Optional<Employee> findEmployeeById(Long id);

    Optional<Employee> findEmployeeByEmail(String email);
}