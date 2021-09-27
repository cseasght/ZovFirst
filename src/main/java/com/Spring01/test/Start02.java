package com.Spring01.test;

import com.Spring01.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start02 {
    public static void main(String[] args) {

        //1.加载多个配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml","beans.xml");

        //2.通过指定的id，获得对应的bean的实例化对象;
        UserDao userDao = (UserDao)ac.getBean("userDao");

        //3.调用动态代理的对象的方法
        userDao.testUserDao();

    }
}
