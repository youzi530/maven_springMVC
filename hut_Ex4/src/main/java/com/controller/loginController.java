package com.controller;

import com.domain.Login;
import com.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@Controller
@RequestMapping("login")
public class loginController {

    @Autowired
    private loginService loginService;


    @RequestMapping("/testLogin")
    public String  testLogin(Login user, HttpServletRequest request) throws IOException {
        System.out.println(user.getName()+" "+user.getPassword());
        Login login = loginService.findByNameAndPassword(user);
        if (login == null)
            return "error";
        else{
            //把用户存入request域，在jsp中使用
            request.setAttribute("user",login);
            HttpSession session = request.getSession();
            session.setAttribute("user",login);
            return "main";
        }
    }

}
