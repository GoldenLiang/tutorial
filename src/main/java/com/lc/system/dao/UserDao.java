package com.lc.system.dao;

import com.lc.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lc on 16-2-9.
 */
public interface UserDao {
    public List<User> findAll();

    public User findById(String id);

    public void update(User user);

    public void add(User user);

    public void delete(String id);

    public User findByIdAndPassword(@Param("id") String username, @Param("password") String password);

    public void updatePassword(@Param("userId") String id, @Param("password") String password);

    User findByUsername(String username);
}
