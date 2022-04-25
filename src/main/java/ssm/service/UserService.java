package ssm.service;

import ssm.pojo.User;

import java.util.List;

/**
 * @Author: cm
 * @Description:
 * @DateTime: 2022/4/22 16:00
 **/
public interface UserService {
    List<User> selectUserPage(String userName, String userSex, int startRow);

    int createUser(User user);

    int deleteUserById(String userId);

    int getRowCount(String userName, String userSex);
}
