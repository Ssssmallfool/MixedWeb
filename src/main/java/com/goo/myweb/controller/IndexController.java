package com.goo.myweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {


    @RequestMapping("/")
    String home(){
        return "hello this is index";
    }
}
