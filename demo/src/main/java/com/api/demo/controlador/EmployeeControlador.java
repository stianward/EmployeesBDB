package com.api.demo.controlador;

import com.api.demo.dto.EmployeeDTO;
import com.api.demo.entity.Employee;
import com.api.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/emp")
public class EmployeeControlador {
@Autowired
    EmployeeService employeeService;

    //Lista todos los employees
    @GetMapping("/listEmployee")

    public ResponseEntity<List<Employee>> listEmployees(){
        List<Employee> employees=employeeService.listEmployees();
        return new ResponseEntity(employees, HttpStatus.OK);
    }

    //Crea un employee

    @PostMapping("/makeEmployee")
    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeDTO employeeDTO){
        Employee newEmployee= new Employee(employeeDTO.getFullName(),employeeDTO.getFunctionEmployee());
        employeeService.makeEmployee(newEmployee);
        return ResponseEntity.ok(newEmployee) ;

    }

    //Borra un employee por id

    @DeleteMapping(value="/deleteEmployee/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable("id") Integer employeeId){
        employeeService.deleteEmploye(employeeId);
        return ResponseEntity.ok(null) ;

    }


}
