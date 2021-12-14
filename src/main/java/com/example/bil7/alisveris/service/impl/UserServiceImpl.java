package com.example.bil7.alisveris.service.impl;


import com.example.bil7.alisveris.entity.User;
import com.example.bil7.alisveris.repo.UserRepo;
import com.example.bil7.alisveris.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService  {

    private final UserRepo repo;

    @Override
    public User findUser(String userName, String password) {
        return repo.findByUserNameAndPassword(userName, password);
    }

    @Override
    public User saveUser(User user) {
        if (repo.findById(user.getId()) != null)
        {
            return repo.save(user);
        }
        return null;
    }
}
