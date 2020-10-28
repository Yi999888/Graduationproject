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
    //注册与更新
    @Override
    public User saveOrUpdate(User user) {
        //获取本地日期
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd");
        //判断ID为空就是注册否则更新
        if (user.getId()==null){
            user.setValid((long) 1);//默认权限为1；
            user.setCreated(date.format(formatter));//默认为本地日期
            adminMapper.InsertData(user);//数据库插入一条数据
        }else {
            adminMapper.updateUser(user);//更新一条数据
        }
        return user;
    }
    //分页功能
    @Override
    public PageInfo<User> findAllUserByPage(Integer pageNum, Integer count) {
        PageHelper.startPage(pageNum,count);
        List<User> customers= adminMapper.findAll();
        PageInfo<User> pageInfo=new PageInfo<>(customers);
        return pageInfo;
    }
    //根据ID删除
    @Override
    public void deleteById(Integer id) {
        adminMapper.DeleteById(id);
    }
    //根据ID查找
    @Override
    public User getUserById(Integer id) {
        return adminMapper.findById(id);
    }
    //查找全部
    @Override
    public List<User> list() {
        return adminMapper.findAll();
    }
}
