package com.marrok.schoolmanager.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "student_inscription")
public class StudentInscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "insecription_ID", nullable = false)
    private Integer id;

    @Column(name = "student_ID", nullable = false)
    private Integer studentId;

    @Column(name = "session_id", nullable = false)
    private Integer sessionId;

    @Column(name = "registration_date", nullable = false)
    private LocalDate registrationDate;

    @Column(name = "price", nullable = false)
    private String price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}