package fun.javaweb.common.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

/**
 * spring bean 配置类替代xml配置
 * @author 李幸
 * @date 2018/1/4
 * @time 22:17
 */
@Configuration
@EnableWebMvc
public class Config {


    static {
        System.out.println("显示则注入成功");
    }
    /**
     * 配置数据源
     * @return
     */
    @Bean
    public DataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/javawebfun");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("123qwe");
        return dataSource;
    }

}
