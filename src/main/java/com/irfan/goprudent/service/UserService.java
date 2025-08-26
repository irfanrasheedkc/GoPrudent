package com.irfan.goprudent.service;

import com.irfan.goprudent.model.User;

import java.util.List;

public interface UserService {
    List<User> get();

    User get(String email);

    void save(User user);

    void delete(String email);
}
