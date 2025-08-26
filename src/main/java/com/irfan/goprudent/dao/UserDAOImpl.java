package com.irfan.goprudent.dao;

import com.irfan.goprudent.model.User;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements  UserDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<User> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<User> query = currentSession.createQuery("from User",User.class);
        List<User> users = query.getResultList();
        return users;
    }

    @Override
    public User get(String email) {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void delete(String email) {

    }
}
