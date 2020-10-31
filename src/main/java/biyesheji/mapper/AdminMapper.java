package biyesheji.mapper;

import biyesheji.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    //查找全部
    List<User> findAll();
    //由id删除
    Integer DeleteById(Integer id);
    //插入一条数据
    Integer InsertData(User user);
    //修改一条数据
    Integer updateUser(User user);
    //由id查找
    User findById(Integer id);
    //根据用户名查找
    User findByUsername(String username);
}
