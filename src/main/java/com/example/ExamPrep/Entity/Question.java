package com.example.ExamPrep.Entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long qid;
    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;
    @Column(columnDefinition = "TEXT")
    private String questionText;
    @ElementCollection
    private List<String> options;
    private String correctAnswer;
    @Column(columnDefinition = "TEXT")
    private String explanation;
    @Enumerated(EnumType.STRING)
    private DifficultyLevel difficultyLevel;
    @Enumerated(EnumType.STRING)
    private ExamType examType;
    @Enumerated(EnumType.STRING)
    private QuestionSource questionSource;
    public Question(){

    }

    public Question(Long qid, Chapter chapter, String questionText, List<String> options, String correctAnswer, String explanation, DifficultyLevel difficultyLevel, ExamType examType, QuestionSource questionSource) {
        this.qid = qid;
        this.chapter = chapter;
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.explanation = explanation;
        this.difficultyLevel = difficultyLevel;
        this.examType = examType;
        this.questionSource = questionSource;
    }

    public Long getQid() {
        return qid;
    }

    public void setQid(Long qid) {
        this.qid = qid;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public ExamType getExamType() {
        return examType;
    }

    public void setExamType(ExamType examType) {
        this.examType = examType;
    }

    public QuestionSource getQuestionSource() {
        return questionSource;
    }

    public void setQuestionSource(QuestionSource questionSource) {
        this.questionSource = questionSource;
    }
}
