package com.marrok.schoolmanager.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stud_ID", nullable = false)
    private Integer id;

    @Column(name = "fname", nullable = false)
    private String fname;

    @Column(name = "lname", nullable = false)
    private String lname;

    @Column(name = "year", nullable = false)
    private Integer year;

    @Column(name = "contact", nullable = false)
    private Integer contact;

    @Column(name = "gender", nullable = false)
    private Boolean gender = false;

    @Column(name = "class_rooms", nullable = false)
    private Integer classRooms;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Integer getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(Integer classRooms) {
        this.classRooms = classRooms;
    }

}