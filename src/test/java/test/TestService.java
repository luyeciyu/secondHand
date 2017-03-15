package test;
import com.yws.server.dto.User;
import com.yws.server.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by yangweisen on 2017/3/14.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")
public class TestService {
    @Autowired
    IUserService userService;

    @Test
    public void textSelectByPrimaryKey(){

    }

    @Test
    public void textSelectAll(){
        List<User> users = userService.selectAll();
        for (User u : users){
            System.out.println(u);
        }
    }

    @Test
    public void textSelect(){

    }

    @Test
    public void textInsert(){
        User user = new User();
        user.setEmail("23465@qq.com").setNickName("343").setUserName("张三").setPassword("23456");
        int count = userService.insert(user);
        System.out.println(user);
        System.out.println(count);
    }

    @Test
    public void textSelectById(){

    }



}
