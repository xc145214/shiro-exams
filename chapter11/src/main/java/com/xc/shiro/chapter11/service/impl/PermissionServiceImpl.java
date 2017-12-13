package com.xc.shiro.chapter11.service.impl;

import com.xc.shiro.chapter11.dao.PermissionDao;
import com.xc.shiro.chapter11.dao.impl.PermissionDaoImpl;
import com.xc.shiro.chapter11.entity.Permission;
import com.xc.shiro.chapter11.service.PermissionService;

/**
 * XXXXXXXXXXXXXXXXXXXXX
 *
 * @author xiachuan at 2017/12/13 22:47。
 */

public class PermissionServiceImpl implements PermissionService {
    private PermissionDao permissionDao = new PermissionDaoImpl();
    @Override
    public Permission createPermission(Permission permission) {
        return permissionDao.createPermission(permission);
    }

    @Override
    public void deletePermission(Long permissionId) {
        permissionDao.deletePermission(permissionId);
    }
}

