package com.xc.service;

import com.xc.entity.Permission;

/**
 * Created by Administrator on 2015/11/10.
 */
public interface PermissionService {
     Permission createPermission(Permission permission);
     void deletePermission(Long permissionId);
}
