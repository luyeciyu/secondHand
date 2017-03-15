package com.yws.server.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yangweisen on 2017/3/15.
 */
//会员
@Table(name = "membership")
public class Membership extends BaseDTO{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer membershipId;
    private Integer userId;
    private String studentId; //学号
    private Integer collegeId; //学院ID
    private Integer specialityId; //专业ID
    private Integer creditRateId; //信誉ID

    public Integer getMembershipId() {
        return membershipId;
    }

    public Membership setMembershipId(Integer membershipId) {
        this.membershipId = membershipId;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public Membership setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getStudentId() {
        return studentId;
    }

    public Membership setStudentId(String studentId) {
        this.studentId = studentId;
        return this;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public Membership setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
        return this;
    }

    public Integer getSpecialityId() {
        return specialityId;
    }

    public Membership setSpecialityId(Integer specialityId) {
        this.specialityId = specialityId;
        return this;
    }

    public Integer getCreditRateId() {
        return creditRateId;
    }

    public Membership setCreditRateId(Integer creditRateId) {
        this.creditRateId = creditRateId;
        return this;
    }
}
