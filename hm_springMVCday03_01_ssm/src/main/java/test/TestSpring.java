package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.AccountService;

/**
 * 测试spring配置：
 */
public class TestSpring {

    @Test
    public void test(){
        //加载spring配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:springConfig.xml");
        //获取对象
        AccountService as = ac.getBean("accountService", AccountService.class);
        //调用方法
        as.findAll();
    }
}
