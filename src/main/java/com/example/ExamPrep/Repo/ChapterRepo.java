package com.example.ExamPrep.Repo;

import com.example.ExamPrep.Entity.Chapter;
import com.example.ExamPrep.Entity.ExamType;
import com.example.ExamPrep.Entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChapterRepo extends JpaRepository<Chapter, Long> {
    List<Chapter> findBySubject_Id(Long subjectId);
    // Or using the Subject object
    List<Chapter> findBySubject(Subject subject);

    // For examType - you need to go through the Subject relationship
    List<Chapter> findBySubject_ExamType(ExamType examType);

    // Combined query
    List<Chapter> findBySubject_IdAndSubject_ExamType(Long subjectId, ExamType examType);
}