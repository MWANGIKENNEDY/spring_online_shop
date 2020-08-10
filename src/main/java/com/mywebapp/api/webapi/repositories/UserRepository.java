package com.mywebapp.api.webapi.repositories;

import com.mywebapp.api.webapi.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users,Long> {
    
}
