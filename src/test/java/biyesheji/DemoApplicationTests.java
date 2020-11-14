package biyesheji;

import biyesheji.mapper.AdminMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private   AdminMapper mapper;
    @Test
    void contextLoads() {
        BCryptPasswordEncoder bcp = new BCryptPasswordEncoder();
        String mm_pub = "123456";
        String mm_encode = bcp.encode(mm_pub);
        System.out.println(mm_encode);
        //bcp.matches(mm_pub,mm_encode)，第一个参数是前端传递过来的明文密码，如123456，第二个参数是添加用户时存储的密码
        if(bcp.matches(mm_pub,mm_encode)){
            System.out.println("密码校验成功");
        }else {
            System.out.println("密码错误");
        }
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
