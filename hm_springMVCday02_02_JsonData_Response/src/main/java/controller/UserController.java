package controller;

import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 返回String
     * @param model
     * @return
     */
    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString执行了。。");
        //模拟从数据库查询出数据User对象
        User user = new User();
        user.setUsername("美美");
        user.setPassword("12333");
        user.setAge(21);
        //model对象可以存储数据
        model.addAttribute("user",user);
        return "success";
    }

    /**
     * 返回void
     *  请求转发：一次请求，不用编写项目的名称
     *  重定向：两个请求，需要些项目的名称
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("testVoid执行了。。");
        //编写请求转发的程序
        //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);

        //重定向
        //response.sendRedirect(request.getContextPath()+"/WEB-INF/pages/success.jsp");   //重定向不能访问WEB-INF x
        //response.sendRedirect(request.getContextPath()+"/index.jsp");

        //直接进行响应
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print("你好");
        return;
    }

    /**
     * 返回ModelAndView
     * @return
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        // 创建ModelAndView对象
        ModelAndView mv = new ModelAndView();
        System.out.println("testModelAndView方法执行了...");
        // 模拟从数据库中查询出User对象
        User user = new User();
        user.setUsername("小凤");
        user.setPassword("456");
        user.setAge(30);

        // 把user对象存储到mv对象中，也会把user对象存入到request对象
        mv.addObject("user",user);

        // 跳转到哪个页面
        mv.setViewName("success");
        return mv;
    }


    /**
     * 使用关键字的方式进行转发或者重定向
     * @return
     */
    @RequestMapping("/testForWardOrRedirect")
    public String testForWardOrRedirect(){
        System.out.println("testForwardOrRedirect方法执行了...");

        // 请求的转发
        //return "forward:/WEB-INF/pages/success.jsp";

        // 重定向
        return "redirect:/index.jsp";
    }

    /**
     * 模拟异步请求与响应
     * @RequestBody拿到请求体
     *
     * @return
     */
    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println("testAjax方法执行了...");
        //前端发送的是ajax请求，穿的是json数据，后端把json数据封装到user对象中去
        System.out.println(user);  //拿到传过来的json数据

        //作响应，模拟查询数据库
        user.setUsername("哈哈");
        user.setAge(40);

        //作响应
        return user;

    }



}
