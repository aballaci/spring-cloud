package de.ballaci.springdatacollege.services;


import de.ballaci.springdatacollege.domain.Department;
import de.ballaci.springdatacollege.domain.Employee;
import de.ballaci.springdatacollege.repositories.DepartmentRepository;
import de.ballaci.springdatacollege.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public Iterable<Department> retrieveAllEmployees(){
        return repository.findAll();
    }
}
