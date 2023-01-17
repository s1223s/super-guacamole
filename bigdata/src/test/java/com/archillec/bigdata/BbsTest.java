package com.archillec.bigdata;

import com.archillec.bigdata.entity.BbsEntity;
import com.archillec.bigdata.mapper.BbsMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BbsTest {
    @Autowired
    private BbsMapper bbsMapper;

    @Test
    public void testsql(){
        System.out.print("---------start test--------");
        List<BbsEntity> List = bbsMapper.selectList(null);
        List.forEach(System.out::println);
    }
}
