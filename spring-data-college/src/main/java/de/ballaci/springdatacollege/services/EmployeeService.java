package de.ballaci.springdatacollege.services;


import de.ballaci.springdatacollege.domain.Employee;
import de.ballaci.springdatacollege.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Iterable<Employee> retrieveAllEmployees(){
        return repository.findAll();
    }
}
