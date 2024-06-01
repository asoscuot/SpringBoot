package com.itheima.repository;

import com.itheima.model.domain.UserAuthority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 梁松涛
 * @version 1.0
 **/
public interface UserAuthorityRepository extends JpaRepository<UserAuthority, Long> {
}