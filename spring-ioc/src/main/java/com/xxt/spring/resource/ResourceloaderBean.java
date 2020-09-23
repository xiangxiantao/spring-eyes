package com.xxt.spring.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * @description: com.xxt.spring.resource
 * @author: haytt.xiang
 * @date: 2020-09-23 16:47
 **/
@Component
public class ResourceloaderBean implements ResourceLoaderAware {

    @Autowired
    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

}
