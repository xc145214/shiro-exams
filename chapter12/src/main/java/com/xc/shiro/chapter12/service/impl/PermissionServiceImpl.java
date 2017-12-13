package com.xc.shiro.chapter12.service.impl;


import com.xc.shiro.chapter12.dao.PermissionDao;
import com.xc.shiro.chapter12.dao.impl.PermissionDaoImpl;
import com.xc.shiro.chapter12.entity.Permission;
import com.xc.shiro.chapter12.service.PermissionService;

/**
 * XXXXXXXXXXXXXXXXXXXXX
 *
 * @author xiachuan at 2017/12/13 22:47。
 */

public class PermissionServiceImpl implements PermissionService {
    private PermissionDao permissionDao;

    public void setPermissionDao(PermissionDao permissionDao) {
        this.permissionDao = permissionDao;
    }

    @Override
    public Permission createPermission(Permission permission) {
        return permissionDao.createPermission(permission);
    }

    @Override
    public void deletePermission(Long permissionId) {
        permissionDao.deletePermission(permissionId);
    }
}

