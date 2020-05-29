package com.luo.feignclient.controller;

import com.luo.feignclient.service.SayHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @description:
 * @author: ljx
 * @create: 2020/05/27 16:48
 */
@RestController
public class SayHiController {

    @Autowired
    SayHiService sayHiService;

    @GetMapping("hi")
    public String sayHi(@RequestParam(defaultValue = "ljx") String name){
        return  sayHiService.sayHi(name);
    }
}