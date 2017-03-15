package com.yws.server.service;

import com.yws.server.dto.User;

/**
 * Created by yangweisen on 2017/3/14.
 */
public interface IUserService extends IBaseService<User> {
    User selectById(Integer id);
}
