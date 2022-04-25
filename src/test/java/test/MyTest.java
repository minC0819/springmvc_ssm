package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssm.pojo.User;
import ssm.service.UserService;

import java.util.List;

/**
 * @Author: cm
 * @Description:
 * @DateTime: 2022/4/22 16:21
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext_mapper.xml",
"classpath:applicationContext_service.xml"})
public class MyTest {

    @Autowired
    UserService userService;

    @Test
    public void testSelectUserPage(){
        List<User> list = userService.selectUserPage(null,null,0);
        list.forEach(user -> System.out.println(user));
    }

    @Test
    public void testDeleteUserById(){
        int num = userService.deleteUserById("15968162087363060");
        System.out.println(num));
    }

    @Test
    public void testGetRowCount(){
        int num = userService.getRowCount(null,null);
        System.out.println(num);
    }

}
