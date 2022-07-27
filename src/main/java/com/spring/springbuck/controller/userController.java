package com.spring.springbuck.controller;

import com.spring.springbuck.entity.User;
import com.spring.springbuck.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @author： wcs
 * @date： 2022-07-27 17:56
 */
@RestController
@RequestMapping("userController")
public class userController  {
    @Resource
    private UserService userService;

    /**
     * 通过注解方式
     * @return
     */
    @GetMapping("getUser")
    public User getUser(){
      return   userService.getUserLis();
    }

    /**
     * 通过xml的方式进行注入
     */
    @GetMapping("fetBeans")
    public void fetBeans(){
        org.springframework.core.io.Resource resource =  new ClassPathResource("beans.xml");
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
