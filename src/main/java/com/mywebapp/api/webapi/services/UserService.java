package com.mywebapp.api.webapi.services;

import com.mywebapp.api.webapi.models.Users;
import java.util.Optional;


public interface UserService {
    
    public void registerUser(Users users);
    
    public Optional<Users> getOneUser(Long id);
    
}
