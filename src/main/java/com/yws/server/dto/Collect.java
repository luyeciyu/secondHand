package com.yws.server.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yangweisen on 2017/3/15.
 */
@Table(name = "collect")
public class Collect extends BaseDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer collectId;
    private Integer userId;
    private Integer goodId;

    public Integer getCollectId() {
        return collectId;
    }

    public Collect setCollectId(Integer collectId) {
        this.collectId = collectId;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public Collect setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public Collect setGoodId(Integer goodId) {
        this.goodId = goodId;
        return this;
    }
}
