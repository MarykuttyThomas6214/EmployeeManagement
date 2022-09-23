package emp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import emp2.entity.Employee;

@Repository
public interface EmpRepo  extends JpaRepository<Employee, Integer>{

}