package com.xxt.spring.ioc.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configurable
//@Import()
@ImportResource(value = "classpat*:applicationContext.xml")
public class SimpleConfiguration {


}
