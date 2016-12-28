package com.ssh.service;

import com.ssh.entity.Dept;

import java.util.List;

/**
 * Created by lanling on 2016/12/28.
 */
public interface DeptService {
    Dept findDeptById(Integer id);

    List<Dept> findAll();

    boolean addDept(Dept dept);
}
