package com.Spring01.test;

import com.Spring01.dao.UserDao;
import com.Spring01.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start03 {
    public static void main(String[] args) {

        //1.加载总配置资源文件，对要交给IOC实例化的Bean类进行信息获取，Spring框架的底层采用的是list和map实现,且bean对象是单例的
        ApplicationContext ac = new ClassPathXmlApplicationContext("total.xml");

        //2.通过资源配置文件，交给IOC进行控制反转制造实例
        UserService userService = (UserService)ac.getBean("userService");   //对象1
        UserDao userDao = (UserDao)ac.getBean("userDao");

        //3.调用通过IOC容器制造出来的动态代理对象的属性或者方法
        userService.test();
        userDao.testUserDao();
    }
}
