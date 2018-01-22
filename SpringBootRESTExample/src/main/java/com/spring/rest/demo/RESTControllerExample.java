package com.spring.rest.demo;

import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTControllerExample {
    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public Collection<Employee> getEmployeeNames() {
        return EmployeeSource.getEmployees();
    }

}
