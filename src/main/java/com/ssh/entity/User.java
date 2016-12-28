package com.ssh.entity;

import org.hibernate.annotations.IndexColumn;

import javax.persistence.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "tb_user")
public class User {
    private int id;
    private String name;
    private String pass;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "pass")
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    ///////////////////////////////////////////////////////////////////////////////
    private Set<String> names;

    @ElementCollection
    @JoinTable(name = "tb_user_name",joinColumns = {@JoinColumn(name = "user_id")})
    @Column(name = "set_value")
    public Set<String> getNames() {
        return names;
    }

    public void setNames(Set<String> names) {
        this.names = names;
    }


    private List<String> list;

    @ElementCollection
    @JoinTable(name = "tb_user_list",joinColumns = {@JoinColumn(name = "user_id")})
    @Column(name = "list_value")
    @IndexColumn(name = "list_index")
    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @ElementCollection
    @JoinTable(name = "tb_user_map",joinColumns = {@JoinColumn(name = "user_id")})
    @Column(name = "map_value")
    @MapKeyColumn(name = "map_key")
    public Map<String, String> getMap() {
        return map;
    }

    private Map<String,String> map ;

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
