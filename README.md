# SpringBootTest
这是一个简单的SpringBoot程序，利用maven构建，使用JDBCtemplate作为持久层框架，利用SpringBoot内嵌的thymeleaf进行数据渲染，实现了从本地数据库查询并利用页面进行数据显示
运行方法：
1导入maven项目后，运行cn.leizhang下的Application.class中的main方法；（框架内嵌了tomcat）
2打开浏览器输入网址localhost:8081/hello。
（注意，需要更改src/main/resources/config下的数据库url，username，password为自己的数据库配置，可以通过修改serve.port更改服务器端口号）