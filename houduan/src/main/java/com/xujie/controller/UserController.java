package com.xujie.controller;

import com.xujie.entity.User;
import com.xujie.service.UserService;
import com.xujie.utils.QueryDTO;
import com.xujie.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description 用户管理
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 分页查询
     * @param queryDTO
     * @return
     */
    @PostMapping("/api/user/list")
    public Result userList(@RequestBody QueryDTO queryDTO){
        return new Result(200,"",userService.selectUserPage(queryDTO));
    }

    /**
     * 添加
     * @param user
     * @return
     */
    @PostMapping("/api/user/add")
    public Result addUser(@RequestBody User user){
        return new Result(200,"",userService.addUser(user));
    }

    /**
     * 更新
     * @param user
     * @return
     */
    @PostMapping("/api/user/update")
    public Result updateUser(@RequestBody User user){
        return new Result(200,"",userService.updateUser(user));
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @PostMapping("/api/user/delete")
    public Result deleteUser(Integer id){
        return new Result(200,"",userService.deleteUser(id));
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @PostMapping("/api/user/delete/batch")
    public Result batchDeleteUser(@RequestBody List<Integer> ids){
        userService.batchDelete(ids);
        return new Result(200,"","");
    }
}