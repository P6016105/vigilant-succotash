package com.string.springbuck.service.impl;


import com.spring.springbuck.entity.User;
import com.spring.springbuck.service.UserService;
import org.springframework.stereotype.Repository;

/**
 * @version 1.0
 * @author： wcs
 * @date： 2022-07-27 17:51
 */
@Repository
public class UserServiceimpl implements UserService {

    @Override
    public User getUserLis() {
        User user = new User();
        user.setAge(12);
        user.setName("哈喽");
        user.setSex("女");
        return user;
    }
}
