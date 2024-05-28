package com.itheima.service;

import com.itheima.model.domain.User;
import com.itheima.model.domain.UserAuthority;
import com.itheima.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 梁松涛
 * @version 1.0
 **/
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public void saveUser(User user){
        userRepository.save(user);
    }

    public User getUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }

}
