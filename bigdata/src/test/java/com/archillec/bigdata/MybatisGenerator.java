package com.archillec.bigdata;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

@SpringBootTest

public class MybatisGenerator {
    @Test
    public void test(){
        System.out.println("------genertor start-----");
        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/jx_MmgDev", "root", "qinjiajun1103")
                .globalConfig(builder -> {
                    builder.author("Archillec") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("/Users/qinjiajun/Java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.archillec") // 设置父包名
                            .moduleName("mmg") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "/Users/qinjiajun/Java")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("jx_account") // 设置需要生成的表名
                            .addTablePrefix("jx_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
