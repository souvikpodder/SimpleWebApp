package com.souvy.app.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserLoginRepo extends JpaRepository<UserLogin, String>{

}