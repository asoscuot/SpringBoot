package com.itheima.repository;

import com.itheima.model.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 梁松涛
 * @version 1.0
 **/
public interface UserRepository extends JpaRepository<User,Long> {

}
