package com.archillec.mmg;

import com.archillec.mmg.service.IAccountService;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestMybatisplusService {

    private IAccountService iAccountService;

    public void testservice(){
        long count = iAccountService.count();
    }
}
