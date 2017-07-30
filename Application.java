package cn.leizhang.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhangsanshi
 * 配置springboot的启动方式
 */
@SpringBootApplication
public class Application {
	
	public static void main(String [] args)
	{
		System.out.println("项目启动！");
		SpringApplication.run(Application.class, args);
		
	}
	
}
