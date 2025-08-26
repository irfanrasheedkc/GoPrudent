package com.irfan.goprudent.dao;

import com.irfan.goprudent.model.User;

import java.util.List;

public interface UserDAO {

    List<User> get();

    User get(String email);

    void save(User user);

    void delete(String email);
}
