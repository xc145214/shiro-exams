package com.xc.shiro.chapter12.dao;


import com.xc.shiro.chapter12.entity.Permission;

/**
 *
 * @author xiachuan at 2017/12/13 22:26。
 */

public interface PermissionDao {

    Permission createPermission(Permission permission);

     void deletePermission(Long permissionId);
}

