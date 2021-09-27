package com.Spring01.service;

import com.Spring01.dao.StudentDao;
import com.Spring01.dao.UserDao;

import java.util.List;

public class UserService {

    //进行对象注入,
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //对象注入
    private StudentDao studentDao;
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    //常用类型对象注入
    private String string;
    public void setString(String string) {
        this.string = string;
    }



    //list对象注入
    private List<String> list;
    public void setList(List<String> list) {
        this.list = list;
    }



    public void printfList(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void test(){
        System.out.println("让我杰哥康康");
        //调用UserDao的方法
        userDao.testUserDao();

        //调用studnetDao对象的成员方法,studnetDao实例由Spring创建
        studentDao.test();

        System.out.println("字符串是"+string);

        //让Spring框架能通过依赖注入以及配合IOC容器能在需要时，自动诞生list对象
        printfList();
    }


}
