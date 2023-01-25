package com.archillec.bigdata.controller;

import com.archillec.bigdata.entity.BbsEntity;
import com.archillec.bigdata.mapper.BbsMapper;
import com.archillec.common.api.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import java.util.List;

@RequestMapping("/qin")
@Controller
public class ArchilecController {

    @Autowired
    private BbsMapper bbsMapper;
    @RequestMapping("/test")
    @ResponseBody
    public CommonResult<List<BbsEntity>> test(){
        List<BbsEntity> list = bbsMapper.selectList(null);
        System.out.println("-----测试------");

        return CommonResult.success(list,"测试信息");
//        return list;
    }


}
