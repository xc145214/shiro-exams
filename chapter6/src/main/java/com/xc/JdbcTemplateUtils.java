package com.xc;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Administrator on 2015/11/10.
 */
public class JdbcTemplateUtils {

    private static JdbcTemplate jdbcTemplate;
    public static JdbcTemplate jdbcTemplate() {
        if(jdbcTemplate == null) {
            jdbcTemplate = createJdbcTemplate();
        }
        return jdbcTemplate;
    }

    private static JdbcTemplate createJdbcTemplate() {

        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3309/shiro");
        ds.setUsername("root");
        ds.setPassword("123456");

        return new JdbcTemplate(ds);
    }

}
