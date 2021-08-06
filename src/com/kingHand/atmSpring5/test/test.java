package com.kingHand.atmSpring5.test;

import com.kingHand.atmSpring5.config.TxConfig;
import com.kingHand.atmSpring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService=context.getBean("userService",UserService.class);
        userService.transfer(620000,620001,100);
    }
    @Test
    public void test1(){
        ApplicationContext context=new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService=context.getBean("userService",UserService.class);
        userService.transfer(620000,620001,100);
    }

}
