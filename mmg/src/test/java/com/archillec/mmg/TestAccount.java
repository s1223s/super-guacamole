package com.archillec.mmg;

import com.archillec.mmg.entity.Account;
import com.archillec.mmg.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
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

    @Test
    public void testinstall(){
        Account account = new Account();
        account.setNickName("哈哈");
        account.setPhone("13768394785");
        account.setAddress("测试地址");

        int insert = accountMapper.insert(account);

        System.out.println("result=" + insert);
        System.out.println("id=" + account.getId());
    }

    @Test
    public void testdel(){
//        Account account =new Account();
        int i = accountMapper.deleteById(1);
        System.out.println(i);
    }
    @Test

    public void testupdate(){
        Account account = new Account();
        account.setId(2);
        account.setNickName("哈哈");
        account.setPhone("13768394784");
        account.setGender(true);

        int insert = accountMapper.updateById(account);

        System.out.println("result=" + insert);
    }

    @Test
    public void testselect(){
//        List<Long> list = Arrays.asList(2L,3L);
//        List<Account> accounts = accountMapper.selectBatchIds(list);

        HashMap<String, Object> map = new HashMap<>();
        map.put("nick_name","哈哈");
        map.put("phone","13768394784");
        List<Account> accounts = accountMapper.selectByMap(map);
        accounts.forEach(System.out::println);
    }
}
