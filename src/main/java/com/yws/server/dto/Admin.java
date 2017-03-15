package com.yws.server.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yangweisen on 2017/3/15.
 */
@Table(name = "admin")
public class Admin extends BaseDTO{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adminId;
    private String name;
    private String password;


    public Integer getAdminId() {
        return adminId;
    }

    public Admin setAdminId(Integer adminId) {
        this.adminId = adminId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Admin setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Admin setPassword(String password) {
        this.password = password;
        return this;
    }
}
