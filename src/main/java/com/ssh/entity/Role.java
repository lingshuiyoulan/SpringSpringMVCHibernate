package com.ssh.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by lanling on 2016/12/28.
 */
@Entity
@Table(name = "tb_role")
public class Role {

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
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    /////////////////////////////////////////////////////

    @ManyToMany(mappedBy = "roles")
    private Set<AuthGroup> authGroups;

    public Set<AuthGroup> getAuthGroups() {
        return authGroups;
    }

    public void setAuthGroups(Set<AuthGroup> authGroups) {
        this.authGroups = authGroups;
    }
}
