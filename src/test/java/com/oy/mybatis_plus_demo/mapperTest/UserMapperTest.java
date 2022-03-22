package com.oy.mybatis_plus_demo.mapperTest;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.oy.mybatis_plus_demo.entity.User;
import com.oy.mybatis_plus_demo.enums.SexEnum;
import com.oy.mybatis_plus_demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList(){
        System.out.println(("----- selectAll method test ------"));
        //selectList()根据MP内置的条件构造器查询一个list集合，null表示没有条件，即查询所有
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    @Test
    public void testInsert(){
/*        System.out.println(("----- Insert method test ------"));
        User user = new User(null, "王五", 23, "wangwu@atguigu.com",0);
        //INSERT INTO user ( id, name, age, email ) VALUES ( ?, ?, ?, ? )
        int result = userMapper.insert(user);
        System.out.println("受影响行数："+result);
        //1506092058551627778
        System.out.println("id自动获取："+user.getId());*/
    }

    @Test
    public void testDeleteById(){
        //通过id删除用户信息
        //DELETE FROM user WHERE id=?
        int result = userMapper.deleteById(1506092058551627778L);
        System.out.println("受影响行数："+result);
    }

    @Test
    public void testDeleteBatchIds(){
    //通过多个id批量删除
    //DELETE FROM user WHERE id IN ( ? , ? , ? )
        List<Long> idList = Arrays.asList(1L, 2L, 3L);
        int result = userMapper.deleteBatchIds(idList);
        System.out.println("受影响行数："+result);
    }

    @Test
    public void testDeleteByMap(){
        //根据map集合中所设置的条件删除记录
        //DELETE FROM user WHERE name = ? AND age = ?
        Map<String, Object> map = new HashMap<>();
        map.put("age", 23);
        map.put("name", "张三");
        int result = userMapper.deleteByMap(map);
        System.out.println("受影响行数："+result);
    }

    @Test
    public void testUpdateById(){
/*        User user = new User(4L, "admin", 22, null,0);
        //UPDATE user SET name=?, age=? WHERE id=?
        int result = userMapper.updateById(user);
        System.out.println("受影响行数："+result);*/
    }

    @Test
    public void testSelectById(){
        //根据id查询用户信息
        //SELECT id,name,age,email FROM user WHERE id=?
        User user = userMapper.selectById(4L);
        System.out.println(user);
    }

    @Test
    public void testSelectBatchIds(){
        //根据多个id查询多个用户信息
        //SELECT id,name,age,email FROM user WHERE id IN ( ? , ? )
        List<Long> idList = Arrays.asList(4L, 5L);
        List<User> list = userMapper.selectBatchIds(idList);
        list.forEach(System.out::println);
    }

    @Test
    public void testSelectByMap(){
        //通过map条件查询用户信息
        //SELECT id,name,age,email FROM user WHERE name = ? AND age = ?
        Map<String, Object> map = new HashMap<>();
        map.put("age", 28);
        map.put("name", "Tom");
        List<User> list = userMapper.selectByMap(map);
        list.forEach(System.out::println);
    }

    @Test
    public void testPage(){
        //设置分页参数
        Page<User> page = new Page<>(1, 5);
        userMapper.selectPage(page, null);
        //获取分页数据
        List<User> list = page.getRecords();
        list.forEach(System.out::println);
        System.out.println("当前页："+page.getCurrent());
        System.out.println("每页显示的条数："+page.getSize());
        System.out.println("总记录数："+page.getTotal());
        System.out.println("总页数："+page.getPages());
        System.out.println("是否有上一页："+page.hasPrevious());
        System.out.println("是否有下一页："+page.hasNext());
    }
    @Test
    public void testSelectPageVo(){
        //设置分页参数
        Page<User> page = new Page<>(1, 5);
        userMapper.selectPageVo(page, 20);
        //获取分页数据
        List<User> list = page.getRecords();
        list.forEach(System.out::println);
        System.out.println("当前页："+page.getCurrent());
        System.out.println("每页显示的条数："+page.getSize());
        System.out.println("总记录数："+page.getTotal());
        System.out.println("总页数："+page.getPages());
        System.out.println("是否有上一页："+page.hasPrevious());
        System.out.println("是否有下一页："+page.hasNext());
    }
    @Test
    public void testSexEnum(){
        User user = new User(null,"Enum",SexEnum.MALE,23,"oy@123.com",0);
        //设置性别信息为枚举项，会将@EnumValue注解所标识的属性值存储到数据库
        //INSERT INTO t_user ( name, age, sex ) VALUES ( ?, ?, ? )
        //Parameters: Enum(String), 20(Integer), 1(Integer)
        userMapper.insert(user);
    }




}
