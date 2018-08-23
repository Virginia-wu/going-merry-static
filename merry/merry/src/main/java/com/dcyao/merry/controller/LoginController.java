package com.dcyao.merry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dcyao on 2018/8/22.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {
    // 首页登录
    @RequestMapping(value = "/")
    public String login() {
        return "login/index";
    }


    // 登出
    @RequestMapping(value = "/logout")
    public String loginout() {

        return "login/index";
    }
}
