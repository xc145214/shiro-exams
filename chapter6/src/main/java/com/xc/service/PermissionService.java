package com.xc.service;

import com.xc.entity.Permission;

/**
 * Created by Administrator on 2015/11/10.
 */
public interface PermissionService {
    public Permission createPermission(Permission permission);
    public void deletePermission(Long permissionId);
}
