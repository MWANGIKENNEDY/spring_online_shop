package com.mywebapp.api.webapi.repositories;

import com.mywebapp.api.webapi.models.Users;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<Users,Long> {
    
    @Query("select u from Users u where u.username=:username")
    public List<Users> checkUsername(String username);
    
    @Query("select u from Users u where u.password=:password")
    public List<Users> checkEmail(String password);
       
}
