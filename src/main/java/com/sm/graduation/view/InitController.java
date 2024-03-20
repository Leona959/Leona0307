package com.sm.graduation.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;


@Controller
public class InitController {

    /** 登录跳转 **/
    @GetMapping("/")
    public String hello(HttpSession session) {
        session.invalidate();
        return "hello";
    }
    /** 登录跳转 **/
    @GetMapping("/login")
    public String login(HttpSession session) {
        session.invalidate();
        return "login";
    }

    /** 首页跳转 **/
    @GetMapping("/indexR")
    public String indexr() {
        return "index-root";
    }
    @GetMapping("/indexA")
    public String indexa() {
        return "index-nurse";
    }
    @GetMapping("/indexU")
    public String indexu() {
        return "index-usr";
    }

    /** 404跳转 **/
    @GetMapping("/404")
    public String error() {
        return "page/404";
    }



}
