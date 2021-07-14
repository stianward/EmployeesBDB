package com.api.demo.dto;

public class EmployeeDTO {


    private String fullName;
    private String functionEmployee;

    public EmployeeDTO() {

    }

    public EmployeeDTO(String fullName, String functionEmployee) {
        this.fullName = fullName;
        this.functionEmployee = functionEmployee;
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
