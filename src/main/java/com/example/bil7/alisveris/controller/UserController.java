package com.example.bil7.alisveris.controller;

import com.example.bil7.alisveris.entity.User;
import com.example.bil7.alisveris.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@CrossOrigin(origins = "http://localhost:3000/")
public class UserController {
    private final UserService userService;

    @GetMapping(value = "/login")
    public ResponseEntity<User> login(@RequestParam("user_name") String userName, @RequestParam("password") String password)
    {
        if (userService.findUser(userName, password) == null)
            return new  ResponseEntity<>(HttpStatus.NOT_FOUND);

        return new  ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "/register")
    public ResponseEntity<User> register(@RequestBody User user)
    {
        if (userService.saveUser(user) ==null)
        {
            return new  ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new  ResponseEntity<>(HttpStatus.OK);
    }
}
