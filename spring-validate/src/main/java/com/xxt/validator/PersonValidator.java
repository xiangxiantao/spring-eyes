package com.xxt.validator;

import com.xxt.beans.Person;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @description: com.xxt.validator
 * @author: haytt.xiang
 * @date: 2020-09-24 10:03
 **/
public class PersonValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(Person.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name是空滴");
        Person person = (Person) target;
        if (person.getAge()< 0 ){
            errors.rejectValue("age", "negativeValue", "非法年龄");
        }else if (person.getAge()> 10){
            errors.rejectValue("age", "age too old", "年级太大");
        }
    }
}
