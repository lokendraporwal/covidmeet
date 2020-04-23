package com.covidmeet.covidmeet.config;


import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/covidmeet");
        builder.username("postgres");
        builder.password("root");
        System.out.println("Custom datasource is initialized");
        return builder.build();
    }
}
