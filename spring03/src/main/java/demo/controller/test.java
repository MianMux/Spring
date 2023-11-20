package demo.controller;

import demo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        // 1. 获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 从容器中获取对象
        UserService userService = ac.getBean("userService",UserService.class);
        Boolean flag = userService.login("zhangsan","1234");
        System.out.println(flag);
    }
}
