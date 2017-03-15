package com.yws.server.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yangweisen on 2017/3/15.
 */
//管理员权限
@Table(name = "authority")
public class Authority extends BaseDTO{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer authorityId;
    private Integer adminId;
    private Integer functionId;

    public Integer getAuthorityId() {
        return authorityId;
    }

    public Authority setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
        return this;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public Authority setAdminId(Integer adminId) {
        this.adminId = adminId;
        return this;
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public Authority setFunctionId(Integer functionId) {
        this.functionId = functionId;
        return this;
    }
}
