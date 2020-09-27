package com.xxt.spring.validate.config;

import com.xxt.spring.validate.beans.PersonForm;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class ValidateConfig {

    @Bean
    public LocalValidatorFactoryBean localValidatorFactoryBean(){
        return new LocalValidatorFactoryBean();
    }

    @Bean
    public PersonForm personForm(){
        PersonForm personForm = new PersonForm();
        personForm.setAge(-1);
        personForm.setName("");
        personForm.setEmail("45442515@qq.com");
        return personForm;
    }

}
