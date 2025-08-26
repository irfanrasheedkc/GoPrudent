package com.irfan.goprudent.service;

import com.irfan.goprudent.dao.UserDAO;
import com.irfan.goprudent.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl  implements  UserService{

    @Autowired
    UserDAO userDAO;

    @Transactional
    @Override
    public List<User> get() {
        return userDAO.get();
    }

    @Transactional
    @Override
    public User get(String email) {
        return null;
    }

    @Transactional
    @Override
    public void save(User user) {

    }

    @Transactional
    @Override
    public void delete(String email) {

    }
}
