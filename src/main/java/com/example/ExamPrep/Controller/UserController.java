package com.example.ExamPrep.Controller;

import com.example.ExamPrep.DTO.UserDto;
import com.example.ExamPrep.Entity.Users;
import com.example.ExamPrep.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*") // allow React access
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/get/{id}")
    public List<UserDto> getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/add")
    public Users createUser(@RequestBody Users user) {
        return userService.createUser(user);
    }

    @DeleteMapping("/del/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
