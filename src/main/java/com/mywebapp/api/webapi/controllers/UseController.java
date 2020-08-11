package com.mywebapp.api.webapi.controllers;

import com.mywebapp.api.webapi.models.Users;
import com.mywebapp.api.webapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UseController {
    
    @Autowired
    UserService userService;
    
    //Register a new user
    @RequestMapping(value="/api/users/register",method=RequestMethod.POST)
    public ResponseEntity<Object> registerUser(@RequestBody Users users){
        if(!userService.checkUsername(users.getUsername()).isEmpty()){
            return new ResponseEntity<>("Username should be unique",HttpStatus.INTERNAL_SERVER_ERROR);   
        }
            userService.registerUser(users);
            return new ResponseEntity<>("User added",HttpStatus.CREATED);
    }
        
    //Get one user
    @RequestMapping(value="api/users/{id}",method=RequestMethod.GET)
    public ResponseEntity<Object> getOneUser(@PathVariable Long id){
        return new ResponseEntity<>(userService.getOneUser(id),
                HttpStatus.OK);}
         
}
