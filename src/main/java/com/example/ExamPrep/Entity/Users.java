package com.example.ExamPrep.Entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.batch.BatchTransactionManager;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Userid;
    @Column(nullable = false)
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Enumerated(EnumType.STRING)
    private ExamType examType;
    public Users(){

    }
    public Users(Long userid, String firstName, String lastName, String email, String password, ExamType examType) {
        Userid = userid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.examType = examType;
    }

    public Long getUserid() {
        return Userid;
    }

    public void setUserid(Long userid) {
        Userid = userid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ExamType getExamType() {
        return examType;
    }

    public void setExamType(ExamType examType) {
        this.examType = examType;
    }
}
