package com.example.ExamPrep.Repo;

import com.example.ExamPrep.Entity.ExamType;
import com.example.ExamPrep.Entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepo extends JpaRepository<Subject,Integer> {
    List<Subject> findByExamType(ExamType examType);
}
