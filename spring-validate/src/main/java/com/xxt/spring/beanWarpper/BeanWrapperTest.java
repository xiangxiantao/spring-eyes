package com.xxt.spring.beanWarpper;

import com.xxt.spring.beanWarpper.beans.Company;
import com.xxt.spring.beanWarpper.beans.Employee;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

public class BeanWrapperTest {

    public static void main(String[] args) {
        testBeanWrapper();
    }

    public static void testBeanWrapper(){
        BeanWrapper conpany = new BeanWrapperImpl(new Company());
        conpany.setPropertyValue("name", "xxt's company");

        BeanWrapper employee = new BeanWrapperImpl(new Employee());
        employee.setPropertyValue(new PropertyValue("name", "xxt"));

        conpany.setPropertyValue("managingDirector", employee.getWrappedInstance());

        System.out.println(conpany.getWrappedInstance());
        System.out.println(conpany.getWrappedClass());

    }
}
