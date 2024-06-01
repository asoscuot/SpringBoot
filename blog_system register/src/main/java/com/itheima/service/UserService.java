package com.itheima.service;

import com.itheima.model.domain.User;
import com.itheima.model.domain.UserAuthority;
import com.itheima.repository.UserAuthorityRepository;
import com.itheima.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 梁松涛
 * @version 1.0
 **/
/**
 * @author 梁松涛
 * @version 1.0
 **/
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserAuthorityRepository userAuthorityRepository;


    public void saveUser(User user){
        userRepository.save(user);

        UserAuthority userAuthority = new UserAuthority();
        userAuthority.setUserId(user.getId());
        userAuthority.setAuthorityId(2L); // 默认authority_id=2
        userAuthorityRepository.save(userAuthority);
    }

    public User getUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }

    // 可以添加其他操作用户信息的方法，比如删除用户、更新用户信息等。

}
