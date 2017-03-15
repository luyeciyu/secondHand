package com.yws.server.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yangweisen on 2017/3/15.
 */
//需求
@Table(name = "requirement")
public class Requirement extends BaseDTO{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer requirementId;
    private String title;
    private String description;
    private Integer userId;
    private int priority;

    public Integer getRequirementId() {
        return requirementId;
    }

    public Requirement setRequirementId(Integer requirementId) {
        this.requirementId = requirementId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Requirement setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Requirement setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public Requirement setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public int getPriority() {
        return priority;
    }

    public Requirement setPriority(int priority) {
        this.priority = priority;
        return this;
    }
}
