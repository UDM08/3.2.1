package com.example312.service;


import com.example312.model.User;
import com.example312.repositories.UserRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Transactional
    public void saveUser(User user) {
        userRepo.save(user);

    }

    @Transactional

    public void updateUser(Long id, User user) {
        user.setId(id);
        userRepo.save(user);
    }

    @Transactional

    public User getUserById(Long id) {
        Optional<User> foundUser = userRepo.findById(id);
        return foundUser.orElse(null);
    }

    @Transactional

    public void removeUserById(Long id) {
        userRepo.deleteById(id);

    }

    @Transactional

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}



