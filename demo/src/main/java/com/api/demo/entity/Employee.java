package com.api.demo.entity;

import javax.persistence.*;
import java.util.Random;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="fullname")
    private String fullName;
    @Column(name="function_employee")
    private String functionEmployee;

    public Employee(String fullName, String functionEmployee) {
        this.fullName = fullName;
        this.functionEmployee = functionEmployee;
    }

    public Employee() {
    }

    public Employee(Integer id, String fullName, String functionEmployee) {
        this.id = id;
        this.fullName = fullName;
        this.functionEmployee = functionEmployee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFunctionEmployee() {
        return functionEmployee;
    }

    public void setFunctionEmployee(String functionEmployee) {
        this.functionEmployee = functionEmployee;
    }


}
