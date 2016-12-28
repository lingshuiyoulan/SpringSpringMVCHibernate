package com.ssh.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeptTest {

    @Test
    public void fun() {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");

        SessionFactory sessionFactory = (SessionFactory) act.getBean("sessionFactory");

        Session session = sessionFactory.openSession();

        Dept dept = new Dept(4,"dd","dd");

        session.save(dept);

        System.out.println(dept);
    }
}