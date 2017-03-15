package com.yws.server.service.impl;


import com.yws.server.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by yangweisen on 2017/3/14.
 */
@Service
public class BaseServiceImpl<T> implements IBaseService<T> {

    @Autowired
    private Mapper<T> mapper;

    /**
     * 根据id查询实体
     * @param dto
     * @return
     */
    @Override
    public T selectByPrimaryKey(T dto) {
        return mapper.selectByPrimaryKey(dto);
    }

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<T> selectAll() {
        return mapper.select(null);
    }

    /**
     * 条件查询
     * @param dto
     * @return
     */
    @Override
    public List<T> select(T dto) {
        return mapper.select(dto);
    }

    public List<T> select(Class<T> clazz, T dto) {
        Example example = new Example(clazz);
        example.createCriteria()
                .andCondition("firt_name like");
        return mapper.select(dto);
    }

    /**
     * 插入
     * @param dto
     * @return
     */
    @Override
    public Integer insert(T dto) {
        return mapper.insert(dto);
    }

    /**
     * 插入非空字段
     * @param dto
     * @return
     */
    @Override
    public Integer insertSelective(T dto) {
        return mapper.insertSelective(dto);
    }

    /**
     * 根据主键更新
     * @param dto
     * @return
     */
    @Override
    public Integer update(T dto) {
        return mapper.updateByPrimaryKeySelective(dto);
    }

    /**
     * 根据主键更新非空字段
     * @param dto
     * @return
     */
    @Override
    public Integer updateSelective(T dto) {
        return mapper.updateByPrimaryKeySelective(dto);
    }

    /**
     * 根据主键删除
     * @param dto
     * @return
     */
    @Override
    public Integer delete(T dto) {
        return mapper.deleteByPrimaryKey(dto);
    }

    /**
     * 批量删除
     * @param clazz
     * @param values
     * @return
     */
    @Override
    public Integer delete(Class<T> clazz, List<Object> values) {
        Example example = new Example(clazz);
        example.createCriteria().andIn("id", values);
        return mapper.deleteByExample(example);
    }
}
