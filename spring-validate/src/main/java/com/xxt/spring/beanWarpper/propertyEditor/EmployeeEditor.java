package com.xxt.spring.beanWarpper.propertyEditor;

import com.xxt.spring.beanWarpper.beans.Employee;

import java.beans.PropertyEditorSupport;

public class EmployeeEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] strings = text.split(";");
        Employee employee = new Employee();
        employee.setName(strings[0].split(":")[1]);
        employee.setSalary(Integer.valueOf(strings[1].split(":")[1]));
        setValue(employee);
    }
}
