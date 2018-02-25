package com.lc.system.service;

import com.lc.entity.User;

/**
 * Created by lc on 16-2-14.
 */
public interface AccountBiz {

    public User findByIdAndPassword(String username, String password);

    public void updatePassword(String id, String password);
}
