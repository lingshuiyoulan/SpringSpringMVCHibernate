package com.ssh.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by lanling on 2016/12/27.
 */
@Entity
@Table(name = "tb_idcard")
public class IDCard {

    @Id
    @GenericGenerator(name = "foreign",strategy = "foreign",parameters = {@org.hibernate.annotations.Parameter(name = "property",value = "person")})
    @GeneratedValue(generator = "foreign")
    private int id;

    private String address;

    public IDCard(String address, Person person) {
        this.address = address;
        this.person = person;
    }

    public IDCard(int id, String address, Person person) {
        this.id = id;
        this.address = address;
        this.person = person;
    }

    public IDCard() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "id=" + id +
                ", address='" + address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //////////////////////////////////////////////////////////////////
    @OneToOne(optional = false)
    @PrimaryKeyJoinColumn
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
