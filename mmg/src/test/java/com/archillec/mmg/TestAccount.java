package com.archillec.mmg;

import com.archillec.mmg.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest

public class TestAccount {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void getAccountinfo(){
//        System.out.printf("-----测试------");
        List list = accountMapper.selectList(null);
        list.forEach(System.out::println);
    }

}
