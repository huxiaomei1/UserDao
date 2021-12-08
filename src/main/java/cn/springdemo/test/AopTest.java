package cn.springdemo.test;

import cn.springdemo.entity.User;
import cn.springdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    @Test
    public void testAop () {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        UserService userService = (UserService) context.getBean("service");
        userService.addNewUser(new User());

        User user = (User) context.getBean("user1");
        System.out.println(user.toString());


    }




}
