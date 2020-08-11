package com.mywebapp.api.webapi.services;

import com.mywebapp.api.webapi.models.Users;
import java.util.List;
import java.util.Optional;

public interface UserService {
    //Register new user
    public void registerUser(Users users);
    //Get all users
    public List<Users> getAllUser();
    //Get one user
    public Optional<Users> getOneUser(Long id);
    //Check username
    public List<Users> checkUsername(String username);
}
