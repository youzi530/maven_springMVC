package controller;

import domain.Account;
import domain.AccountList;
import domain.Custom;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 请求参数绑定
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    /**
     * 零散数据--请求参数绑定入门
     * @return
     */
    @RequestMapping("/testParam")
    public String testParam(String username,String password){
        System.out.println("testParam执行了。。。");
        System.out.print("用户名："+username);
        System.out.print(" 密码："+password);
        return "success";
    }

    /**
     * 数据封装到javaBean实体类 --请求参数绑定
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("saveAccount执行了。。。");
        System.out.println(account);
        return "success";
    }

    /**
     * 数据封装到javaBean实体类的集合中去 --请求参数绑定
     * @return
     */
    @RequestMapping("/saveAccounttoList")
    public String saveAccounttoList(AccountList accountList){
        System.out.println("saveAccounttoList执行了。。。");
        System.out.println(accountList);
        return "success";
    }

    /**
     * 自定义类型转换器
     * @return
     */
    @RequestMapping("/saveCustom")
    public String saveCustom(Custom custom){
        System.out.println("saveCustom执行了。。。");
        System.out.println(custom);
        return "success";
    }
}
