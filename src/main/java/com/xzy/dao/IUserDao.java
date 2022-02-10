package com.xzy.dao;

import com.xzy.domain.User;

import java.util.List;

/*
*用户的持久层接口
 */
public interface IUserDao {
    /*
     *查询所有用户信息
     */
    List<User> findAll();
}
