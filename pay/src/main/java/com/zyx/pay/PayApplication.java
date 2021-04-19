package com.zyx.pay;

import io.seata.rm.datasource.DataSourceProxy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan(basePackages = {"com.zyx.pay.mapper"})
public class PayApplication {

    public static void main(String[] args) {

        SpringApplication.run(PayApplication.class, args);
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(new DataSourceProxy(dataSource));
    }
}
