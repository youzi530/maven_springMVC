package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器类
 */
@Controller("helloController")
@RequestMapping(path = "/user")
public class HelloController {

    /**
     * 入门案例
     * @return
     */
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("hello spring MVC");
        return "success";
    }

    /**
     * 测试RquestMapping注解
     * @return
     */
    @RequestMapping(path = "/testRquestMapping")
    public String testRquestMapping(){
        System.out.println("测试RquestMapping....");
        return "success";
    }
}
