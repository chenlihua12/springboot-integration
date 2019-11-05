package com.example.mmweb.controller;

import com.example.mmentity.common.R;
import com.example.mmservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xu gang feng
 * @create: 2019-11-05 16:02
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userServiceImpl;

    @GetMapping("/list")
    public R list(){
        try {
            return R.isOk().data(userServiceImpl.list());
        } catch (Exception e) {
            return R.isFail(e);
        }
    }
}
