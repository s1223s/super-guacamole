package com.archillec.mmg;

import com.archillec.mmg.entity.Account;
import com.archillec.mmg.mapper.AccountMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

@SpringBootTest
@SpringBootApplication(scanBasePackages = {"com.archillec.common.config"})
//@Configuration(scanBasePackages = {"com.archillec.common.config"})
public class TestPage {

    @Autowired
    private AccountMapper accountMapper;
    @Test
    public void testpage(){
        Page<Account> page = new Page<>(1,2);
        Page<Account> page1 = accountMapper.selectPage(page,null);
        System.out.println(page.getRecords());
    }
}
