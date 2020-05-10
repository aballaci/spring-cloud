package de.ballaci.springdatacollege.repositories;

import de.ballaci.springdatacollege.domain.Department;
import de.ballaci.springdatacollege.domain.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends CrudRepository<Department, String> {
}
