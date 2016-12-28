package com.ssh.service.impl;

import com.ssh.dao.DeptDao;
import com.ssh.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lanling on 2016/12/28.
 */
@Service
public class DeptServiceImpl implements com.ssh.service.DeptService {

    @Autowired
    private DeptDao deptDao;

    public Dept findDeptById(Integer id) {
        return deptDao.selectById(id);
    }

    public List<Dept> findAll() {
        return deptDao.selectAll();
    }

    public boolean addDept(Dept dept) {
        Serializable serializable = deptDao.insert(dept);
        return serializable != null;
    }
}

