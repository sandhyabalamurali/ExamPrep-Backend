package com.example.ExamPrep.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class TestSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;

    private double score;
    private LocalDateTime completedAt;

    @Enumerated(EnumType.STRING)
    private QuizStatus quizStatus;
    public TestSession(){

    }
    public TestSession(Long id, Users user, Chapter chapter, double score, LocalDateTime completedAt, QuizStatus quizStatus) {
        this.id = id;
        this.user = user;
        this.chapter = chapter;
        this.score = score;
        this.completedAt = completedAt;
        this.quizStatus = quizStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public QuizStatus getQuizStatus() {
        return quizStatus;
    }

    public void setQuizStatus(QuizStatus quizStatus) {
        this.quizStatus = quizStatus;
    }
}
