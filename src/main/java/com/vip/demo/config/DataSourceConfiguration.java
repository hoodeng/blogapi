package com.vip.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by Allen on 2016/7/16.
 */
@Configuration
public class DataSourceConfiguration {
    @Bean(destroyMethod = "close", initMethod = "init")
    @ConfigurationProperties(prefix = "datasource.jdbc")
    public DataSource dataSource() {
        return new DruidDataSource();
    }
}
