package com.xc.shiro.chapter13.dao;


import com.xc.shiro.chapter13.entity.User;

import java.util.Set;

/**
 * XXXXXXXXXXXXXXXXXXXXX
 *
 * @author xiachuan at 2017/12/13 22:34。
 */

public interface UserDao {

     User createUser(User user);
     void updateUser(User user);
     void deleteUser(Long userId);

     void correlationRoles(Long userId, Long... roleIds);
     void uncorrelationRoles(Long userId, Long... roleIds);

    User findOne(Long userId);

    User findByUsername(String username);

    Set<String> findRoles(String username);

    Set<String> findPermissions(String username);
}

