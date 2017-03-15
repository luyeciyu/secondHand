package com.yws.server.service.impl;

import com.yws.server.dto.User;
import com.yws.server.mapper.UserMapper;
import com.yws.server.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yangweisen on 2017/3/14.
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }
}
