package com.example.ExamPrep.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;
    private String name;
    @Enumerated(EnumType.STRING)
    private ExamType examType;
    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
    private List<Chapter> chapters;
    public Subject(){
    }
    public Subject(int sid, String name, ExamType examType) {
        this.sid = sid;
        this.name = name;
        this.examType = examType;
    }

    public long getId() {
        return sid;
    }

    public void setId(int id) {
        this.sid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExamType getExamType() {
        return examType;
    }

    public void setExamType(ExamType examType) {
        this.examType = examType;
    }
}
