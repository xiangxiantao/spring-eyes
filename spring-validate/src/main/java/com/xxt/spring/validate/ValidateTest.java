package com.xxt.spring.validate;

import com.xxt.spring.validate.beans.Person;
import com.xxt.spring.validate.beans.PersonForm;
import com.xxt.spring.validate.config.ValidateConfig;
import com.xxt.spring.validate.validator.PersonValidator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Validator;

public class ValidateTest {

    public static void main(String[] args) {
        //testValidate();
        //testHibernateValidate();
        testHibernateDataBinderValidate();
    }

    /**
     * 自定义Validator进行校验
     */
    public static void testValidate(){
        //构造目标实例
        Person person = new Person();
        person.setAge(-1);
        person.setName("");

        //构造dataBinder
        DataBinder dataBinder = new DataBinder(person);
        //设置validator
        dataBinder.setValidator(new PersonValidator());
        //开始校验
        dataBinder.validate();
        //获取结果
        BindingResult bindingResult = dataBinder.getBindingResult();
        System.out.println(bindingResult);


    }

    /**
     * 通过Hibernate进行bean的校验
     */
    public static void testHibernateValidate(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValidateConfig.class);
        PersonForm personForm = context.getBean(PersonForm.class);
        Validator validator = context.getBean(Validator.class);

        BindException bindException = new BindException(personForm, "pf");
        validator.validate(personForm, bindException);
        System.out.println(personForm);
        System.out.println(bindException.getBindingResult());
        System.out.println(personForm.getAge());
    }

    /**
     * 利用dataBinder进行校验
     */
    public static void testHibernateDataBinderValidate(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValidateConfig.class);
        PersonForm personForm = context.getBean(PersonForm.class);
        Validator validator = context.getBean(Validator.class);
        DataBinder dataBinder = new DataBinder(personForm);
        dataBinder.setValidator(validator);
        dataBinder.validate();
        BindingResult bindingResult = dataBinder.getBindingResult();
        System.out.println(bindingResult);
    }

}
