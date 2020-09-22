package com.xxt.spring.code.config;

import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;

@Configuration
@ComponentScan()
@Conditional(value = MyCondition.class)
public class ConditionalConfig {
}

class MyCondition implements Condition{

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return false;
    }
}
