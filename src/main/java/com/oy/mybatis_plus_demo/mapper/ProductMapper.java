package com.oy.mybatis_plus_demo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oy.mybatis_plus_demo.entity.Product;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface ProductMapper extends BaseMapper<Product> {


}
