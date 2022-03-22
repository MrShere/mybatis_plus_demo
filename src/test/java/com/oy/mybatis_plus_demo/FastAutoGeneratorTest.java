package com.oy.mybatis_plus_demo;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * Date:2022/2/15
 * Author:ybc
 * Description:
 */
public class FastAutoGeneratorTest {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/mybatis_plus?characterEncoding=utf-8&userSSL=false", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("oy") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D://mybatis_plus_fast_generator"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.oy") // 设置父包名
                            .moduleName("mybatis_plus_demo") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D://mybatis_plus_fast_generator")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("t_user") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

}
