package de.ballaci.springdatacollege.rest;

import de.ballaci.springdatacollege.domain.Employee;
import de.ballaci.springdatacollege.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeWebServices {
    private final EmployeeRepository repository;

    public EmployeeWebServices(EmployeeRepository repository){
        super();
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Employee> getAllGuests(){
        return this.repository.findAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id")long id){
        return this.repository.findById(id).get();
    }
}
