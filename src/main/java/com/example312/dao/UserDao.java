package com.example312.dao;

import com.example312.model.User;

import java.util.List;

public interface UserDao {

    public void saveUser(User user);

    public void updateUser(long id,User user);

    public User getUserById(long id);

    public void removeUserById(long id);

    public List<User> getAllUsers();
}
