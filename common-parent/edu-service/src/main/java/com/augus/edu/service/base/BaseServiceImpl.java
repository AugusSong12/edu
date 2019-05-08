package com.augus.edu.service.base;

import com.augus.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements IBaseService<T>{

    @Autowired
    protected UserMapper userMapper;
}
