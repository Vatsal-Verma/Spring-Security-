package com.SpringSec.SpringSecEx.config;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.security.core.userdetails.User;
import com.SpringSec.SpringSecEx.config.Users;

public interface UserRepo extends JpaRepository<Users, Integer>{
    Users findByUsername(String username);
}
