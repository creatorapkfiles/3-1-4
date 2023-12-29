//package ru.kata.spring.boot_security.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import ru.kata.spring.boot_security.demo.model.User;
//import ru.kata.spring.boot_security.demo.service.UserService;
//
//import java.util.List;
//
//@RestController
//public class RestUserController {
//    private final UserService us;
//
//    @Autowired
//    public RestUserController(UserService us) {
//        this.us = us;
//    }
//
//    @GetMapping("admin")
//    List<User> allUsers() {
//        return us.allUser();
//    }
//
//    @PostMapping("admin/add")
//    void newUser(@RequestBody User newUser) {
//        us.addUser(newUser);
//    }
//
//}
