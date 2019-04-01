package com.github.jettyrun.springtag;

import com.github.jettyrun.springtag.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jetty on 18/1/30.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext beans=new ClassPathXmlApplicationContext("classpath:application-usertag.xml");
        User user=(User)beans.getBean("testBean");
        System.out.println("username:"+user.getUserName()+":"+"email:"+user.getEmail());
    }

}
