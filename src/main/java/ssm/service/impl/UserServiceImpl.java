package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ssm.mapper.UserMapper;
import ssm.pojo.User;
import ssm.service.UserService;

import java.util.List;

/**
 * @Author: cm
 * @Description:
 * @DateTime: 2022/4/22 16:15
 **/
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectUserPage(String userName, String userSex, int startRow) {
        return userMapper.selectUserPage(userName,userSex,startRow);
    }

    @Override
    public int createUser(User user) {
        return userMapper.createUser(user);
    }

    @Override
    public int deleteUserById(String userId) {
        return userMapper.deleteUserById(userId);
    }

    @Override
    public int getRowCount(String userName, String userSex) {
        return userMapper.getRowCount(userName, userSex);
    }
}
