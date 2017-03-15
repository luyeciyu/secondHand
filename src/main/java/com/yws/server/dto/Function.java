package com.yws.server.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yangweisen on 2017/3/15.
 */
@Table(name = "function")
public class Function extends BaseDTO{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer functionId;
    private String title;
    private Integer level;

    public Integer getFunctionId() {
        return functionId;
    }

    public Function setFunctionId(Integer functionId) {
        this.functionId = functionId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Function setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public Function setLevel(Integer level) {
        this.level = level;
        return this;
    }
}
