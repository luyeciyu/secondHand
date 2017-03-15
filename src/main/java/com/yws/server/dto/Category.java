package com.yws.server.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yangweisen on 2017/3/15.
 */
@Table(name = "category")
public class Category extends BaseDTO{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    private String categoryName;
    private String description;
    private Integer parentId;

    public Integer getCategoryId() {
        return categoryId;
    }

    public Category setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Category setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Category setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getParentId() {
        return parentId;
    }

    public Category setParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }
}
