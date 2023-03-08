package com.login.userlogin.repo;

import com.login.userlogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
