package com.example.ExamPrep.Repo;

import com.example.ExamPrep.Entity.UserAttempt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserAttemptRepo extends JpaRepository<UserAttempt, Long> {
}