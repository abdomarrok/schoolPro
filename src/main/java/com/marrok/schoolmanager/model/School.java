package com.marrok.schoolmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "school")
public class School {
    @Id
    @Column(name = "schoolName", nullable = false)
    private String schoolName;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "phone", nullable = false)
    private Integer phone;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

}