package biyesheji;

import biyesheji.domain.Jurisdiction;
import biyesheji.domain.User;
import biyesheji.mapper.AdminMapper;
import biyesheji.service.AdministrationRepository;
import com.alibaba.druid.sql.visitor.functions.Char;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private   AdminMapper mapper;
    @Test
    void contextLoads() {
//        PageInfo<User> allUserByPage = administrationRepository.findAllUserByPage(1, 5);
//        System.out.println(allUserByPage);
//        PageInfo<User> allUserByPage = administrationRepository.findAllUserByPage(1, 1);
//        System.out.println(allUserByPage);
//        User user=new User();
//        user.setPassword("321");
//        user.setUsername("321");
//
//        administrationRepository.saveOrUpdate(user);
//        String password = "123456";
//        String hashed = BCrypt.hashpw(password, BCrypt.gensalt());
//        System.out.println(hashed);
//        // the work factor is 2**log_rounds, and the default is 10
//        String hashed2 = BCrypt.hashpw(password, BCrypt.gensalt(12));
//
//        // Check that an unencrypted password matches one that has
//        // previously been hashed
//        String candidate = "123456";
//        //String candidate = "wrongtestpassword";
//        if (BCrypt.checkpw(candidate, hashed))
//
//        else
//        System.out.println("It does not match");
//        List<User> shitou = mapper.findByUsername("shitou");
//        for (User user : shitou) {
//            System.out.println(user);
//        }
    }
   // $2a$10$HNfTfH3aMFTeCWNTpPfYe.KkJzWxYYMw2VDV2ULl9PCal6qVsJwfO
}
