package com.login.userlogin.service;

import com.login.userlogin.model.User;

public interface UserService {
    User create(User user);

    boolean delete(Long id);

    boolean login(String name, String password);
}
