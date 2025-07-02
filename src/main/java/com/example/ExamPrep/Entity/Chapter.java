package com.example.ExamPrep.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String content;
    @OneToMany(mappedBy = "chapter", cascade = CascadeType.ALL)
    private List<Question> questions;
    public Chapter(){

    }

    public Chapter(Long cid, Subject subject, String name, String content, List<Question> questions) {
        this.cid = cid;
        this.subject = subject;
        this.name = name;
        this.content = content;
        this.questions = questions;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
