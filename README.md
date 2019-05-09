## flyway-springboot-demo
.
+ 概述
- 开发环境
+ 开发步骤
- 测试实践
+ 联系我

***

## 概述
这是一个介绍flyway的使用示例，如果你是flyway的新手，希望对你有所帮助

## 开发环境
开发工具:IntelliJ idea

java版本:1.8

flyway版本:5.2.4

springboot版本:2.1.4

mysql版本:5.7

## 开发步骤
### 1.创建springboot项目
你可以用idea或在springboot官网初始化项目，请注意添加web模块
### 2.添加maven
在pom中添加flyway依赖包

~~~	
<dependency>
	<groupId>org.flywaydb</groupId>
	<artifactId>flyway-core</artifactId>
	<version>5.2.4</version>
</dependency>
~~~
  
### 3.创建数据迁移目录
在classpath下创建db/migration目录

### 4.添加数据库配置
在application.yml中添加数据库配置
~~~
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/flyway?useUnicode=true&characterEncoding=utf8&useSSL=false
    username: root
    password: 123456
~~~

### 5.创建数据库
### 6.添加flyway执行api
	

## 测试实践

## 联系我
