package com.example312.service;

import com.example312.model.User;

import java.util.List;

public interface UserService {

   public void saveUser(User user);

   public void updateUser(long id,User user);

   public User getUserById(long id);

   public void removeUserById(long id);

   public List<User> getAllUsers();

}


