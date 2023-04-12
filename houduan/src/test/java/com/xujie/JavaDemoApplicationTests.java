package com.xujie;

import com.xujie.entity.User;
import com.xujie.mapper.UserMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JavaDemoApplicationTests {
    @Autowired
    private UserMapper userMapper;


    @Test
    @DisplayName("插入数据")
    public void testInsert() {
        User user = new User("test01", "test", "t123", "nan1", "test1@qq.com", "徐杰");
        int id = userMapper.insert(user);
        System.out.println(id);
    }

    @Test
    @DisplayName("id查找数据")
    public void testSelectById() {
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    @Test
    @DisplayName("查找所有")
    public void testSelectAll() {
        List userList = userMapper.selectObjs(null);
        System.out.println(userList.size());
    }


    @Test
    @DisplayName("更新数据")
    public void testUpdate() {
        User user = new User();
        user.setId(2);
        user.setAddress("沂水县");
        int id = userMapper.updateById(user);
        System.out.println(id);
    }

    @Test
    @DisplayName("删除数据")
    public void testDelete() {
        int id = userMapper.deleteById(2);
    }


}
