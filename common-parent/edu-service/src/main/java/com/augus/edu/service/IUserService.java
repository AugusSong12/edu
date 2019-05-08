package com.augus.edu.service;

import com.augus.edu.model.User;
import com.augus.edu.service.base.IBaseService;

public interface IUserService extends IBaseService<User> {

    //特有的方法
    public User login(String username,String password);

}
