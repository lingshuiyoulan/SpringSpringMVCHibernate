package com.ssh.dao.impl;

import com.ssh.entity.Dept;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lanling on 2016/12/28.
 */
@Repository
@Transactional
public class DeptDaoImpl implements com.ssh.dao.DeptDao {

    @Autowired
    private SessionFactory factory;

    private Session getSession(){
        return factory.getCurrentSession();
    }

    public List<Dept> selectAll(){
        String hql = "from Dept";
        Query<Dept> query = getSession().createQuery(hql,Dept.class);
        return query.list();
    }

    public Dept selectById(Integer id){
        return getSession().get(Dept.class,id);
    }

    public Serializable insert(Dept dept){
        return getSession().save(dept);
    }
}
