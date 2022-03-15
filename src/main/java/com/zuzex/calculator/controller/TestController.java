package com.zuzex.calculator.controller;

import com.zuzex.calculator.entity.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    User user = new User("Test", "test@mail.ru", "123");

}
