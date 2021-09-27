package com.Spring01.test;

import com.Spring01.service.UserService;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start01 {
    public static void main(String[] args) {
        //1.获得spring上下文环境
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

        //2.通过ID属性值，得到指定的bean对象
        UserService userService = (UserService) ac.getBean("userService");


        //3.调用实例化好的javabean对象中的方法
        userService.test();

    }
}
