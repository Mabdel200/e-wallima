package com.mycompany.service;

import com.mycompany.db.UserRepository;
import com.mycompany.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //get all list of user
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //get one user
    public Optional<User> getUserById(long id_users) {
        return userRepository.findById(id_users);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(User user) {
        Optional<User> UserDB = this.userRepository.findById(user.getId_users());

        if(UserDB.isPresent()) {
            userRepository.save(user);
        }
    }


    public void deleteUser(long id_users) {
        Optional<User> userDb = this.userRepository.findById(id_users);

        userDb.ifPresent(user -> userRepository.delete(user));

    }





}
