package controller;

import domain.Custom;
import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

/**
 *常用的注解
 */
@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"})  //把msg=美美存入到session域对中
public class AnnoController {

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(value = "uname") String username){
        System.out.println("testRequestParam执行了。。。");
        System.out.println(username);
        return "success";
    }

    /**
     * 获取到请求体的内容--RequestBody
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println("执行了...");
        System.out.println(body);
        return "success";
    }

    /**
     * PathVariable注解
     * @return
     */
    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(value = "sid") String id){
        System.out.println("执行了...");
        System.out.println(id);
        return "success";
    }

    /**
     * 获取请求头的值
     * @return
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader("Accept") String header){
        System.out.println("执行了...");
        System.out.println(header);
        return "success";
    }

    /**
     * CookieValue注解 --获取Cookie的值
     * @return
     */
    @RequestMapping(value="/testCookieValue")
    public String testCookieValue(@CookieValue(value="JSESSIONID") String cookieValue){
        System.out.println("执行了...");
        System.out.println(cookieValue);
        return "success";
    }

    /**
     * ModelAttribute注解1  --带有返回值的案例
     * @return
     */
//    @RequestMapping(value="/testModelAttribute")
//    public String testModelAttribute(Custom custom){
//        System.out.println("testModelAttribute执行了...");
//        System.out.println(custom);
//        return "success";
//    }
//    @ModelAttribute  //该方法先执行！！！
//    public Custom showUser(String uname){
//        System.out.println("showUser执行了...");
//        //通过用户名查询数据库（模拟）
//        Custom user = new Custom();
//        user.setUname(uname);
//        user.setAge(20);
//        user.setDate(new Date());
//        return user;
//    }

    /**
     * ModelAttribute注解2  --不带返回值，但是用map去接收
     * @return
     */
    @RequestMapping(value="/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") Custom custom){
        System.out.println("testModelAttribute执行了...");
        System.out.println(custom);
        return "success";
    }
    @ModelAttribute  //该方法先执行！！！
    public void showUser(String uname, Map<String,Custom> map){
        System.out.println("showUser执行了...");
        //通过用户名查询数据库（模拟）
        Custom user = new Custom();
        user.setUname(uname);
        user.setAge(20);
        user.setDate(new Date());
        map.put("abc",user);
    }

    /**
     * SessionAttributes --用于多次执行控制器方法间的参数共享  放在方法上
     * @return
     */
    @RequestMapping(value="/testSessionAttributes")
    public String testSessionAttributes(Model model){
        System.out.println("testSessionAttributes执行了...");
        model.addAttribute("msg","没灭怀发顺丰不爱舒服死扶iFUHS赴死阿FS啊"); //底层对象会存储到request、域对象中
        return "success";
    }

    /**
     * 获取Session域中的值
     * @param modelMap
     * @return
     */
    @RequestMapping(value="/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap){
        System.out.println("getSessionAttributes...");
        String msg = (String) modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }

    /**
     * 清除seesion域中的值
     * @param status
     * @return
     */
    @RequestMapping(value="/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status){
        System.out.println("getSessionAttributes...");
        status.setComplete();
        return "success";
    }

}
