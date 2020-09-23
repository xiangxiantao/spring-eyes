package com.xxt.spring.resource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;

/**
 * @description: com.xxt.spring.resource
 * @author: haytt.xiang
 * @date: 2020-09-23 16:49
 **/
public class ResourceLoaderTest {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(ResourceLoaderConfig.class);
        ResourceloaderBean bean = configApplicationContext.getBean(ResourceloaderBean.class);
        ResourceLoader resourceLoader = bean.getResourceLoader();
        Resource resource = resourceLoader.getResource("classpath:application.properties");
        System.out.println(resource.getFilename());
        System.out.println(resource.getFile().getCanonicalPath());
    }

}
