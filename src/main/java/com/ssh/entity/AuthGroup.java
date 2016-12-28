package com.ssh.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by lanling on 2016/12/28.
 */
@Entity
@Table(name = "tb_authgroup")
public class AuthGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

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

    @Override
    public String toString() {
        return "AuthGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    ////////////////////////////////////////////////////////////////

    @ManyToMany
    @JoinTable(name = "tb_authgroup_role",
            joinColumns = {@JoinColumn(name = "authgroup_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<Role> roles;

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
