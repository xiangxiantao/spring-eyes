package com.xxt.spring.beanWarpper.propertyEditor;

import com.xxt.spring.beanWarpper.beans.Employee;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {

    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(Employee.class, new EmployeeEditor());
    }

}
