package com.lc.system.service.impl;

import com.lc.entity.User;
import com.lc.system.dao.UserDao;
import com.lc.system.service.AccountBiz;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lc on 16-2-14.
 */
@Service
public class AccountBizImpl implements AccountBiz {

    @Resource
    UserDao userDao;

    @Override
    public User findByIdAndPassword(String username, String password) {
        return userDao.findByIdAndPassword(username, password);
    }


    @Override
    public void updatePassword(String id, String password) {
        userDao.updatePassword(id, password);
    }
}
