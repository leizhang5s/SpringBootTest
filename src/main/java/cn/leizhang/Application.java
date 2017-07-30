package cn.leizhang;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import com.alibaba.druid.pool.DruidDataSource;
@SpringBootApplication
//如果不加此句则无法扫描到controller
//@ComponentScan("cn.leizhang")
public class Application {
	  @Autowired
	   private Environment env;
	public static void main(String [] args)
	{
		System.out.println("项目启动！");
		SpringApplication.run(Application.class, args);
		
	}
	
		@Bean  
	    public DataSource dataSource() {  
	        DruidDataSource dataSource = new DruidDataSource();  
	        dataSource.setUrl(env.getProperty("spring.datasource.url"));  
	        dataSource.setUsername(env.getProperty("spring.datasource.username"));//用户名  
	        dataSource.setPassword(env.getProperty("spring.datasource.password"));//密码  
	        dataSource.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));  
	        dataSource.setInitialSize(2);  
	        dataSource.setMaxActive(20);  
	        dataSource.setMinIdle(0);  
	        dataSource.setMaxWait(60000);  
	        dataSource.setValidationQuery("SELECT 1");  
	        dataSource.setTestOnBorrow(false);  
	        dataSource.setTestWhileIdle(true);  
	        dataSource.setPoolPreparedStatements(false);  
	        return dataSource;  
	    }  
}
