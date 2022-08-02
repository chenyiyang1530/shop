package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2022-07-24
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
