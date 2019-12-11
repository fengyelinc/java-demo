
import com.example.demo.DemoApplication;

import com.example.demo.domain.Premission;
import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Date;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@WebAppConfiguration
public class test {

    @Autowired
    private UserMapper userMapper;


   @Test
    public void test() {
        User user = userMapper.findByUserName("cc");
        System.out.println(user);
    }

    @Test
    public void test2() {
        List<String> cc = userMapper.findPreMissionByUserName("cc");
        System.out.println(cc);
    }

    @Test
    public void test3() {
        User user = new User();
        user.setUsername("yy");
        user.setPassword("333");
        user.setCreateDate(new Date());
        user.setAccountNonExpired(true);
        user.setAccountNonLocked(true);
        user.setCredentialsNonExpired(true);
        user.setEnabled(true);
        userMapper.addUser(user);
    }

}




