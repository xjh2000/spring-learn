package org.xjh.spring.springLearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xjh.spring.springLearn.domain.User;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("user save ...");
        return "{'info':'springmvc'}";
    }

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name, Integer age) {
        System.out.println("普通参数: " + name + " age " + age);
        return "success";
    }

    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user) {
        System.out.println(user);
        return "success";
    }

}
