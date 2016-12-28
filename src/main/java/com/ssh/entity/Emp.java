package com.ssh.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "emp")
@NamedQuery(name = "selectAll", query = "from Emp")
public class Emp implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empno;
    private String job;
    private Integer mgr;
    private Float sal;
    private Float common;
    private Date hiredate;
    private String ename;

    public Emp() {
        super();
    }

    public Emp(String job, Integer mgr, Float sal, Float common, Date hiredate, String ename) {
        this.job = job;
        this.mgr = mgr;
        this.sal = sal;
        this.common = common;
        this.hiredate = hiredate;
        this.ename = ename;
    }

    public Emp(Integer empno, String ename, Float sal, Dept dept) {
        this.empno = empno;
        this.sal = sal;
        this.ename = ename;
        this.dept = dept;
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Float getSal() {
        return sal;
    }

    public void setSal(Float sal) {
        this.sal = sal;
    }

    public Float getCommon() {
        return common;
    }

    public void setCommon(Float common) {
        this.common = common;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", sal=" + sal +
                ", common=" + common +
                ", hiredate=" + hiredate +
                ", ename='" + ename + '\'' +
                ", dept=" + dept +
                '}';
    }

    /////////////////////////////////////////////////////////////////////

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "deptno")
//    @Transient
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}