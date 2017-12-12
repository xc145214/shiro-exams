package com.xc.service;

import com.xc.dao.RoleDao;
import com.xc.dao.RoleDaoImpl;
import com.xc.entity.Role;

/**
 * Created by Administrator on 2015/11/10.
 */
public class RoleServiceImpl implements RoleService {

    private RoleDao roleDao = new RoleDaoImpl();


    @Override
    public Role createRole(Role role) {
        return roleDao.createRole(role);
    }

    @Override
    public void deleteRole(Long roleId) {
        roleDao.deleteRole(roleId);
    }

    /**
     * 添加角色-权限之间关系
     * @param roleId
     * @param permissionIds
     */
    @Override
    public void correlationPermissions(Long roleId, Long... permissionIds) {
        roleDao.correlationPermissions(roleId, permissionIds);
    }

    /**
     * 移除角色-权限之间关系
     * @param roleId
     * @param permissionIds
     */
    @Override
    public void uncorrelationPermissions(Long roleId, Long... permissionIds) {
        roleDao.uncorrelationPermissions(roleId, permissionIds);
    }

}
