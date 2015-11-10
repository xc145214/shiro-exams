package com.xc.service;

import com.xc.dao.PermissionDao;
import com.xc.dao.PermissionDaoImpl;
import com.xc.entity.Permission;

/**
 * Created by Administrator on 2015/11/10.
 */
public class PermissionServiceImpl implements PermissionService {
    private PermissionDao permissionDao = new PermissionDaoImpl();

    public Permission createPermission(Permission permission) {
        return permissionDao.createPermission(permission);
    }

    public void deletePermission(Long permissionId) {
        permissionDao.deletePermission(permissionId);
    }
}
