package com.yws.server.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yangweisen on 2017/3/15.
 */
@Table(name = "good")
public class Good extends BaseDTO{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer goodId;
    private String goodName;
    private Integer categoryId;
    private int number;
    private Double price;
    private String description;
    private String image;

    public Integer getGoodId() {
        return goodId;
    }

    public Good setGoodId(Integer goodId) {
        this.goodId = goodId;
        return this;
    }

    public String getGoodName() {
        return goodName;
    }

    public Good setGoodName(String goodName) {
        this.goodName = goodName;
        return this;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public Good setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public Good setNumber(int number) {
        this.number = number;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Good setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Good setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Good setImage(String image) {
        this.image = image;
        return this;
    }
}
