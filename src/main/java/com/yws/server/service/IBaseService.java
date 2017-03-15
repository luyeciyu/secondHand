package com.yws.server.service;

import java.util.List;

/**
 * Created by yangweisen on 2017/3/14.
 */
public interface IBaseService<T> {
    T selectByPrimaryKey(T dto);
    List<T> selectAll();
    List<T> select(T dto);
    Integer insert(T dto);
    Integer insertSelective(T dto);
    Integer update(T dto);
    Integer updateSelective(T dto);
    Integer delete(T dto);
    Integer delete(Class<T> clazz,List<Object> values);
}
