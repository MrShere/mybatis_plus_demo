package com.oy.mybatis_plus_demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.oy.mybatis_plus_demo.enums.SexEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_user")
public class User {
    @TableId
    private Long id;
    @TableField("name")
    private String name;
    private SexEnum sex;
    private Integer age;
    private String email;
    @TableLogic
    private Integer isDeleted;

}
