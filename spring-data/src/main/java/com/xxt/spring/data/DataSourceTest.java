package com.xxt.spring.data;

import com.xxt.spring.data.config.DataSourceConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DataSourceUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataSourceTest {

    public static void getDataSource() throws SQLException {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(DataSourceConfig.class);
        DataSource dataSource = configApplicationContext.getBean(DataSource.class);
        System.out.println(dataSource.getConnection().isValid(3000));
        DataSourceTransactionManager transactionManager = configApplicationContext.getBean(DataSourceTransactionManager.class);
        System.out.println(transactionManager.getDataSource().getConnection().isValid(3000));
    }

    public static void getConnection() throws SQLException {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(DataSourceConfig.class);
        DataSource dataSource = configApplicationContext.getBean(DataSource.class);
        Connection connection = DataSourceUtils.getConnection(dataSource);
        PreparedStatement preparedStatement = connection.prepareStatement("");
    }
}
