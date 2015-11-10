package com.xc.dao;

import com.xc.entity.Role;

/**
 * Created by Administrator on 2015/11/10.
 */
public interface RoleDao {

    public Role createRole(Role role);
    public void deleteRole(Long roleId);

    public void correlationPermissions(Long roleId, Long... permissionIds);
    public void uncorrelationPermissions(Long roleId, Long... permissionIds);
}
