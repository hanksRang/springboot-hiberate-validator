### 背景
本文目的是介绍如何使用Springboot mvc整合hibernate validator校验框架，本项目只介绍几种常用的校验注解用法，不做深入的探讨。

### 准备
Springboot 2.0.1版本，

### 核心包引入
由于Spring-boot-starter-web中已经集成了hibernate validator，所以只需要引入如下依赖即可：
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```