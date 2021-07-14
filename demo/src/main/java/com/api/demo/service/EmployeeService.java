package com.api.demo.service;

import com.api.demo.entity.Employee;
import com.api.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class EmployeeService {

@Autowired
    EmployeeRepository employeeRepository;

//Creamos metodos que operación

    public List<Employee> listEmployees(){
        return employeeRepository.findAll();
    }

    public void deleteEmploye(int id){ employeeRepository.deleteById(id);
    }
    public void makeEmployee(Employee employee){
        employeeRepository.save(employee);
}
    }
