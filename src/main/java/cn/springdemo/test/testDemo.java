package cn.springdemo.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDemo {

    @Test
   public  void test01() {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
       Demo demo = (Demo) context.getBean("demo");
       System.out.println(demo.toString());

   }
}
