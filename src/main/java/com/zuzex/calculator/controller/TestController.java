package com.zuzex.calculator.controller;

import com.zuzex.calculator.entity.Cargo;
import com.zuzex.calculator.entity.User;
import com.zuzex.calculator.service.CalcService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    User user = new User("Test", "test@mail.ru", "123");

    @PostMapping("/test")
    public double calculate(@RequestBody Cargo cargo){

        CalcService.parseJson(cargo);

        return -1;
    }
}
