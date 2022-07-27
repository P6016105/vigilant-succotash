package com.spring.task;

import com.spring.springbuck.entity.User;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SpringBootTest
class TaskApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    public void test() {
        Resource resource =  new ClassPathResource("beans.xml");
        BeanFactory bean = new XmlBeanFactory(resource);
        // 获得实例
        User user1 = (User) bean
                .getBean("user1");
        System.out.println(user1);

        // 获得person2实例
        User user2 = (User) bean
                .getBean("user2");
        System.out.println(user1);
        // 获得person2实例
        User user3 = (User) bean
                .getBean("user3");
        System.out.println(user3);
    }
}
