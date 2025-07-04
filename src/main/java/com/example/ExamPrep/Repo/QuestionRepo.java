package com.example.ExamPrep.Repo;

import com.example.ExamPrep.Entity.Question;
import com.example.ExamPrep.Entity.QuestionSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Long> {
//    List<Question> findBySubjectId(Long sid);
//    List<Question> findBySubjectIdAndTopic(Long sid, String topic);
//    List<Question> findBySubjectIdAndSourceType(Long sid, QuestionSource sourceType);
}