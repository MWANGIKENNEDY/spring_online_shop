package com.mywebapp.api.webapi.services;

import com.mywebapp.api.webapi.models.Users;
import com.mywebapp.api.webapi.repositories.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    
    //Dependency injection
    @Autowired
    UserRepository userRepository;

    @Override
    public void registerUser(Users users) {
        userRepository.save(users);    
    }

    @Override
    public Optional<Users> getOneUser(Long id) {
        return userRepository.findById(id);
    }
    
}
