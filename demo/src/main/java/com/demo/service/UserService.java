package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public int totalUserCount() {
        return userDao.count();
    }
    public User getUserById(int id) {

        return userDao.getUser(id);
    }
}
