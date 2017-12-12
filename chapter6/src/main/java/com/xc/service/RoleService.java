package com.xc.service;

import com.xc.entity.Role;

/**
 * Created by Administrator on 2015/11/10.
 */
public interface RoleService {

     Role createRole(Role role);
     void deleteRole(Long roleId);

    /**
     * 添加角色-权限之间关系
     * @param roleId
     * @param permissionIds
     */
     void correlationPermissions(Long roleId, Long... permissionIds);

    /**
     * 移除角色-权限之间关系
     * @param roleId
     * @param permissionIds
     */
     void uncorrelationPermissions(Long roleId, Long... permissionIds);
}
