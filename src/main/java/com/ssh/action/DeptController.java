package com.ssh.action;

import com.ssh.entity.Dept;
import com.ssh.utils.String2DateTime;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;

@Controller
public class DeptController {

    @Autowired
    private SessionFactory factory;

    @RequestMapping("/dept/add")
    public String add(Model model, Dept dept) {

        Session session = factory.openSession();

        Serializable save = session.save(dept);

        model.addAttribute("res", save);

        return "/index.jsp";
    }
}
