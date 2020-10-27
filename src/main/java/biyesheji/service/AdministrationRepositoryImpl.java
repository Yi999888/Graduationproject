package biyesheji.service;

import biyesheji.domain.User;
import biyesheji.mapper.AdminMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
@Repository
public class AdministrationRepositoryImpl implements AdministrationRepository {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public User saveOrUpdate(User user) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd");
        user.setCreated(date.format(formatter));
        if (user.getId()==null){
            adminMapper.InsertData(user);
        }else {
            adminMapper.updateUser(user);
        }
        return user;
    }

    @Override
    public PageInfo<User> findAllUserByPage(Integer pageNum, Integer count) {
        PageHelper.startPage(pageNum,count);
        List<User> customers= adminMapper.findAll();
        PageInfo<User> pageInfo=new PageInfo<>(customers);
        return pageInfo;
    }

    @Override
    public void deleteById(Integer id) {
        adminMapper.DeleteById(id);
    }

    @Override
    public User getUserById(Integer id) {
        return adminMapper.findById(id);
    }

    @Override
    public List<User> list() {
        return adminMapper.findAll();
    }
}
