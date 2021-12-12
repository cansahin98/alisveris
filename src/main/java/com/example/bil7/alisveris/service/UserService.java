package com.example.bil7.alisveris.service;

import com.example.bil7.alisveris.entity.User;

public interface UserService {
    User findUser(String mail, String password);

    User saveUser(User user);
}
