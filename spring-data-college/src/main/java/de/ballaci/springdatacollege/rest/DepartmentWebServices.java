package de.ballaci.springdatacollege.rest;

import de.ballaci.springdatacollege.domain.Department;
import de.ballaci.springdatacollege.domain.Employee;
import de.ballaci.springdatacollege.repositories.DepartmentRepository;
import de.ballaci.springdatacollege.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Armand.Ballaci
 */

@RestController
@RequestMapping("/departments")
public class DepartmentWebServices {
    private final DepartmentRepository repository;

    public DepartmentWebServices(DepartmentRepository repository) {
        super();
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Department> getAllGuests() {
        return this.repository.findAll();
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") String id) {
        return this.repository.findById(id).get();
    }
}
