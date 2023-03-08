package com.login.userlogin.service.Implementation;

import com.login.userlogin.model.User;
import com.login.userlogin.repo.UserRepo;
import com.login.userlogin.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImplementation implements UserService {
	@Autowired
    private UserRepo userRepo;
    @Override
    public User create(User user) {
        return userRepo.save(user);
    }
	@Override
	public boolean delete(Long id) {
		userRepo.deleteById(id);
		return true;
	}
}
