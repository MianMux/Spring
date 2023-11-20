package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {
    public static void main(String[] args){
//        获得容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = ac.getBean("user",User.class);
        System.out.println(user);
    }
}

