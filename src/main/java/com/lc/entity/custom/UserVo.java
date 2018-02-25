package com.lc.entity.custom;

import com.lc.entity.User;

/**
 * Created by lc on 16-2-21.
 */
public class UserVo extends User {
    String roleIdsStr;

    @Override
    public String getRoleIdsStr() {
        return roleIdsStr;
    }

    @Override
    public void setRoleIdsStr(String roleIdsStr) {
        this.roleIdsStr = roleIdsStr;
    }
}
