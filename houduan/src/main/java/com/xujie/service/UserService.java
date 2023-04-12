package com.xujie.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xujie.entity.User;
import com.xujie.utils.QueryDTO;

import java.util.List;

public interface UserService {
    public IPage<User> selectUserPage(QueryDTO queryDTO);
    public Integer addUser(User user);
    public Integer updateUser(User user);
    public Integer deleteUser(Integer id);
    public void batchDelete(List<Integer> ids);



}
