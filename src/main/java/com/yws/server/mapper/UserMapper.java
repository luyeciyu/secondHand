package com.yws.server.mapper;


import com.yws.server.dto.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by yangweisen on 2017/3/14.
 */
public interface UserMapper extends Mapper<User>{
    User selectById(Integer id);
}
