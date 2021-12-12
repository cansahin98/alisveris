package com.example.bil7.alisveris.repo;


import com.example.bil7.alisveris.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Long> {
    User findByUserNameAndPassword(String userName, String password);
}
