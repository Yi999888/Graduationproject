package biyesheji.service;

import biyesheji.domain.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface AdministrationRepository {
    //创建或者修改用户
    User saveOrUpdate(User user);
    //分页功能
    PageInfo<User> findAllUserByPage(Integer pageNum, Integer count);
    //删除
    void deleteById(Integer id);
    //根据id查询
    User getUserById(Integer id);
    //获取用户列表
    List<User> list();
    //根据用户名查找用户
    User getByUsername(String username);
}
