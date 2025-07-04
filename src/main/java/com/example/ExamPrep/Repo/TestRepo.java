package com.example.ExamPrep.Repo;

import com.example.ExamPrep.Entity.QuizStatus;
import com.example.ExamPrep.Entity.TestSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepo extends JpaRepository<TestSession, Long> {
//    List<TestSession> findByUserId(Long userId);
//    List<TestSession> findByUserIdAndStatus(Long userId, QuizStatus status);
//    List<TestSession> findByUserIdOrderByStartTimeDesc(Long userId);
//    List<TestSession> findBySubjectId(Long subjectId);
}