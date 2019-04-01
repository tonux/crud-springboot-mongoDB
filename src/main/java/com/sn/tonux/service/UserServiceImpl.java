package com.sn.tonux.service;

import com.sn.tonux.dao.UserDao;
import com.sn.tonux.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    UserDao dao;


    @Override
    public void createUser(List<User> user) {
        dao.saveAll(user);
    }


    @Override
    public Collection<User> getAllUsers() {
        return dao.findAll();
    }


    @Override
    public Optional<User> findUserById(int id) {
        return dao.findById(id);
    }


    @Override
    public void deleteUserById(int id) {
        dao.deleteById(id);
    }


    @Override
    public void updateUser(User emp) {
        dao.save(emp);
    }


    @Override
    public void deleteAllUsers() {
        dao.deleteAll();
    }
}
