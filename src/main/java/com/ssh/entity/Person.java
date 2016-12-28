package com.ssh.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by lanling on 2016/12/27.
 */
@Entity
@Table(name = "tb_person", schema = "test2", catalog = "")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private Date birth;

    private char gender;

    private boolean married;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }


    ///////////////////////////////////////////////////////////
    @OneToOne(mappedBy = "person")
    private IDCard idCard;
    public IDCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }

}
