package com.example.ExamPrep.Service;
import com.example.ExamPrep.DTO.UserDto;
import com.example.ExamPrep.Entity.Users;
import com.example.ExamPrep.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;
    public List<UserDto> getAllUsers(){
        return repo.findAll().stream()
                .map(Users->new UserDto(
                        Users.getUserid(),
                        Users.getFirstName(),
                        Users.getLastName(),
                        Users.getEmail(),
                        Users.getExamType()
                ))
                .collect(Collectors.toList());
    }
    public List<UserDto> getUserById(long id){
        return repo.findById(id).stream()
                .map(Users->new UserDto(
                                Users.getUserid(),
                                Users.getFirstName(),
                                Users.getLastName(),
                                Users.getEmail(),
                                Users.getExamType()
                )).collect(Collectors.toList());
    }
    public Users createUser(Users user) {
        return repo.save(user); // password should be hashed in real app
    }

    public void deleteUser(Long id) {
        repo.deleteById(id);
    }
    public boolean isEmailTaken(String email) {
        return repo.existsByEmail(email);
    }
    public Users getUserByEmail(String email) {
        return repo.findByEmail(email).orElse(null);
    }


}
