package com.xujie.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xujie.entity.User;
import com.xujie.mapper.UserMapper;
import com.xujie.service.UserService;
import com.xujie.utils.QueryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 三分恶
 * @Date 2021/1/23
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 分页查询
     **/
    @Override
    public IPage<User> selectUserPage(QueryDTO queryDTO) {
        Page<User> page = new Page<>(queryDTO.getPageNo(), queryDTO.getPageSize());
        return userMapper.selectUserPage(page, queryDTO.getKeyword());
    }

    @Override
    public Integer addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public Integer updateUser(User user) {
        return userMapper.updateById(user);
    }

    @Override
    public Integer deleteUser(Integer id) {
        return userMapper.deleteById(id);
    }

    @Override
    public void batchDelete(List<Integer> ids) {
        userMapper.deleteBatchIds(ids);
    }

}