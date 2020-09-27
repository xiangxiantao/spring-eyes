package com.xxt.spring.data;

import com.xxt.spring.data.config.DataSourceConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class DataSourceTest {

    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(DataSourceConfig.class);
        DataSource dataSource = configApplicationContext.getBean(DataSource.class);
        System.out.println(dataSource.getConnection().isValid(3000));

    }

}
