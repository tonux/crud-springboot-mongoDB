package com.sn.tonux.dao;

import com.sn.tonux.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends MongoRepository<User, Integer> {


}
