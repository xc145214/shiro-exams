package com.xc.shiro.chapter12.service.impl;


import com.xc.shiro.chapter12.dao.UserDao;
import com.xc.shiro.chapter12.dao.impl.UserDaoImpl;
import com.xc.shiro.chapter12.entity.User;
import com.xc.shiro.chapter12.service.PasswordHelper;
import com.xc.shiro.chapter12.service.UserService;

import java.util.Set;

/**
 * XXXXXXXXXXXXXXXXXXXXX
 *
 * @author xiachuan at 2017/12/13 22:49。
 */

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    private PasswordHelper passwordHelper;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setPasswordHelper(PasswordHelper passwordHelper) {
        this.passwordHelper = passwordHelper;
    }

    /**
     * 创建用户
     *
     * @param user
     */
    @Override
    public User createUser(User user) {
        //加密密码
        passwordHelper.encryptPassword(user);
        return userDao.createUser(user);
    }

    /**
     * 修改密码
     *
     * @param userId
     * @param newPassword
     */
    @Override
    public void changePassword(Long userId, String newPassword) {
        User user = userDao.findOne(userId);
        user.setPassword(newPassword);
        passwordHelper.encryptPassword(user);
        userDao.updateUser(user);
    }

    /**
     * 添加用户-角色关系
     *
     * @param userId
     * @param roleIds
     */
    @Override
    public void correlationRoles(Long userId, Long... roleIds) {
        userDao.correlationRoles(userId, roleIds);
    }


    /**
     * 移除用户-角色关系
     *
     * @param userId
     * @param roleIds
     */
    @Override
    public void uncorrelationRoles(Long userId, Long... roleIds) {
        userDao.uncorrelationRoles(userId, roleIds);
    }

    /**
     * 根据用户名查找用户
     *
     * @param username
     * @return
     */
    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    /**
     * 根据用户名查找其角色
     *
     * @param username
     * @return
     */
    @Override
    public Set<String> findRoles(String username) {
        return userDao.findRoles(username);
    }

    /**
     * 根据用户名查找其权限
     *
     * @param username
     * @return
     */
    @Override
    public Set<String> findPermissions(String username) {
        return userDao.findPermissions(username);
    }
}
