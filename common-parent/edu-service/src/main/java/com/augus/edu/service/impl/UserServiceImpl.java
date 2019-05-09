package com.augus.edu.service.impl;

import com.augus.edu.model.User;
import com.augus.edu.model.UserExample;
import com.augus.edu.service.IUserService;
import com.augus.edu.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
    @Override
    public User login(String username, String password) {
        return userMapper.findUserByNameAndPwd(username,password);
    }

    @Override
    public User findById(String id) {
        User user = userMapper.selectByPrimaryKey(id);
        System.out.println(user);
        return null;
    }

    @Override
    public User findByUUId(String id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUUId(String id) {

    }

    @Override
    public void save(User entity) {

    }

    @Override
    public void update(User entity) {

    }
}
