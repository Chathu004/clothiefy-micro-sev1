package org.iCET.controller;

import lombok.RequiredArgsConstructor;
import org.iCET.dto.User;
import org.iCET.entity.UserEntity;
import org.iCET.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    final UserService service;

    @PostMapping("/add")
    public void addUser(@RequestBody User user){
        service.addUser(user);
    }
    @GetMapping("/get")
    public Iterable<UserEntity> getUser(){
        return service.getUser();
    }
    @DeleteMapping("/remove/{id}")
    public String deleteUser(@PathVariable Long id){
         service.deleteUser(id);
         return "Deleted user successfully!";
    }
}
