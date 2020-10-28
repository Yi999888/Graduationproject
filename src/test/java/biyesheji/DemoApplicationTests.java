package biyesheji;

import biyesheji.domain.User;
import biyesheji.service.AdministrationRepository;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private AdministrationRepository administrationRepository;
    @Test
    void contextLoads() {
//        PageInfo<User> allUserByPage = administrationRepository.findAllUserByPage(1, 5);
//        System.out.println(allUserByPage);
//        PageInfo<User> allUserByPage = administrationRepository.findAllUserByPage(1, 1);
//        System.out.println(allUserByPage);
        User user=new User();
        user.setPassword("321");
        user.setUsername("321");

        administrationRepository.saveOrUpdate(user);
    }

}
