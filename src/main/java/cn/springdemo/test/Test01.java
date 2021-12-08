package cn.springdemo.test;

import cn.springdemo.greeting.Greeting;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void test() {
        // 通过ClassPathXmlApplicationContext显式地实例化Spring的上下文
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "context.xml");
        // 通过Greeting bean的id来获取bean的实例
        Greeting zhangGaSay = (Greeting) context.getBean("zhangGaSay");
        Greeting rodSay = (Greeting) context.getBean("rodSay");
        // 执行sayGreeting()方法
        zhangGaSay.sayGreeting();
        rodSay.sayGreeting();
    }
}
