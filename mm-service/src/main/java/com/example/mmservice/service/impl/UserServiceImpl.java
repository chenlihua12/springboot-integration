package com.example.mmservice.service.impl;

import com.example.mmentity.entity.User;
import com.example.mmrepo.dao.UserRepository;
import com.example.mmservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: xu gang feng
 * @create: 2019-11-05 16:13
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;


    @Override
    public List<User> list() {
        return userRepository.findAll();
    }
}
