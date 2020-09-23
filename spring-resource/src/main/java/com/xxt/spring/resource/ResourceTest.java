package com.xxt.spring.resource;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;

/**
 * @description: com.xxt.spring.resource
 * @author: haytt.xiang
 * @date: 2020-09-23 17:25
 **/
public class ResourceTest {

    public static void main(String[] args) {
        urlResourceTest();
        //fileResourceTest();
    }

    public static void fileResourceTest(){
        FileSystemResource fileSystemResource = new FileSystemResource("/Users/haytt.xiang/Dev/spring-eyes/spring-ioc/src/main/resources/application.properties");
        System.out.println(fileSystemResource.getFile().exists());
    }

    public static void urlResourceTest(){
        try {
            UrlResource urlResource = new UrlResource("http://www.baidu.com");
            System.out.println(urlResource.exists());
            System.out.println(urlResource.getInputStream().available());
            System.out.println(urlResource.getDescription());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
