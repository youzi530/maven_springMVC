package controller;

import exception.MyslefException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exception")
public class ExceptionController {

    @RequestMapping("/testException")
    public String testException() throws MyslefException {
        System.out.println("testException执行了...");
        try {
            int i= 10/0; //模拟异常
        } catch (Exception e) {
            //打印异常信息
            e.printStackTrace();
            //向上抛出自定义异常
            throw new MyslefException("查询所有的用户出现异常");
        }
        return "success";
    }
}
